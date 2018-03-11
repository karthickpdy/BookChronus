package com.bookchronus.karthickpdy.bookchronus.presentation.presenters.impl

import com.bookchronus.karthickpdy.bookchronus.presentation.presenters.AddNewBookPresenter

/**
 * Created by RV on 18/11/17.
 */
class AddBookPresenterImplementation(val view: AddNewBookPresenter.View) : AddNewBookPresenter {

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

    override fun onSubmitBookEntryClicked() {
        view?.submitBookEntry()
    }
}
