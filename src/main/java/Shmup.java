import com.almasb.fxgl.app.ApplicationMode;
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.entity.EntityView;
import com.almasb.fxgl.entity.GameEntity;
import com.almasb.fxgl.input.Input;
import com.almasb.fxgl.input.InputMapping;
import com.almasb.fxgl.settings.GameSettings;
import javafx.scene.input.KeyCode;
import javafx.scene.shape.Circle;

/**
 * Created by reedtrevelyan on 2/20/16.
 */
public class Shmup extends GameApplication {

    private GameEntity player;
    private PlayerControl playerControl;
    private enum Type {
        PLAYER
    }

    @Override
    protected void initInput() {
        Input input = getInput();

        input.addInputMapping(new InputMapping("LEFT", KeyCode.LEFT));
        input.addInputMapping(new InputMapping("RIGHT", KeyCode.RIGHT));
        input.addInputMapping(new InputMapping("UP", KeyCode.UP));
        input.addInputMapping(new InputMapping("DOWN", KeyCode.DOWN));
    }

    @Override
    protected void initAssets() {

    }

    @Override
    protected void initGame() {
        player = new GameEntity();
        player.getTypeComponent().setValue(Type.PLAYER);
        player.getPositionComponent().setValue(400, 300);
        player.getMainViewComponent().setView(new EntityView(new Circle(30)));

        getGameWorld().addEntity(player);
    }

    @Override
    protected void initPhysics() {

    }

    @Override
    protected void initUI() {

    }

    @Override
    protected void onUpdate() {

    }

    @Override
    protected void initSettings(GameSettings gameSettings) {
        gameSettings.setApplicationMode(ApplicationMode.DEVELOPER);
        gameSettings.setWidth(800);
        gameSettings.setHeight(600);
        gameSettings.setTitle("Shmup");
        gameSettings.setMenuEnabled(false);
        gameSettings.setIntroEnabled(false);
        gameSettings.setShowFPS(false);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
