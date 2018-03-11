package com.bookchronus.karthickpdy.bookchronus.presentation.ui

/**
 * Created by Jyoti on 08/07/17.
 * This interface represents a basic view. All views should implement these common methods.
 */
interface BaseView {

    /**
     * This is a general method used for showing some kind of progress during a background task. For example, this
     * method should show a progress bar and/or disable buttons before some background work starts.
     */
    fun showProgress()

    /**
     * This is a general method used for hiding progress information after a background task finishes.
     */
    fun hideProgress()

    /**
     * This method is used for showing error messages on the UI.
     *
     * @param message The success message to be dislayed.
     */
    fun showSuccess(message: String)

    /**
     * This method is used for showing error messages on the UI.
     *
     * @param message The error message to be dislayed.
     */
    fun showError(message: String)

}