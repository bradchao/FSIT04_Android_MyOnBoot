package tw.org.iii.myonbootservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

public class MyService2 extends Service {
    private Timer timer;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Log.v("brad", "MyService2:onCreate()");
        timer = new Timer();
        timer.schedule(new TimerTask() {
            int i;
            @Override
            public void run() {
                Log.v("brad", "i = " + i++);
            }
        }, 0, 1000);
    }
}
