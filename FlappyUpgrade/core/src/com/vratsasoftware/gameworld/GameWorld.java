package com.vratsasoftware.gameworld;

import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;
import com.vratsasoftware.gameobjects.Logo;
import com.vratsasoftware.gameobjects.ScrollHandler;
import com.vratsasoftware.zbhelpers.AssetLoader;
import com.vratsasoftware.zbhelpers.Sound;

public class GameWorld {

	private Logo logo;
	private ScrollHandler scroller;
	private Rectangle ground;
	private int score = 0;
	private float runTime = 0;
	private GameState currentState;
	public int midPointY;
	private GameRenderer renderer;

	public enum GameState {
		MENU, READY, RUNNING, GAMEOVER, HIGHSCORE
	}

	public GameWorld(int midPointY) {
		logo = new Logo(33, midPointY - 5, 17, 12);
		// The grass should start 66 pixels below the midPointY
		scroller = new ScrollHandler(this, midPointY + 66);
		ground = new Rectangle(0, midPointY + 66, 136, 11);
		currentState = GameState.MENU;
		this.midPointY = midPointY;

	}

	public void update(float delta) {
		runTime += delta;
		switch (currentState) {
		case READY:
			updateReady(delta);
			break;
		case RUNNING:
			updateRunning(delta);
			break;
		default:
			break;
		}
	}

	private void updateReady(float delta) {
		logo.updateReady(runTime);
		scroller.updateReady(delta);
	}

	public void updateRunning(float delta) {
		if (delta > .15f) {
			delta = .15f;
		}
		logo.update(delta);
		scroller.update(delta);
//
//		if (scroller.collides(logo) && logo.isAlive()) {
//			scroller.stop();
//			logo.die();
//			Sound.playDead();
//
//			renderer.prepareTransition(255, 255, 255, .3f);
//			Sound.playFall();
//
//		} else 
		if (scroller.scored(logo) && logo.isAlive()) {
			// TODO add logic to hide candy
			// AssetLoader.coin.play();

		}
		if (Intersector.overlaps(logo.getBoundingCircle(), ground)) {
			if (logo.isAlive()) {
				Sound.playDead();
				renderer.prepareTransition(255, 255, 255, .3f);
				logo.die();
			}

			scroller.stop();
			logo.decelerate();
			currentState = GameState.GAMEOVER;

			if (score > AssetLoader.getHighScore()) {
				AssetLoader.setHighScore(score);
				currentState = GameState.HIGHSCORE;
			}

		}

	}

	public boolean isHighScore() {
		return currentState == GameState.HIGHSCORE;
	}

	public boolean isMenu() {
		return currentState == GameState.MENU;
	}

	public void restart() {
		score = 0;
		logo.onRestart(midPointY - 5);
		scroller.onRestart();
		ready();
	}

	public void ready() {
		currentState = GameState.READY;
		renderer.prepareTransition(0, 0, 0, 1f);
	}

	public boolean isReady() {
		return currentState == GameState.READY;
	}

	public void start() {
		currentState = GameState.RUNNING;
	}

	public boolean isGameOver() {
		return currentState == GameState.GAMEOVER;
	}

	public boolean isRunning() {
		return currentState == GameState.RUNNING;
	}

	public void setRenderer(GameRenderer renderer) {
		this.renderer = renderer;
	}

	public ScrollHandler getScroller() {
		return scroller;
	}

	public Logo getLogo() {
		return logo;
	}

	public int getScore() {
		return score;
	}

	public void addScore(int increment) {
		score += increment;
	}

	public int getMidPointY() {
		return this.midPointY;
	}

	public GameRenderer getRenderer() {
		return renderer;
	}

}
