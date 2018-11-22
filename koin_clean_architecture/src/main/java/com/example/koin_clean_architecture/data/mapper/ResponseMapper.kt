package com.example.koin_clean_architecture.data.mapper

import com.example.gleonardo.newssportspaginglibrary.data.model.DomainNews
import com.example.gleonardo.newssportspaginglibrary.data.model.DomainResponse
import com.example.gleonardo.newssportspaginglibrary.data.model.News
import com.example.gleonardo.newssportspaginglibrary.data.model.Response

object ResponseMapper : BaseMapper<Response, DomainResponse>() {
    override fun transformFrom(source: Response?): DomainResponse? {
        var transformedList = mutableListOf<DomainNews?>()
        source?.news?.forEach {
            transformedList.add(NewsMapper.transformFrom(it))
        }
        return DomainResponse(
                news = transformedList
        )
    }

    override fun transformFor(source: DomainResponse?): Response? {
        var transformedList = mutableListOf<News?>()
        source?.news?.forEach {
            transformedList.add(NewsMapper.transformFor(it))
        }
        return Response(
                news = transformedList
        )
    }
}