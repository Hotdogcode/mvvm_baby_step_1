package com.hotdogcode.mvvmstep_1.data

data class Quote(private val name:String) {

    override fun toString(): String {
        return name
    }
}