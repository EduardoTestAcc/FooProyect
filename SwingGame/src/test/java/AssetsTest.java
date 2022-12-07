
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import graphics.Assets;
import graphics.Loader;
import graphics.Sound;
import main.Window;

public class AssetsTest {
    private static Window window;
    private static Sound sound;

    @BeforeAll
    public static void setupAll() {
        window = new Window();
        sound = new Sound(Loader.loadSound("assets/sounds/playerLoose.wav"));
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
}
