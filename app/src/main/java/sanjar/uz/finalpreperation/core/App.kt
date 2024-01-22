package sanjar.uz.finalpreperation.core

import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AppCache.init(this)
    }
}