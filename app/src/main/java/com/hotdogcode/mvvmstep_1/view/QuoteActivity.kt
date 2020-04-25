package com.hotdogcode.mvvmstep_1.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.hotdogcode.mvvmstep_1.R
import com.hotdogcode.mvvmstep_1.data.Quote
import com.hotdogcode.mvvmstep_1.utilities.Injector
import com.hotdogcode.mvvmstep_1.utilities.ViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
    }

    private fun initUI(){
        val factory = Injector.provideViewModelFactory()
        var viewModel = ViewModelProvider(this,factory).get(QuoteViewModel::class.java)

        viewModel.getQuote().observe(this, Observer { quotes ->
            var sb = StringBuilder()
            quotes.forEach { q->
                sb.append(q)
            }
            etGlobal.setText(sb.toString())
        })
        btn.setOnClickListener {
            viewModel.addQuote(Quote(et1.text.toString()))
            et1.setText("")
        }
    }
}
