package com.bookchronus.karthickpdy.bookchronus.ui.books.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bookchronus.karthickpdy.bookchronus.R
import com.bookchronus.karthickpdy.bookchronus.presentation.books.presenter.AddNewBookPresenter
import com.bookchronus.karthickpdy.bookchronus.presentation.books.presenter.impl.AddBookPresenterImplementation
import com.bookchronus.karthickpdy.bookchronus.presentation.books.view.AddBookView
import kotlinx.android.synthetic.main.activity_add_new_book.*

/**
 * Created by RV on 18/11/17.
 */
class AddNewBookActivity : AppCompatActivity(), AddBookView {

    companion object {
        fun getIntent(context: Context): Intent {
            val ticketCreateIntent = Intent(context, AddNewBookActivity::class.java)
            return ticketCreateIntent
        }
    }

    internal var presenter: AddNewBookPresenter? = AddBookPresenterImplementation()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_new_book)
        setClickListeners()
    }

    override fun submitBookEntry() {
        presenter?.onSubmitBookEntryClicked()
    }

    override fun showAppError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showDBError(): Void {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun setClickListeners() {
        submit.setOnClickListener {
            //Add entry to db and setResult
        }
    }
}