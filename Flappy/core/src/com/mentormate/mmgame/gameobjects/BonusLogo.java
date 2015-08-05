package com.mentormate.mmgame.gameobjects;

import java.util.Random;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Intersector;

public class BonusLogo extends Scrollable {

	private Random r;
	private Circle boundingCircle;

	private boolean isScored = false;

	private boolean visible = true;

	public BonusLogo(float x, float y, int width, int height, float scrollSpeed) {
		super(x, y, width, height, scrollSpeed);
		r = new Random();
		boundingCircle = new Circle();

	}

	public boolean collides(Logo logo) {
		if (position.x < logo.getX() + logo.getWidth()) {
			return (Intersector.overlaps(logo.getBoundingCircle(), boundingCircle));
		}
		return false;
	}

	@Override
	public void update(float delta) {
		super.update(delta);
		boundingCircle.set(position.x + 9, position.y + 6, 6.5f);
	}

	@Override
	public void reset(float newX) {
		super.reset(newX);
		setVisible(true);
		position.set(position.x, r.nextInt(90) + 15);
		setScored(false);
	}

	public void onRestart(float x, float scrollSpeed) {
		velocity.x = scrollSpeed;
		reset(x);
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public boolean isScored() {
		return isScored;
	}

	public void setScored(boolean b) {
		isScored = b;
	}

	public Circle getBoundingCircle() {
		return boundingCircle;
	}

}
