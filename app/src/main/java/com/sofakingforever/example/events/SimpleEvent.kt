package com.sofakingforever.example.events

import com.sofakingforever.analytics.events.AnalyticsEvent
import com.sofakingforever.analytics.kits.AnalyticsKit

class SimpleEvent() : AnalyticsEvent {
    override fun getEventName(kit: AnalyticsKit): String = "Simple Event"

}