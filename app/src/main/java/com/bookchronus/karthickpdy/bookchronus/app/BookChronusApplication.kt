package com.bookchronus.karthickpdy.bookchronus.app

import android.app.Application
import android.content.Context
import com.bookchronus.karthickpdy.bookchronus.app.di.component.AppComponent
import com.bookchronus.karthickpdy.bookchronus.app.di.component.DaggerAppComponent
import com.bookchronus.karthickpdy.bookchronus.app.di.module.AppModule

/**
 * Created by Jyoti on 08/07/17.
 */
class BookChronusApplication : Application() {
    private var appComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()

       //  Instantiate base component
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

    companion object {
        private val TAG = BookChronusApplication::class.java.name

        operator fun get(context: Context): BookChronusApplication {
            return context.applicationContext as BookChronusApplication
        }
    }
}