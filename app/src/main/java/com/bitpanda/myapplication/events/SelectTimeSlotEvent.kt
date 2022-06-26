package com.bitpanda.myapplication.events

import com.bitpanda.myapplication.Event

class SelectTimeSlotEvent(private val dateStart: String, val dateEnd: String) : Event {
    override fun getName(): String {
        return "TimeSlotEvent"
    }

    override fun mapping(): HashMap<String, String> {
        val data = HashMap<String, String>()
        data.put("slot-from", dateStart)
        data.put("slot-to", dateEnd)
        return data
    }
}