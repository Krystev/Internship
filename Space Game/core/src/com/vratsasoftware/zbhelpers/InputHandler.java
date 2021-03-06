package com.vratsasoftware.zbhelpers;

import java.util.ArrayList;
import java.util.List;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.vratsasoftware.gameobjects.BonusLogo;
import com.vratsasoftware.gameobjects.Logo;
import com.vratsasoftware.gameworld.GameWorld;
import com.vratsasoftware.ui.SimpleButton;

public class InputHandler implements InputProcessor {
	private Logo myLogo;
	BonusLogo bullet;
	private GameWorld myWorld;
	private List<SimpleButton> menuButtons;
	private SimpleButton playButton;
	private float scaleFactorX;
	private float scaleFactorY;

	public InputHandler(GameWorld myWorld, float scaleFactorX, float scaleFactorY) {
		this.myWorld = myWorld;
		myLogo = myWorld.getLogo();
		int midPointY = myWorld.getMidPointY();
		this.scaleFactorX = scaleFactorX;
		this.scaleFactorY = scaleFactorY;
		menuButtons = new ArrayList<SimpleButton>();
		playButton = new SimpleButton(136 / 2 - (AssetLoader.playButtonUp.getRegionWidth() / 2), midPointY + 50, 29, 16,
				AssetLoader.playButtonUp, AssetLoader.playButtonDown);
		menuButtons.add(playButton);
		bullet = myWorld.getScroller().getBullet();
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		
		screenX = scaleX(screenX);
		screenY = scaleY(screenY);
		System.out.println(screenX + " " + screenY);
		if (myWorld.isMenu()) {
			playButton.isTouchDown(screenX, screenY);
		} else if (myWorld.isReady()) {
			myWorld.start();
		}
		
		if (screenX <  136 / 2) {
			myLogo.onClick();
		} else if (screenX > 136 / 2 && (bullet.isScrolledRight() || bullet.isVisible() == false)) {
			Sound.playKick();
			bullet.resetBullet(myWorld.getLogo().getX(), (int) myWorld.getLogo().getY());
		}
		

		if (myWorld.isGameOver() || myWorld.isHighScore()) {
			myWorld.restart();
		}
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		screenX = scaleX(screenX);
		screenY = scaleY(screenY);
		
		if (myWorld.isMenu()) {
			if (playButton.isTouchUp(screenX, screenY)) {
				myWorld.ready();
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean keyDown(int keycode) {
		// Can now use Space Bar to play the game
		if (keycode == Keys.SPACE) {
			if (myWorld.isMenu()) {
				myWorld.ready();
			} else if (myWorld.isReady()) {
				myWorld.start();
			}
			myLogo.onClick();
			if (myWorld.isGameOver() || myWorld.isHighScore()) {
				myWorld.restart();
			}
		} else if (keycode == Keys.CONTROL_RIGHT && (bullet.isScrolledRight() || bullet.isVisible() == false)) {
			if(myWorld.getScroller().getEnemyObject().isVisible()){
			Sound.playKick();
			bullet.resetBullet(myWorld.getLogo().getX(), (int) myWorld.getLogo().getY());
			}
		}

		return false;
	}

	@Override
	public boolean keyUp(int keycode) {

		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	public boolean scrolled(int amount) {
		return false;
	}

	private int scaleX(int screenX) {
		return (int) (screenX / scaleFactorX);
	}

	private int scaleY(int screenY) {
		return (int) (screenY / scaleFactorY);
	}

	public List<SimpleButton> getMenuButtons() {
		return menuButtons;
	}
}
