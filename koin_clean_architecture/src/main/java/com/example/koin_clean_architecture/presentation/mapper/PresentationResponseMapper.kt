package com.example.koin_clean_architecture.data.mapper

import com.example.gleonardo.newssportspaginglibrary.data.model.DomainNews
import com.example.gleonardo.newssportspaginglibrary.data.model.DomainResponse
import com.example.gleonardo.newssportspaginglibrary.data.model.News
import com.example.gleonardo.newssportspaginglibrary.data.model.PresentationNews
import com.example.gleonardo.newssportspaginglibrary.data.model.PresentationResponse
import com.example.gleonardo.newssportspaginglibrary.data.model.Response

object PresentationResponseMapper : BaseMapper<DomainResponse, PresentationResponse>() {
    override fun transformFrom(source: DomainResponse?): PresentationResponse? {
        var transformedList = mutableListOf<PresentationNews?>()
        source?.news?.forEach {
            transformedList.add(PresentationNewsMapper.transformFrom(it))
        }
        return PresentationResponse(
                news = transformedList
        )
    }

    override fun transformFor(source: PresentationResponse?): DomainResponse? {
        var transformedList = mutableListOf<DomainNews?>()
        source?.news?.forEach {
            transformedList.add(PresentationNewsMapper.transformFor(it))
        }
        return DomainResponse(
                news = transformedList
        )
    }
}