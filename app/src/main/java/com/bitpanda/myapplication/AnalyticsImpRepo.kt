package com.bitpanda.myapplication

class AnalyticsImpRepo(private val arrayOfAnalytics :List<Analytics>) : AnalyticsRepo {
    override fun tracking( data:Event) {
        arrayOfAnalytics.forEach {
            it.tracking(data)
        }
    }
}