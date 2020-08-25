package com.sty.ne.amssample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

/**
 * @Author: tian
 * @UpdateDate: 2020-08-24 19:38
 */
public class TestService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
