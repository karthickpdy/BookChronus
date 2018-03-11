package com.bookchronus.karthickpdy.bookchronus.presentation.presenters

import com.bookchronus.karthickpdy.bookchronus.presentation.ui.BaseView

/**
 * Created by Jyoti on 08/07/17.
 */

interface BookListPresenter : BasePresenter {

    interface View : BaseView {

        fun openAddNewBookEntryPage()

    }

    fun loadBookList()

    fun onAddNewBookFabClicked()
}