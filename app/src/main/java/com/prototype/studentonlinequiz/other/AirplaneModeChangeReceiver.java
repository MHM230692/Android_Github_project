package com.prototype.studentonlinequiz.other;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.widget.Toast;

public class AirplaneModeChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        /*if (isAirplaneModeOn(context.getApplicationContext())) {
            Toast.makeText(context, "AirPlane mode is on", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "AirPlane mode is off", Toast.LENGTH_SHORT).show();
        }*/

        final String action = intent.getAction();
        if (action.equals(WifiManager.SUPPLICANT_CONNECTION_CHANGE_ACTION)) {
            if (intent.getBooleanExtra(WifiManager.EXTRA_SUPPLICANT_CONNECTED, false)) {
                Toast.makeText(context, "Wifi on", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "Wifi off", Toast.LENGTH_SHORT).show();
            }
        }

    }
    private static boolean isAirplaneModeOn(Context context) {
        return Settings.System.getInt(context.getContentResolver(), Settings.Global.AIRPLANE_MODE_ON, 0) != 0;
    }
}
