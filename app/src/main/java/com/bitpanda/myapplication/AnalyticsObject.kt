package com.bitpanda.myapplication

import com.bitpanda.myapplication.impl.AdjustAnalytics
import com.bitpanda.myapplication.impl.CleverTapAnalytics
import com.bitpanda.myapplication.impl.FirebaseAnalytics
import com.bitpanda.myapplication.impl.FlurryAnalytics

object AnalyticsObject {
    private lateinit var analyticsImpRepo:AnalyticsImpRepo
    private val listAnalytics = ArrayList<Analytics>()
    init {

        listAnalytics.add(FirebaseAnalytics())
        listAnalytics.add(AdjustAnalytics())
        listAnalytics.add(CleverTapAnalytics())
        listAnalytics.add(FlurryAnalytics())
        analyticsImpRepo = AnalyticsImpRepo(listAnalytics)
    }
    fun sendEvent(event:Event) {
        listAnalytics.forEach {
            it.tracking(event)
        }
    }
    fun SendFlurryCategoryOnly(event:Event){
        listAnalytics.filterIsInstance<FlurryOnly>().forEach {
            it.tracking(event)
        }
    }
}