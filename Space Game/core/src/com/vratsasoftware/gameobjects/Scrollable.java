package com.vratsasoftware.gameobjects;

import com.badlogic.gdx.math.Vector2;

public class Scrollable {

	protected Vector2 position;
	protected Vector2 velocity;
	protected int width;
	protected int height;
	protected boolean isScrolledLeft;
	private boolean isScrolledRight;

	

	public Scrollable(float x, float y, int width, int height, float scrollSpeed) {
		position = new Vector2(x, y);
		velocity = new Vector2(scrollSpeed, 0);
		this.width = width;
		this.height = height;
		isScrolledLeft = false;
		isScrolledRight = false;
	}

	public void update(float delta) {
		position.add(velocity.cpy().scl(delta));
		// If the Scrollable object is no longer visible:
		if (position.x + width < 0) {
			isScrolledLeft = true;
		}
		
		if (position.x > 130) {
			isScrolledRight = true;
		}
	}

	public void stop() {
		velocity.x = 0;
	}

	// Reset: Should Override in subclass for more specific behavior.
	public void reset(float newX) {
		position.x = newX;
		isScrolledLeft = false;
		isScrolledRight = false;
	}

	// Getters for instance variables
	public boolean isScrolledLeft() {
		return isScrolledLeft;
	}
	
	public boolean isScrolledRight() {
		return isScrolledRight;
	}
	public void setScrolledRight(boolean isScrolledRight) {
		this.isScrolledRight = isScrolledRight;
	}

	public float getTailX() {
		return position.x + width;
	}

	public float getX() {
		return position.x;
	}

	public float getY() {
		return position.y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
