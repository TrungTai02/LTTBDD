package org.secuso.privacyfriendlypausinghealthily.receivers;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import org.secuso.privacyfriendlypausinghealthily.service.TimerService;



public class NotificationCancelReceiver extends BroadcastReceiver {

    public static final String ACTION_NOTIFICATION_CANCELED = "org.secuso.privacyfriendlybreakreminder.ACTION_NOTIFICATION_CANCELED";

    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        if (manager != null) {
            manager.cancel(TimerService.NOTIFICATION_ID);
        }
    }
}
