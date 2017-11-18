package com.bookchronus.karthickpdy.bookchronus.ui.books.activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import butterknife.Unbinder
import com.bookchronus.karthickpdy.bookchronus.R
import com.bookchronus.karthickpdy.bookchronus.presentation.books.presenter.BookListPresenter
import com.bookchronus.karthickpdy.bookchronus.presentation.books.presenter.impl.BookListPresenterImplementation
import com.bookchronus.karthickpdy.bookchronus.presentation.books.view.BookListView

class BookListActivity : AppCompatActivity(), BookListView {

    @BindView(R.id.add_book_entry)
    lateinit var addBookEntry: FloatingActionButton

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
        ButterKnife.bind(this)
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

    @OnClick(R.id.add_book_entry)
    internal fun openAddBookEntryPage() {
        presenter?.onAddNewBookFabClicked();
    }
}
