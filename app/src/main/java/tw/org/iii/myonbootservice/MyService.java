package tw.org.iii.myonbootservice;

import android.app.Service;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

public class MyService extends Service {
    private Timer timer;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Intent intent = new Intent(this, MyService2.class);
        startService(intent);
    }
}
