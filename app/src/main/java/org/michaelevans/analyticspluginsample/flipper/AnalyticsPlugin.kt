package org.michaelevans.analyticspluginsample.flipper

import com.facebook.flipper.core.FlipperObject
import com.facebook.flipper.plugins.common.BufferingFlipperPlugin
import java.util.*

object AnalyticsPlugin : BufferingFlipperPlugin() {

    fun reportEvent(eventName: String) {
        val flipperObject = FlipperObject.Builder()
            .put("id", UUID.randomUUID())
            .put("event", eventName)
            .put("timestamp", Date())
            .put("item", FlipperObject.Builder()
                .put("item_id", 123)
                .put("item_name", "Example Item Name")
                .build())
            .build()
        send("newRow", flipperObject)
    }

    override fun getId(): String {
        return "org.michaelevans.flipper.analytics"
    }

    override fun runInBackground(): Boolean {
        return true
    }
}