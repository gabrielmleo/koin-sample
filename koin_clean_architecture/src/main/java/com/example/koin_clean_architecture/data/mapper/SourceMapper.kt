package com.example.koin_clean_architecture.data.mapper

import com.example.koin_clean_architecture.data.model.DomainSource
import com.example.koin_clean_architecture.data.model.Source

object SourceMapper : BaseMapper<Source, DomainSource>() {
    override fun transformFrom(source: Source): DomainSource {
        return DomainSource(
                id = source.id,
                name = source.name
        )
    }

    override fun transformFor(source: DomainSource): Source {
        return Source(
                id = source.id,
                name = source.name
        )
    }
}