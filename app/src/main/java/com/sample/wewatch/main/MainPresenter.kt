package com.sample.wewatch

class MainPresenter(
    private var viewInterface: MainContract.ViewInterface,
    private var dataSource: LocalDataSource) : MainContract.PresenterInterface {
    private val TAG = "MainPresenter"
}
