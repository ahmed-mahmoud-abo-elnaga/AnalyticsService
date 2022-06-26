package com.bitpanda.myapplication

interface AnalyticsRepo {
    fun tracking(data: Event)
}