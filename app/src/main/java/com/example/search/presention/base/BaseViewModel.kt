package com.example.search.presention.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel : ViewModel() {
    protected val compositeDisposable = CompositeDisposable()

    // LiveData 를 사용하여 ProgressBar 를 On/Off 시킨다. 해당 변수를 사용하는 곳은 movie_search.xml
    private val _isLoading = MutableLiveData<Boolean>(false)
    val isLoading: LiveData<Boolean> get() = _isLoading

    private val _percent = MutableLiveData<String>("0")
    val percent: LiveData<String> get() = _percent

    fun showProgress() {
        _isLoading.value = true
    }

    fun hideProgress() {
        _isLoading.value = false
    }

    fun progressPercent(load: String) {
        _percent.value = load
    }

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }
}