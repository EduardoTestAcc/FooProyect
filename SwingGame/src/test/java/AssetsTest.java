
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import graphics.Loader;
import graphics.Sound;
import main.Window;
import math.Vector2D;

public class AssetsTest {
    private static Window window;
    private static Sound sound;
    private static Vector2D vector;

    @BeforeAll
    public static void setupAll() {
        window = new Window();
        sound = new Sound(Loader.loadSound("assets/sounds/playerLoose.wav"));
        vector = new Vector2D(3, 4);
    }

    @Test
    public void testImageLoader() {
        assertNotNull(Loader.ImageLoader("assets/powers/fastFire.png"));
    }
    
    @Test
    public void testFontLoader() {
        assertNotNull(Loader.loadFont("assets/fonts/futureFont.ttf", 10));
    }

    @Test
    public void testSoundLoader() {
        assertNotNull(Loader.loadSound("assets/sounds/playerLoose.wav"));
    }

    @Test
    public void testThreadLoadingGame() {
        assertDoesNotThrow(window::init);
    }

    @Test
    public void testSoundPlay() {
        assertDoesNotThrow(sound::play);
    }

    @Test
    public void testSoundLoop() {
        assertDoesNotThrow(sound::loop);
    }

    @Test
    public void testSoundGetFramePos() {
        assertNotNull(sound.getFramePosition());
    }
    
    @Test
    public void testSoundStop() {
        assertDoesNotThrow(sound::stop);
    }

    @Test
    public void testVectorMagnitude() {
        assertEquals(vector.getMagnitude(), 5);
    }

    @Test
    public void testVectorNormalization() {
        double vecNormalizedMagnitude = vector.normalize().getMagnitude();
        assertEquals(vecNormalizedMagnitude, 1);
    }
}
