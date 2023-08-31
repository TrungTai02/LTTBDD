package org.secuso.privacyfriendlypausinghealthily.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


public class OnBootCompletedReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if(!"android.intent.action.BOOT_COMPLETED".equals(intent.getAction()))
            return;

        TimerSchedulerReceiver.scheduleNextAlarm(context);
    }
}
