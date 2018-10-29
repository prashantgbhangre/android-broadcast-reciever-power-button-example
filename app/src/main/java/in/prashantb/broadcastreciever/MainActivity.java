package in.prashantb.broadcastreciever;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private ScreenOnOffReceiver myReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("PGB", "In OnCreate");
        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        filter.addAction(Intent.ACTION_USER_PRESENT);
        myReceiver = new ScreenOnOffReceiver();
        this.registerReceiver(myReceiver, filter);
        Log.d("PGB", "Reciever Start");
    }

    @Override
    protected void onDestroy() {
        if (myReceiver != null) {
            this.unregisterReceiver(myReceiver);
            Log.d("PGB", "Reciever Stop");
            myReceiver = null;
        }
        super.onDestroy();
    }
}
