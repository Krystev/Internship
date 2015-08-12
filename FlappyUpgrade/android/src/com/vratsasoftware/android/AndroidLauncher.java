package com.vratsasoftware.android;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.vratsasoftware.www.MMGame;

public class AndroidLauncher extends AndroidApplication {

	public static GoogleAnalytics analytics;
	public static Tracker tracker;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		analytics = GoogleAnalytics.getInstance(this);
		analytics.setLocalDispatchPeriod(1800);
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new MMGame(), config);
		tracker = analytics.newTracker("UA-66153927-1");
		tracker.enableExceptionReporting(true);
		tracker.enableAdvertisingIdCollection(true);
		tracker.enableAutoActivityTracking(true);

	}
}
