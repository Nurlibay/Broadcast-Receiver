package uz.unidev.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

/**
 *  Created by Nurlibay Koshkinbaev on 03/10/2022 19:22
 */

class MyReceiver: BroadcastReceiver()  {

    override fun onReceive(context: Context?, intent: Intent?) {
        when(intent?.action){
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                val turnedOn = intent.getBooleanExtra("state", false)
                Toast.makeText(context, "Airplane mode changed. Turned on: $turnedOn", Toast.LENGTH_SHORT).show()
            }
            Intent.ACTION_BATTERY_LOW -> {
                Toast.makeText(context, "Battery low", Toast.LENGTH_SHORT).show()
            }
        }
    }
}