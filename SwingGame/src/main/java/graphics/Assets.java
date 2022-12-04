package graphics;

import javax.sound.sampled.Clip;
import java.awt.*;
import java.awt.image.BufferedImage;

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
        player = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\ships\\player.png");
        doubleGunPlayer = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\ships\\doubleGunPlayer.png");

        speed = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\effects\\fire08.png");

        blueLaser = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\lasers\\laserBlue01.png");

        greenLaser = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\lasers\\laserGreen11.png");

        redLaser = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\lasers\\laserRed01.png");

        ufo = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\ships\\ufo.png");

        life = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\others\\life.png");

        fontBig = loadFont("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\fonts\\futureFont.ttf", 42);

        fontMed = loadFont("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\fonts\\futureFont.ttf", 20);

        for(int i = 0; i < 3; i++)
            shieldEffect[i] = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\effects\\shield" + (i + 1) +".png");

        for(int i = 0; i < bigs.length; i++)
            bigs[i] = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\meteors\\big"+(i+1)+".png");

        for(int i = 0; i < meds.length; i++)
            meds[i] = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\meteors\\med"+(i+1)+".png");

        for(int i = 0; i < smalls.length; i++)
            smalls[i] = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\meteors\\small1.png"+(i+1)+".png");

        for(int i = 0; i < tinies.length; i++)
            tinies[i] = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\meteors\\tiny"+(i+1)+".png");

        for(int i = 0; i < exp.length; i++)
            exp[i] = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\explosion\\0"+i+".png");

        for(int i = 0; i < numbers.length; i++)
            numbers[i] = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\numbers\\0"+i+".png");



        greyBtn = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\ui\\grey_button.png");
        blueBtn = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\ui\\blue_button.png");

        orb = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\powers\\orb.png");
        doubleScore = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\powers\\doubleScore.png");
        doubleGun = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\powers\\doubleGun.png");
        fastFire = loadImage("C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\powers\\fastFire.png");
        star = loadImage("/C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\powers\\star.png");
        shield = loadImage("/C:\\Users\\cedri\\IdeaProjects\\JuegoNaveEspacial\\ships\\powers\\shield.png");


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

}
