package com.bookchronus.karthickpdy.bookchronus.presentation.books.presenter.impl

import com.bookchronus.karthickpdy.bookchronus.presentation.books.presenter.AddNewBookPresenter
import com.bookchronus.karthickpdy.bookchronus.presentation.books.view.AddBookView

/**
 * Created by RV on 18/11/17.
 */
class AddBookPresenterImplementation : AddNewBookPresenter{

    private var view: AddBookView? = null

    override fun onSubmitBookEntryClicked() {
        view?.submitBookEntry()
    }

    override fun onViewDestroyed(){
        this.view = null
    }

    override fun onViewCreated(view: AddBookView){
        this.view = view
    }
}
