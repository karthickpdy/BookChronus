package com.bookchronus.karthickpdy.bookchronus.presentation.books.presenter

import com.bookchronus.karthickpdy.bookchronus.presentation.Presenter
import com.bookchronus.karthickpdy.bookchronus.presentation.books.view.AddBookView

/**
 * Created by RV on 18/11/17.
 */
interface AddNewBookPresenter : Presenter<AddBookView>{
    fun onSubmitBookEntryClicked();
}