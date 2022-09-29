package org.michaelevans.analyticspluginsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.michaelevans.analyticspluginsample.flipper.AnalyticsPlugin

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val analytics = Analytics(AnalyticsPlugin)

        analytics.reportEvent("screen_created")

        findViewById<Button>(R.id.button).setOnClickListener {
            analytics.reportEvent("button_clicked")
        }
    }
}