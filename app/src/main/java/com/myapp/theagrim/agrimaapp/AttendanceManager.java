package com.myapp.theagrim.agrimaapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;

import java.util.Calendar;
import java.util.Date;

//import static com.google.android.gms.ads.internal.zzag.runOnUiThread;

public class AttendanceManager extends Service {


    public AttendanceManager() {

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }



}
