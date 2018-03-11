package com.bookchronus.karthickpdy.bookchronus.presentation.ui.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bookchronus.karthickpdy.bookchronus.R
import com.bookchronus.karthickpdy.bookchronus.presentation.presenters.AddNewBookPresenter
import com.bookchronus.karthickpdy.bookchronus.presentation.presenters.impl.AddBookPresenterImplementation
import kotlinx.android.synthetic.main.activity_add_new_book.*

/**
 * Created by RV on 18/11/17.
 */
class AddNewBookActivity : AppCompatActivity(), AddNewBookPresenter.View {

    companion object {
        fun getIntent(context: Context): Intent {
            val ticketCreateIntent = Intent(context, AddNewBookActivity::class.java)
            return ticketCreateIntent
        }
    }

    internal var presenter: AddNewBookPresenter? = AddBookPresenterImplementation(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_new_book)
        setClickListeners()
    }

    private fun setClickListeners() {
        submit.setOnClickListener {
            //Add entry to db and setResult
        }
    }

    override fun showProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showSuccess(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun submitBookEntry() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}