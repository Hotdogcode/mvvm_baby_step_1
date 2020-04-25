package com.hotdogcode.mvvmstep_1.data

class QuoteRepo private constructor(private val quoteDao: QuoteDao) {
    fun addQuote(quote: Quote){
        quoteDao.addQuote(quote)
    }
    fun getQuote()=quoteDao.getQuote()

    companion object{
        private var instance:QuoteRepo?=null
        fun getInstance(quoteDao: QuoteDao)=
            instance ?: synchronized(this){
                instance ?: QuoteRepo(quoteDao).also { instance=it }
            }
    }
}