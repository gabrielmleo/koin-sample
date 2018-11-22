package com.example.koin_clean_architecture.data.mapper

import com.example.gleonardo.newssportspaginglibrary.data.model.DomainNews
import com.example.gleonardo.newssportspaginglibrary.data.model.News

object NewsMapper : BaseMapper<News, DomainNews>() {
    override fun transformFrom(source: News?): DomainNews? {
        return DomainNews(
                source = SourceMapper.transformFrom(source?.source),
                author = source?.author,
                title = source?.title,
                description = source?.description,
                url = source?.url,
                image = source?.image,
                publishedAt = source?.publishedAt,
                content = source?.content
        )
    }

    override fun transformFor(source: DomainNews?): News? {
        return News(
                source = SourceMapper.transformFor(source?.source),
                author = source?.author,
                title = source?.title,
                description = source?.description,
                url = source?.url,
                image = source?.image,
                publishedAt = source?.publishedAt,
                content = source?.content
        )
    }
}