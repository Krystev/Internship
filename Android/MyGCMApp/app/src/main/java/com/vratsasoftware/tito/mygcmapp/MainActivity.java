package com.vratsasoftware.tito.mygcmapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.gcm.GoogleCloudMessaging;

import java.io.IOException;

public class MainActivity extends Activity {
    private static final int RC_RES_REQUEST = 100;
    String projectId;
    GoogleCloudMessaging gcm;
    String regid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!checkPlayServices()) {
            setContentView(R.layout.container_content_no_play_services);
        } else {
            setContentView(R.layout.activity_main);
        }
        registerGcm();


    }

    private void registerGcm() {
        projectId = getResources().getString(R.string.gcm_project_id);
        gcm = GoogleCloudMessaging.getInstance(this);

        try {
            regid = gcm.register(projectId);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean checkPlayServices() {
        int resultCode =
                GooglePlayServicesUtil
                        .isGooglePlayServicesAvailable(this);
        if (resultCode != ConnectionResult.SUCCESS) {
            if (GooglePlayServicesUtil.
                    isUserRecoverableError(resultCode)) {
                GooglePlayServicesUtil.getErrorDialog(
                        resultCode,
                        this,
                        RC_RES_REQUEST).show();
            } else {
                Log.i("servicesCheck",
                        "This device is not supported.");
            }
            return false;
        }
        return true;
    }
}
