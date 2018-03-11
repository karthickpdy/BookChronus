package com.bookchronus.karthickpdy.bookchronus.presentation.presenters.impl

import com.bookchronus.karthickpdy.bookchronus.presentation.presenters.BookListPresenter

/**
 * Created by Jyoti on 08/07/17.
 */

class BookListPresenterImplementation(val view: BookListPresenter.View) : BookListPresenter {

    override fun create() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun resume() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun pause() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun stop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun destroy() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun loadBookList() {
    }

    override fun onAddNewBookFabClicked() {
        view?.openAddNewBookEntryPage()
    }
}