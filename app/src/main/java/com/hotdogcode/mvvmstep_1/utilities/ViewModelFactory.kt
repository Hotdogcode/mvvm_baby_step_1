package com.hotdogcode.mvvmstep_1.utilities

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hotdogcode.mvvmstep_1.data.QuoteRepo
import com.hotdogcode.mvvmstep_1.view.QuoteViewModel

class ViewModelFactory(private val quoteRepo: QuoteRepo):ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuoteViewModel(quoteRepo) as T
    }
}