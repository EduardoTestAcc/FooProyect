package graphics;

import java.awt.Font;
import java.awt.image.BufferedImage;

import javax.sound.sampled.Clip;

public class Assets {
	
	public static boolean loaded = false;
	public static float count = 0;
	public static float MAX_COUNT = 57;
	
	
	public static BufferedImage player;
	public static BufferedImage doubleGunPlayer;
	
	// effects
	
	public static BufferedImage speed;
	
	public static BufferedImage[] shieldEffect = new BufferedImage[3];
	
	// explosion
	
	public static BufferedImage[] exp = new BufferedImage[9];
	
	// lasers
	
	public static BufferedImage blueLaser, greenLaser, redLaser;
	
	// Meteors
	
	public static BufferedImage[] bigs = new BufferedImage[4];
	public static BufferedImage[] meds = new BufferedImage[2];
	public static BufferedImage[] smalls = new BufferedImage[2];
	public static BufferedImage[] tinies = new BufferedImage[2];
	
	// ufo
	
	public static BufferedImage ufo;
	
	// numbers
	
	public static BufferedImage[] numbers = new BufferedImage[11];
	
	public static BufferedImage life;
	
	// fonts
	
	public static Font fontBig;
	public static Font fontMed;
	
	public static Clip backgroundMusic, explosion, playerLoose, playerShoot, ufoShoot, powerUp;
	
	// ui
	
	public static BufferedImage blueBtn;
	public static BufferedImage greyBtn;
	
	// power ups
	
	public static BufferedImage orb, doubleScore, doubleGun, fastFire, shield, star;
	
	public static void init()
	{
		player = loadImage("assets/ships/player.png");
		doubleGunPlayer = loadImage("assets/ships/doubleGunPlayer.png");
		//assets\explosion\6.png
		
		speed = loadImage("assets/effects/fire08.png");
		
		blueLaser = loadImage("assets/lasers/laserBlue01.png");
		
		greenLaser = loadImage("assets/lasers/laserGreen11.png");
		
		redLaser = loadImage("assets/lasers/laserRed01.png");
		
		ufo = loadImage("assets/ships/ufo.png");
		
		life = loadImage("assets/others/life.png");
		
		fontBig = loadFont("assets/fonts/futureFont.ttf", 42);
		
		fontMed = loadFont("assets/fonts/futureFont.ttf", 20);
		
		for(int i = 0; i < 3; i++)
			shieldEffect[i] = loadImage("assets/effects/shield" + (i + 1) +".png"); 
		
		for(int i = 0; i < bigs.length; i++)
			bigs[i] = loadImage("assets/meteors/big"+(i+1)+".png");
		
		for(int i = 0; i < meds.length; i++)
			meds[i] = loadImage("assets/meteors/med"+(i+1)+".png");
		
		for(int i = 0; i < smalls.length; i++)
			smalls[i] = loadImage("assets/meteors/small"+(i+1)+".png");
		
		for(int i = 0; i < tinies.length; i++)
			tinies[i] = loadImage("assets/meteors/tiny"+(i+1)+".png");
		
		for(int i = 0; i < exp.length; i++)
			exp[i] = loadImage("assets/explosion/"+i+".png");
		
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = loadImage("assets/numbers/"+i+".png");
		
		backgroundMusic = loadSound("assets/sounds/backgroundMusic.wav");
		explosion = loadSound("assets/sounds/explosion.wav");
		playerLoose = loadSound("assets/sounds/playerLoose.wav");
		playerShoot = loadSound("assets/sounds/playerShoot.wav");
		ufoShoot = loadSound("assets/sounds/ufoShoot.wav");
		powerUp = loadSound("assets/sounds/powerUp.wav");
		
		greyBtn = loadImage("assets/ui/grey_button.png");
		blueBtn = loadImage("assets/ui/blue_button.png");
		
		orb = loadImage("assets/powers/orb.png");
		doubleScore = loadImage("assets/powers/doubleScore.png");
		doubleGun = loadImage("assets/powers/doubleGun.png");
		fastFire = loadImage("assets/powers/fastFire.png");
		star = loadImage("assets/powers/star.png");
		shield = loadImage("assets/powers/shield.png");
		
		// ===========================================================
		
		loaded = true;
		
	}

	public static BufferedImage loadImage(String path) {
		count ++;
		return Loader.ImageLoader(path);
	}
	public static Font loadFont(String path, int size) {
		count ++;
		return Loader.loadFont(path, size);
	}
	public static Clip loadSound(String path) {
		count ++;
		return Loader.loadSound(path);
	}
	
}
