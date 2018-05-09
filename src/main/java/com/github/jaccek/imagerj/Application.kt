package com.github.jaccek.imagerj

import tornadofx.App
import tornadofx.launch

class Application: App(MainView::class) {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch<Application>(args)
        }
    }
}
