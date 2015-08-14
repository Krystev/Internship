package com.vratsasoftware.gameworld;

import java.util.List;

import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenEquations;
import aurelienribon.tweenengine.TweenManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.vratsasoftware.gameobjects.BonusLogo;
import com.vratsasoftware.gameobjects.EnemyLogo;
import com.vratsasoftware.gameobjects.Grass;
import com.vratsasoftware.gameobjects.Logo;
import com.vratsasoftware.gameobjects.ScrollHandler;
import com.vratsasoftware.tweenaccessors.Value;
import com.vratsasoftware.tweenaccessors.ValueAccessor;
import com.vratsasoftware.ui.SimpleButton;
import com.vratsasoftware.zbhelpers.AssetLoader;
import com.vratsasoftware.zbhelpers.InputHandler;

public class GameRenderer {

	// Game Objects
	private Logo logo;

	// Game Assets
	private Animation logoAnimation;
	private TextureRegion bg, grass;
	private TextureRegion logoMid, mmGameLogo;
	private TextureRegion bonusLogoPlanet1, bonusLogoPlanet2, enemyLogo, bonusLogoRocket;
	private TextureRegion ready, gameOver, highScore, scoreboard, star, noStar, retry;

	private ScrollHandler scroller;
	private Grass frontGrass, backGrass;
	private BonusLogo bLogo1, bLogo2, bullet;

	private EnemyLogo enemyObject;

	private GameWorld myWorld;
	private OrthographicCamera cam;
	private ShapeRenderer shapeRenderer;

	private SpriteBatch batcher;

	public SpriteBatch getBatcher() {
		return batcher;
	}

	private int midPointY;

	// Tween stuff
	private TweenManager manager;
	private Value alpha = new Value();

	private Color transitionColor;

	// Buttons
	private List<SimpleButton> menuButtons;


	

	public GameRenderer(GameWorld world, int gameHeight, int midPointY) {
		myWorld = world;

		// The word "this" refers to this instance.
		// We are setting the instance variables' values to be that of the
		// parameters passed in from GameScreen.

		this.midPointY = midPointY;
		this.menuButtons = ((InputHandler) Gdx.input.getInputProcessor()).getMenuButtons();

		cam = new OrthographicCamera();
		cam.setToOrtho(true, 136, gameHeight);

		batcher = new SpriteBatch();
		batcher.setProjectionMatrix(cam.combined);
		shapeRenderer = new ShapeRenderer();
		shapeRenderer.setProjectionMatrix(cam.combined);

		// Call helper methods to initialize instance variables
		initGameObjects();
		initAssets();

		transitionColor = new Color();
		// setupTween
		prepareTransition(255, 255, 255, .5f);

	}

	private void initGameObjects() {
		logo = myWorld.getLogo();
		scroller = myWorld.getScroller();
		frontGrass = scroller.getFrontGrass();
		backGrass = scroller.getBackGrass();
		bLogo1 = scroller.getBonusLogo1();
		bLogo2 = scroller.getBonusLogo2();
		bullet = scroller.getBullet();
		enemyObject = scroller.getEnemyObject();
	}

	private void initAssets() {
		bg = AssetLoader.bg;
		mmGameLogo = AssetLoader.gameLogo;
		grass = AssetLoader.grass;
		logoAnimation = AssetLoader.logoAnimation;
		logoMid = AssetLoader.logo;
		bonusLogoRocket = AssetLoader.androidLogo;
		bonusLogoPlanet1 = AssetLoader.appleLogo;
		bonusLogoPlanet2 = AssetLoader.appleLogo;
		enemyLogo = AssetLoader.enemyLogo;
		highScore = AssetLoader.highScore;
		scoreboard = AssetLoader.scoreboard;
		retry = AssetLoader.retry;
		ready = AssetLoader.ready;
		star = AssetLoader.star;
		noStar = AssetLoader.noStar;
		gameOver = AssetLoader.gameOver;
		
	}

	private void drawGrass() {
		// Draw the grass
		batcher.draw(grass, frontGrass.getX(), frontGrass.getY(), frontGrass.getWidth(), frontGrass.getHeight());
		batcher.draw(grass, backGrass.getX(), backGrass.getY(), backGrass.getWidth(), backGrass.getHeight());
	}
	
	private void drawLogos() {
		// Draw the first logo
		if (bLogo1.isVisible() && logo.isAlive()) {
			batcher.draw(bonusLogoPlanet1, bLogo1.getX(), bLogo1.getY(), bLogo1.getWidth(), bLogo1.getHeight());
		}

		// Draw the second logo
		if (bLogo2.isVisible() && logo.isAlive()) {
			batcher.draw(bonusLogoPlanet2, bLogo2.getX(), bLogo2.getY(), bLogo2.getWidth(), bLogo2.getHeight());
		}

	}

	public void drawBullet() {
		if (myWorld.isRunning()) {
			if (bullet.isVisible() && logo.isAlive()) {
				batcher.draw(bonusLogoRocket, bullet.getX(), bullet.getY(), bullet.getWidth(), bullet.getHeight());
			}
		} else {
			bullet.setVisible(false);
		}
	}
	private void drawEnemyObject() {
		if (myWorld.isRunning()) {
			if (enemyObject.isVisible() && logo.isAlive()) {
				batcher.draw(enemyLogo, enemyObject.getX(), enemyObject.getY(), enemyObject.getWidth(), enemyObject.getHeight());
			}
		} else {
			enemyObject.setVisible(false);
		}
		
	}

	private void drawLogoCentered(float runTime) {
		batcher.draw(logoAnimation.getKeyFrame(runTime), 59, logo.getY() - 15, logo.getWidth() / 2.0f,
				logo.getHeight() / 2.0f, logo.getWidth(), logo.getHeight(), 1, 1, logo.getRotation());
	}

	private void drawLogo(float runTime) {

		if (logo.shouldntFlap()) {
			batcher.draw(logoMid, logo.getX(), logo.getY(), logo.getWidth() / 2.0f, logo.getHeight() / 2.0f,
					logo.getWidth(), logo.getHeight(), 1, 1, logo.getRotation());

		} else {
			batcher.draw(logoAnimation.getKeyFrame(runTime), logo.getX(), logo.getY(), logo.getWidth() / 2.0f,
					logo.getHeight() / 2.0f, logo.getWidth(), logo.getHeight(), 1, 1, logo.getRotation());
		}

	}

	private void drawMenuUI() {
		batcher.draw(mmGameLogo, 136 / 2 - 56, midPointY - 50, mmGameLogo.getRegionWidth() / 1.2f,
				mmGameLogo.getRegionHeight() / 1.2f);

		for (SimpleButton button : menuButtons) {
			button.draw(batcher);
		}

	}

	private void drawScoreboard() {
		batcher.draw(scoreboard, 22, midPointY - 30, 97, 37);

		batcher.draw(noStar, 25, midPointY - 15, 10, 10);
		batcher.draw(noStar, 37, midPointY - 15, 10, 10);
		batcher.draw(noStar, 49, midPointY - 15, 10, 10);
		batcher.draw(noStar, 61, midPointY - 15, 10, 10);
		batcher.draw(noStar, 73, midPointY - 15, 10, 10);

		if (myWorld.getScore() > 5) {
			batcher.draw(star, 73, midPointY - 15, 10, 10);
		}

		if (myWorld.getScore() > 17) {
			batcher.draw(star, 61, midPointY - 15, 10, 10);
		}

		if (myWorld.getScore() > 50) {
			batcher.draw(star, 49, midPointY - 15, 10, 10);
		}

		if (myWorld.getScore() > 80) {
			batcher.draw(star, 37, midPointY - 15, 10, 10);
		}

		if (myWorld.getScore() > 120) {
			batcher.draw(star, 25, midPointY - 15, 10, 10);
		}

		int length = ("" + myWorld.getScore()).length();

		AssetLoader.whiteFont.draw(batcher, "" + myWorld.getScore(), 104 - (2 * length), midPointY - 20);

		int length2 = ("" + AssetLoader.getHighScore()).length();
		AssetLoader.whiteFont.draw(batcher, "" + AssetLoader.getHighScore(), 104 - (2.5f * length2), midPointY - 3);

	}

	private void drawRetry() {
		batcher.draw(retry, 36, midPointY + 10, 66, 14);
	}

	private void drawReady() {
		batcher.draw(ready, 36, midPointY - 50, 68, 14);
	}

	private void drawGameOver() {
		batcher.draw(gameOver, 24, midPointY - 50, 92, 14);
	}

	private void drawScore() {
		int length = ("" + myWorld.getScore()).length();
		AssetLoader.shadow.draw(batcher, "" + myWorld.getScore(), 68 - (3 * length), midPointY - 82);
		AssetLoader.font.draw(batcher, "" + myWorld.getScore(), 68 - (3 * length), midPointY - 83);
	}

	private void drawHighScore() {
		batcher.draw(highScore, 22, midPointY - 50, 96, 14);
	}

	public void render(float delta, float runTime) {

		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		shapeRenderer.begin(ShapeType.Filled);

		// Draw Background color 108, 180, 226, 0.5f
		shapeRenderer.setColor(10 / 255.0f, 16 / 255.0f, 12 / 255.0f, 1);
		shapeRenderer.rect(0, 0, 136, midPointY + 66);

		// Draw Grass
		shapeRenderer.setColor(111 / 255.0f, 186 / 255.0f, 45 / 255.0f, 1);
		shapeRenderer.rect(0, midPointY + 66, 136, 11);

		// Draw Dirt
		shapeRenderer.setColor(147 / 255.0f, 80 / 255.0f, 27 / 255.0f, 1);
		shapeRenderer.rect(0, midPointY + 77, 136, 52);

		shapeRenderer.end();

		batcher.begin();
		batcher.disableBlending();

		batcher.draw(bg, 0, midPointY + 23, 136, 43);

		
		
		batcher.enableBlending();
		drawEnemyObject();
		
		if (myWorld.isRunning()) {

			drawLogo(runTime);
			drawScore();
		} else if (myWorld.isReady()) {
			drawLogo(runTime);
			drawReady();
		} else if (myWorld.isMenu()) {
			drawLogoCentered(runTime);
			drawMenuUI();
		} else if (myWorld.isGameOver()) {
			drawScoreboard();
			drawLogo(runTime);
			drawGameOver();
			drawRetry();
		} else if (myWorld.isHighScore()) {
			drawScoreboard();
			drawLogo(runTime);
			drawHighScore();
			drawRetry();
		}

		drawGrass();
		batcher.end();
		batcher.begin();
		drawLogos();
		drawBullet();
		
		batcher.end();

		drawTransition(delta);

	}

	

	public void prepareTransition(int r, int g, int b, float duration) {
		transitionColor.set(r / 255.0f, g / 255.0f, b / 255.0f, 1);
		alpha.setValue(1);
		Tween.registerAccessor(Value.class, new ValueAccessor());
		manager = new TweenManager();
		Tween.to(alpha, -1, duration).target(0).ease(TweenEquations.easeOutQuad).start(manager);
	}

	private void drawTransition(float delta) {
		if (alpha.getValue() > 0) {
			manager.update(delta);
			Gdx.gl.glEnable(GL20.GL_BLEND);
			Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
			shapeRenderer.begin(ShapeType.Filled);
			shapeRenderer.setColor(transitionColor.r, transitionColor.g, transitionColor.b, alpha.getValue());
			shapeRenderer.rect(0, 0, 136, 300);
			shapeRenderer.end();
			Gdx.gl.glDisable(GL20.GL_BLEND);

		}
	}
}
