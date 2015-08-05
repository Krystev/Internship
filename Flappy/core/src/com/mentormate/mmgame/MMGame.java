package com.mentormate.mmgame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.mentormate.mmgame.screens.GameScreen;
import com.mentormate.mmgame.screens.SplashScreen;
import com.mentormate.mmgame.zbhelpers.AssetLoader;

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
