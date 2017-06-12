package com.example.patyalves.alarme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

/**
 * Created by logonrm on 12/06/2017.
 */

public class AlarmReceiver extends BroadcastReceiver {

    private MediaPlayer mp = null;

    public AlarmReceiver() {}

    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("onReceive");
        mp=MediaPlayer.create(context, R.raw.silence);
        mp.start();
        Toast.makeText(context, "Alarm....", Toast.LENGTH_LONG).show();

    }
}
