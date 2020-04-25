package com.hotdogcode.mvvmstep_1.data

class QuoteDatabase private constructor(){
    var quoteDao = QuoteDao()
        private set

    companion object{
        @Volatile private var instance:QuoteDatabase? = null
        fun getInstance():QuoteDatabase{
            return instance ?: synchronized(this){
                instance ?: QuoteDatabase().also { instance = it }
            }
        }
    }
}