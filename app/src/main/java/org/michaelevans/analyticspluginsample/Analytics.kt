package org.michaelevans.analyticspluginsample

import org.michaelevans.analyticspluginsample.flipper.AnalyticsPlugin

class Analytics(private val plugin: AnalyticsPlugin? = null) {
    fun reportEvent(eventName: String) {
        if (BuildConfig.DEBUG) {
            plugin?.reportEvent(eventName)
        } else {
            // do normal analytics logic here
        }
    }
}