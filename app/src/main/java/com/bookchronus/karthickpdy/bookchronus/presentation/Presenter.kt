package com.bookchronus.karthickpdy.bookchronus.presentation

/**
 * Created by Jyoti on 08/07/17.
 */
interface Presenter<T : BaseView> {
    fun onViewCreated(view: T)
    fun onViewDestroyed()
}