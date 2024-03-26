package org.example

import org.koin.dsl.koinApplication

object LibraryApi {

    fun initKoin() {
        koinApplication { modules() }
    }
}
