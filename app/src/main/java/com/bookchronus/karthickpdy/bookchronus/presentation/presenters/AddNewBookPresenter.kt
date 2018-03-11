package com.bookchronus.karthickpdy.bookchronus.presentation.presenters

import com.bookchronus.karthickpdy.bookchronus.presentation.presenters.BasePresenter
import com.bookchronus.karthickpdy.bookchronus.presentation.ui.BaseView

/**
 * Created by RV on 18/11/17.
 */
interface AddNewBookPresenter : BasePresenter {

    interface View : BaseView {

        fun submitBookEntry()

    }

    fun onSubmitBookEntryClicked()
}