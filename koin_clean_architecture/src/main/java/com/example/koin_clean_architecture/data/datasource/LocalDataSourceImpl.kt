package com.example.koin_clean_architecture.data.datasource

import com.example.gleonardo.newssportspaginglibrary.data.model.News
import com.example.gleonardo.newssportspaginglibrary.data.model.Response
import com.example.koin_clean_architecture.data.model.Source
import io.reactivex.Single

class LocalDataSourceImpl() : LocaDataSource {

    private val response = Response(
            news = mutableListOf(
                    News(
                            source = Source(
                                    id = "123",
                                    name = "sports"
                            ),
                            author = null,
                            title = "xoxomidia",
                            description = null,
                            url = null,
                            image = null,
                            publishedAt = null,
                            content = null
                    ),
                    News(
                            source = Source(
                                    id = "123",
                                    name = "sports"
                            ),
                            author = null,
                            title = "xoxomidia",
                            description = null,
                            url = null,
                            image = null,
                            publishedAt = null,
                            content = null
                    ),
                    News(
                            source = Source(
                                    id = "123",
                                    name = "sports"
                            ),
                            author = null,
                            title = "xoxomidia",
                            description = null,
                            url = null,
                            image = null,
                            publishedAt = null,
                            content = null
                    ),
                    News(
                            source = Source(
                                    id = "123",
                                    name = "sports"
                            ),
                            author = null,
                            title = "xoxomidia",
                            description = null,
                            url = null,
                            image = null,
                            publishedAt = null,
                            content = null
                    ),
                    News(
                            source = Source(
                                    id = "123",
                                    name = "sports"
                            ),
                            author = null,
                            title = "xoxomidia",
                            description = null,
                            url = null,
                            image = null,
                            publishedAt = null,
                            content = null
                    ),
                    News(
                            source = Source(
                                    id = "123",
                                    name = "sports"
                            ),
                            author = null,
                            title = "xoxomidia",
                            description = null,
                            url = null,
                            image = null,
                            publishedAt = null,
                            content = null
                    ),
                    News(
                            source = Source(
                                    id = "123",
                                    name = "sports"
                            ),
                            author = null,
                            title = "xoxomidia",
                            description = null,
                            url = null,
                            image = null,
                            publishedAt = null,
                            content = null
                    ),
                    News(
                    source = Source(
                            id = "123",
                            name = "sports"
                    ),
                    author = null,
                    title = "xoxomidia",
                    description = null,
                    url = null,
                    image = null,
                    publishedAt = null,
                    content = null
            )
            )
    )

    override fun getNews(): Single<Response> {
        return Single.just(response)
    }
}