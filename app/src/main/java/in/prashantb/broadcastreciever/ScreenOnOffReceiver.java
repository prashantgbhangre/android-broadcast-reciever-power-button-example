package in.prashantb.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class ScreenOnOffReceiver extends BroadcastReceiver {
    public ScreenOnOffReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            Log.d("PGB", "ACTION_SCREEN_OFF");
        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            Log.d("PGB", "ACTION_SCREEN_ON");
        }
    }
}