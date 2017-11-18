package com.bookchronus.karthickpdy.bookchronus.presentation.books.presenter

import com.bookchronus.karthickpdy.bookchronus.presentation.Presenter
import com.bookchronus.karthickpdy.bookchronus.presentation.books.view.BookListView

/**
 * Created by Jyoti on 08/07/17.
 */

interface BookListPresenter : Presenter<BookListView> {
    fun loadBookList()
    fun onAddNewBookFabClicked();
}