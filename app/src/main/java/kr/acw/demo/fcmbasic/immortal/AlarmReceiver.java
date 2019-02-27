package kr.acw.demo.fcmbasic.immortal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

public class AlarmReceiver extends BroadcastReceiver {
    private static final String TAG = AlarmReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        Log.d(TAG, "onReceive()");
        // an Intent broadcast.
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Intent i = new Intent(context, ReImmortalService.class);
            context.startForegroundService(i);
        } else {
            Intent i = new Intent(context, ImmortalService.class);
            context.startService(i);
        }
    }
}
