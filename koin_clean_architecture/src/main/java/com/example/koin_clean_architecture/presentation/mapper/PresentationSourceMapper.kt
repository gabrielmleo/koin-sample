package com.example.koin_clean_architecture.data.mapper

import com.example.koin_clean_architecture.data.model.DomainSource
import com.example.koin_clean_architecture.data.model.PresentationSource
import com.example.koin_clean_architecture.data.model.Source

object PresentationSourceMapper : BaseMapper<DomainSource, PresentationSource>() {
    override fun transformFrom(source: DomainSource?): PresentationSource? {
        return PresentationSource(
                id = source?.id,
                name = source?.name
        )
    }

    override fun transformFor(source: PresentationSource?): DomainSource? {
        return DomainSource(
                id = source?.id,
                name = source?.name
        )
    }
}