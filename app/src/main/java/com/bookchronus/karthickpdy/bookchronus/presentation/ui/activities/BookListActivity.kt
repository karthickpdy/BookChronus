package com.bookchronus.karthickpdy.bookchronus.presentation.ui.activities
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.bookchronus.karthickpdy.bookchronus.R
import com.bookchronus.karthickpdy.bookchronus.presentation.presenters.BookListPresenter
import com.bookchronus.karthickpdy.bookchronus.presentation.presenters.impl.BookListPresenterImplementation
import kotlinx.android.synthetic.main.activity_book_list.*

class BookListActivity : AppCompatActivity(), BookListPresenter.View {

    internal var presenter: BookListPresenter? = BookListPresenterImplementation(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)
        setClickListeners()

        book_list.apply {
            layoutManager = LinearLayoutManager(context)
            //Set adapter here too
        }

        presenter!!.create()
        presenter!!.loadBookList()
    }

    override fun onDestroy() {
        presenter?.destroy()
        super.onDestroy()
    }


    override fun openAddNewBookEntryPage() {
        val intent = AddNewBookActivity.getIntent(this)
        startActivity(intent)
    }

    private fun setClickListeners() {
        add_book_entry.setOnClickListener { presenter?.onAddNewBookFabClicked() }
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
}
