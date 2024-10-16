package com.example.consumoenergetico.ui.Consumo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Handler;
import android.os.Looper;

public class DataService extends Service {
    private Handler handler = new Handler(Looper.getMainLooper());

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Simulate background data collection
        new Thread(() -> {
            try {
                while (true) {
                    // Simulate data collection (You could add Firebase data retrieval here)
                    Thread.sleep(5000); // Every 5 seconds
                    handler.post(() -> {
                        // Update UI or process data in the background
                    });
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
