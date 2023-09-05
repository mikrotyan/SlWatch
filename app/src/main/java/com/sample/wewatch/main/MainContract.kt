package com.sample.wewatch

class MainContract {
    interface PresenterInterface {
        fun getMyMoviesList()
        fun stop()
        //TODO: добавить методы интерфейса для Presenter
    }

    interface ViewInterface {
        fun displayMovies (movieList: List < Movie >)
        fun displayNoMovies ()
        fun displayMessage (message: String )
        fun displayError (message: String )
        //TODO: добавить методы интерфейса для View
    }
}