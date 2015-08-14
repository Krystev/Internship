package com.vratsasoftware.www;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.vratsasoftware.screens.SplashScreen;
import com.vratsasoftware.zbhelpers.AssetLoader;

public class MMGame extends Game {
	@Override
	public void create() {
		Gdx.app.log("MMGame", "created");

		AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}
}
