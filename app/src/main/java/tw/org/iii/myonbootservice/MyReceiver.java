package tw.org.iii.myonbootservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        //throw new UnsupportedOperationException("Not yet implemented");

        Log.v("brad", "onReceive");

        Intent intent1 = new Intent(context, MyService.class);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            context.startForegroundService(intent1);    // 7s

//            Intent intent2 = new Intent(context, MainActivity.class);
//            intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            context.startActivity(intent2);


        }else {
            context.startService(intent1);
        }
    }
}
