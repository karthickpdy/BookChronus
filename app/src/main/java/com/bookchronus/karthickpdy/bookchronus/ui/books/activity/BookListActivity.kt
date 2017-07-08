package com.bookchronus.karthickpdy.bookchronus.ui.books.activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Toast
import com.bookchronus.karthickpdy.bookchronus.R
import com.bookchronus.karthickpdy.bookchronus.presentation.books.presenter.BookListPresenter
import com.bookchronus.karthickpdy.bookchronus.presentation.books.presenter.impl.BookListPresenterImplementation
import com.bookchronus.karthickpdy.bookchronus.presentation.books.view.BookListView

class BookListActivity : AppCompatActivity(), BookListView {

    internal var bookListPresenter: BookListPresenter? = BookListPresenterImplementation()

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
        bookListPresenter!!.onViewCreated(this)
        bookListPresenter!!.loadBookList()
    }

    override fun onDestroy() {
        bookListPresenter?.onViewDestroyed()
        super.onDestroy()
    }
}
