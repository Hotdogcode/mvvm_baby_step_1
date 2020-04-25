package com.hotdogcode.mvvmstep_1.utilities

import com.hotdogcode.mvvmstep_1.data.QuoteDatabase
import com.hotdogcode.mvvmstep_1.data.QuoteRepo

object Injector {
    fun provideViewModelFactory():ViewModelFactory{
        val quoteRepo = QuoteRepo.getInstance(QuoteDatabase.getInstance().quoteDao)
        return ViewModelFactory(quoteRepo)
    }
}