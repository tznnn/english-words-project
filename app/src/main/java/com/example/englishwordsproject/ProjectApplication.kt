package com.example.englishwordsproject

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ProjectApplication : Application() {
    companion object {
        lateinit var instance: ProjectApplication
            private set

        fun isInstanceInitialized() = ::instance.isInitialized
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}