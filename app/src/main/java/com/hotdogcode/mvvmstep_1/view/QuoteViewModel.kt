package com.hotdogcode.mvvmstep_1.view

import androidx.lifecycle.ViewModel
import com.hotdogcode.mvvmstep_1.data.Quote
import com.hotdogcode.mvvmstep_1.data.QuoteRepo

class QuoteViewModel(private val quoteRepo: QuoteRepo):ViewModel() {
    fun addQuote(quote: Quote){
        quoteRepo.addQuote(quote)
    }
    fun getQuote()=quoteRepo.getQuote()
}