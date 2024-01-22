package sanjar.uz.final2024january.core

import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AppCache.init(this)
    }
}