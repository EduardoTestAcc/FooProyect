package states;

import gameObjects.Constants;
import graphics.Assets;
import ui.Button;

import java.awt.*;
import java.util.ArrayList;

public class MenuState extends State {
    private ArrayList<Button> buttons;

    public MenuState() {
        buttons = new ArrayList<>();

        buttons.add(new Button(
                Assets.greyBtn,
                Assets.blueBtn,
                Constants.WIDTH / 2 - Assets.greyBtn.getWidth()/2,
                Constants.HEIGHT / 2 - Assets.greyBtn.getHeight() * 2,
                Constants.PLAY,
                () -> State.changeState(new GameState())
        ));

        buttons.add(new Button(
                Assets.greyBtn,
                Assets.blueBtn,
                Constants.WIDTH / 2 - Assets.greyBtn.getWidth()/2,
                Constants.HEIGHT / 2 + Assets.greyBtn.getHeight() * 2 ,
                Constants.EXIT,
                () -> System.exit(0)
        ));

        buttons.add(new Button(
                Assets.greyBtn,
                Assets.blueBtn,
                Constants.WIDTH / 2 - Assets.greyBtn.getWidth()/2,
                Constants.HEIGHT / 2,
                Constants.HIGH_SCORES,
                () -> State.changeState(new ScoreState())
        ));


    }


    @Override
    public void update(float dt) {
        for(Button b: buttons) {
            b.update();
        }
    }

    @Override
    public void draw(Graphics g) {
        for(Button b: buttons) {
            b.draw(g);
        }
    }

}
