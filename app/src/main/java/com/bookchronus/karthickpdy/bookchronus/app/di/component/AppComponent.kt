package com.bookchronus.karthickpdy.bookchronus.app.di.component

import com.bookchronus.karthickpdy.bookchronus.app.BookChronusApplication
import com.bookchronus.karthickpdy.bookchronus.app.di.module.AppModule
import com.bookchronus.karthickpdy.bookchronus.app.di.module.user.UserModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Jyoti on 08/07/17.
 */


@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent{
    // operator fun plus(userModule: UserModule): UserComponent
}


