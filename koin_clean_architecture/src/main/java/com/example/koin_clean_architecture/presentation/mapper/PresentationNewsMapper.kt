package com.example.koin_clean_architecture.data.mapper

import com.example.gleonardo.newssportspaginglibrary.data.model.DomainNews
import com.example.gleonardo.newssportspaginglibrary.data.model.PresentationNews

object PresentationNewsMapper : BaseMapper<DomainNews, PresentationNews>() {
    override fun transformFrom(source: DomainNews?): PresentationNews? {
        return PresentationNews(
                source = PresentationSourceMapper.transformFrom(source?.source),
                author = source?.author,
                title = source?.title,
                description = source?.description,
                url = source?.url,
                image = source?.image,
                publishedAt = source?.publishedAt,
                content = source?.content
        )
    }

    override fun transformFor(source: PresentationNews?): DomainNews? {
        return DomainNews(
                source = PresentationSourceMapper.transformFor(source?.source),
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