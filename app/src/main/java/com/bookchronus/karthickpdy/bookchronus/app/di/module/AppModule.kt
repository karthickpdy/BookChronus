package com.bookchronus.karthickpdy.bookchronus.app.di.module

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.bookchronus.karthickpdy.bookchronus.app.BookChronusApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Jyoti on 08/07/17.
 */
@Module
class AppModule(private val app: Application) {
    @Singleton
    @Provides
    internal fun context(): Context {
        return app
    }


    @Singleton
    @Provides
    internal fun sharedPreferences(): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(app)
    }
}