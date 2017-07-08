package com.bookchronus.karthickpdy.bookchronus.presentation.books.presenter.impl

import com.bookchronus.karthickpdy.bookchronus.presentation.books.presenter.BookListPresenter
import com.bookchronus.karthickpdy.bookchronus.presentation.books.view.BookListView

/**
 * Created by Jyoti on 08/07/17.
 */

class BookListPresenterImplementation : BookListPresenter{


    private var view: BookListView? = null


    override fun loadBookList() {
        view?.showSuccessMessage()
    }

    override fun onViewDestroyed(){
        this.view = null
    }

    override fun onViewCreated(view: BookListView){
        this.view = view
    }

}