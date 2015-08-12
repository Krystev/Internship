package com.vratsasoftware.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.vratsasoftware.www.MMGame;

public class DesktopLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "FlappyLiverbird";
		config.width = 272;
		config.height = 408;
		new LwjglApplication(new MMGame(), config);
	}
}