package com.hotdogcode.mvvmstep_1.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class QuoteDao{
    private val quoteList = mutableListOf<Quote>()
    private val quote = MutableLiveData<List<Quote>>()


    init {
        quote.value = quoteList
    }

    fun addQuote(q: Quote){
        quoteList.add(q)
        quote.value = quoteList
    }

    fun getQuote()=quote as LiveData<List<Quote>>

}