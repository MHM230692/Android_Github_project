package com.prototype.studentonlinequiz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyScheduleReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Power Connected", Toast.LENGTH_SHORT).show();
    }
}
