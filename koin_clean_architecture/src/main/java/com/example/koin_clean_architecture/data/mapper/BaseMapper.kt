package com.example.koin_clean_architecture.data.mapper

abstract class BaseMapper<K,V> {
    abstract fun transformFrom(source: K?): V?
    abstract fun transformFor(source: V?): K?
}