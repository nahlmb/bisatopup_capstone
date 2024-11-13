package com.amanahcorp.bisatopup.core.base

interface BaseViewModel {
    fun fetch()
    fun onSuccessFetch()
    fun onFailedFetch()
    fun turnLoading()
    fun stopLoading()
    fun turnError()
    fun stopError()
    fun turnEmpty()
    fun stopEmpty()
}