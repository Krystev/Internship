package com.mentormate.mmgame.gameobjects;

import com.mentormate.mmgame.gameworld.GameWorld;
import com.mentormate.mmgame.zbhelpers.AssetLoader;

public class ScrollHandler {

	private Grass frontGrass, backGrass;
	private Pipe pipe1, pipe2;
	private BonusLogo bonusLogo1, bonusLogo2;
	private GameWorld gameWorld;

	public static final int SCROLL_SPEED = -59;
	public static final int PIPE_GAP = 143;

	public ScrollHandler(GameWorld gameWorld, float yPos) {
		this.gameWorld = gameWorld;
		frontGrass = new Grass(0, yPos, 143, 11, SCROLL_SPEED);
		backGrass = new Grass(frontGrass.getTailX(), yPos, 143, 11, SCROLL_SPEED);

		pipe1 = new Pipe(210, 0, 22, 60, SCROLL_SPEED, yPos);
		bonusLogo1 = new BonusLogo(pipe1.getTailX() + PIPE_GAP / 2, 50, 17, 12, SCROLL_SPEED);

		pipe2 = new Pipe(pipe1.getTailX() + PIPE_GAP, 0, 22, 60, SCROLL_SPEED, yPos);
		bonusLogo2 = new BonusLogo(pipe2.getTailX() + PIPE_GAP / 2, 50, 17, 12, SCROLL_SPEED);

	}

	public void updateReady(float delta) {
		frontGrass.update(delta);
		backGrass.update(delta);
		// Same with grass
		if (frontGrass.isScrolledLeft()) {
			frontGrass.reset(backGrass.getTailX());
		} else if (backGrass.isScrolledLeft()) {
			backGrass.reset(frontGrass.getTailX());
		}

	}

	public void update(float delta) {
		// Update our objects
		frontGrass.update(delta);
		backGrass.update(delta);
		pipe1.update(delta);
		bonusLogo1.update(delta);
		pipe2.update(delta);
		bonusLogo2.update(delta);
		// Check if any of the pipes are scrolled left, and reset accordingly
		// the bonusLogo
		if (pipe1.isScrolledLeft()) {
			pipe1.reset(pipe2.getTailX() + PIPE_GAP);
			bonusLogo2.reset(pipe2.getTailX() + PIPE_GAP / 2);
		} else if (pipe2.isScrolledLeft()) {
			pipe2.reset(pipe1.getTailX() + PIPE_GAP);
			bonusLogo1.reset(pipe1.getTailX() + PIPE_GAP / 2);
		}
		// Same with grass
		if (frontGrass.isScrolledLeft()) {
			frontGrass.reset(backGrass.getTailX());
		} else if (backGrass.isScrolledLeft()) {
			backGrass.reset(frontGrass.getTailX());
		}
	}

	public void stop() {
		frontGrass.stop();
		backGrass.stop();
		pipe1.stop();
		pipe2.stop();
		bonusLogo1.stop();
		bonusLogo2.stop();
	}

	public boolean collides(Logo logo) {
		return (pipe1.collides(logo) || pipe2.collides(logo));
	}

	public void onRestart() {
		frontGrass.onRestart(0, SCROLL_SPEED);
		backGrass.onRestart(frontGrass.getTailX(), SCROLL_SPEED);
		pipe1.onRestart(210, SCROLL_SPEED);
		bonusLogo1.onRestart(pipe1.getTailX() + PIPE_GAP / 2, SCROLL_SPEED);
		pipe2.onRestart(pipe1.getTailX() + PIPE_GAP, SCROLL_SPEED);
		bonusLogo2.onRestart(pipe2.getTailX() + PIPE_GAP / 2, SCROLL_SPEED);
	}

	private void addScore(int increment) {
		gameWorld.addScore(increment);
	}

	public boolean scored(Logo bird) {
		if (bonusLogo1.collides(bird)) {
			if (!bonusLogo1.isScored()) {
				bonusLogo1.setScored(true);
				AssetLoader.coin.play();
				addScore(1);
				bonusLogo1.setVisible(false);
				return true;
			} else {
				return true;
			}
		} else if (bonusLogo2.collides(bird)) {
			if (!bonusLogo2.isScored()) {
				bonusLogo2.setScored(true);
				AssetLoader.coin.play();
				addScore(1);
				bonusLogo2.setVisible(false);
				return true;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	public Grass getFrontGrass() {
		return frontGrass;
	}

	public Grass getBackGrass() {
		return backGrass;
	}

	public Pipe getPipe1() {
		return pipe1;
	}

	public Pipe getPipe2() {
		return pipe2;
	}

	public BonusLogo getBonusLogo1() {
		return bonusLogo1;
	}

	public BonusLogo getBonusLogo2() {
		return bonusLogo2;
	}

}
