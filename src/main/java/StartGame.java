import java.util.Random;

/**
 * Created by Oleg on 18.10.2015.
 */
public class StartGame {
    public static void main(String[] args) {
       GameField field = new GameField();

       GameController controller = new GameController(field);

       controller.startGame();

    }
}
