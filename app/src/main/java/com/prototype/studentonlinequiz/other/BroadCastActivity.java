package com.prototype.studentonlinequiz.other;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;

import com.prototype.studentonlinequiz.R;
import com.prototype.studentonlinequiz.WifiReceiver;

public class BroadCastActivity extends AppCompatActivity {

    WifiReceiver airplaneModeChangeReceiver = new WifiReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad_cast);

        IntentFilter intentFilter = new IntentFilter(WifiManager.WIFI_STATE_CHANGED_ACTION);
        registerReceiver(airplaneModeChangeReceiver, intentFilter);
    }


    @Override
    protected void onStart() {
        super.onStart();

      /* IntentFilter intentFilter = new IntentFilter(WifiManager.SUPPLICANT_CONNECTION_CHANGE_ACTION);
        registerReceiver(airplaneModeChangeReceiver, intentFilter);*/
        /*IntentFilter filter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(airplaneModeChangeReceiver, filter);*/


    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(airplaneModeChangeReceiver);
    }
}