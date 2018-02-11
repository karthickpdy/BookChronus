package com.bookchronus.karthickpdy.bookchronus.ui.books.activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bookchronus.karthickpdy.bookchronus.R
import com.bookchronus.karthickpdy.bookchronus.presentation.books.presenter.BookListPresenter
import com.bookchronus.karthickpdy.bookchronus.presentation.books.presenter.impl.BookListPresenterImplementation
import com.bookchronus.karthickpdy.bookchronus.presentation.books.view.BookListView
import kotlinx.android.synthetic.main.activity_book_list.*

class BookListActivity : AppCompatActivity(), BookListView {

    internal var presenter: BookListPresenter? = BookListPresenterImplementation()

    override fun showAppError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showDBError(): Void {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showSuccessMessage() {
    }

    override fun showErrorMessage() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)
        setClickListeners()
        presenter!!.onViewCreated(this)
        presenter!!.loadBookList()
    }

    override fun onDestroy() {
        presenter?.onViewDestroyed()
        super.onDestroy()
    }

    override fun openAddNewBookEntryPage() {
        val intent = AddNewBookActivity.getIntent(this)
        startActivity(intent)
    }

    private fun setClickListeners() {
        add_book_entry.setOnClickListener { presenter?.onAddNewBookFabClicked() }
    }
}
