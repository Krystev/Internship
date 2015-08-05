package com.mentormate.mmgame.gameobjects;

import java.util.Random;

import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;

public class Pipe extends Scrollable {

	private Random r;
	private Rectangle barTopUp, barTopDown, barUp, barDown;

	private float groundY;

	public static final int VERTICAL_GAP = 45;
	public static final int PIPE_TOP_WIDTH = 24;
	public static final int PIPE_TOP_HEIGHT = 11;

	public Pipe(float x, float y, int width, int height, float scrollSpeed, float groundY) {
		super(x, y, width, height, scrollSpeed);
		r = new Random();

		barTopUp = new Rectangle();
		barTopDown = new Rectangle();
		barUp = new Rectangle();
		barDown = new Rectangle();
		this.groundY = groundY;

	}

	@Override
	public void update(float delta) {
		super.update(delta);

		barUp.set(position.x, position.y, width, height);
		barDown.set(position.x, position.y + height + VERTICAL_GAP, width,
				groundY - (position.y + height + VERTICAL_GAP));

		barTopUp.set(position.x - (PIPE_TOP_WIDTH - width) / 2, position.y + height - PIPE_TOP_HEIGHT, PIPE_TOP_WIDTH,
				PIPE_TOP_HEIGHT);
		barTopDown.set(position.x - (PIPE_TOP_WIDTH - width) / 2, barDown.y, PIPE_TOP_WIDTH, PIPE_TOP_HEIGHT);
	}

	@Override
	public void reset(float newX) {
		// Call the reset method in the superclass (Scrollable)
		super.reset(newX);
		// Change the height to a random number
		height = r.nextInt(90) + 15;

	}

	public boolean collides(Logo logo) {
		if (position.x < logo.getX() + logo.getWidth()) {
			return (Intersector.overlaps(logo.getBoundingCircle(), barUp)
					|| Intersector.overlaps(logo.getBoundingCircle(), barDown)
					|| Intersector.overlaps(logo.getBoundingCircle(), barTopUp)
					|| Intersector.overlaps(logo.getBoundingCircle(), barTopDown));
		}
		return false;
	}

	public void onRestart(float x, float scrollSpeed) {
		velocity.x = scrollSpeed;
		reset(x);
	}

	public Rectangle getBarTopUp() {
		return barTopUp;
	}

	public Rectangle getBarTopDown() {
		return barTopDown;
	}

	public Rectangle getBarUp() {
		return barUp;
	}

	public Rectangle getBarDown() {
		return barDown;
	}

	public float getGroundY() {
		return groundY;
	}

}
