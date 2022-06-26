package com.bitpanda.myapplication

interface Event {
    fun getName():String
    fun mapping():HashMap<String,String>
}