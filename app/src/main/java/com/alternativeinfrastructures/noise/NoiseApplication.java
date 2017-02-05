package com.alternativeinfrastructures.noise;

import android.app.Application;
import android.content.Intent;

import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;

import com.alternativeinfrastructures.noise.sync.bluetooth.BluetoothLeSyncService;

public class NoiseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FlowManager.init(new FlowConfig.Builder(this).build());

        startService(new Intent(this, BluetoothLeSyncService.class));
    }
}