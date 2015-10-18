import java.util.Scanner;

/**
 * Created by Oleg on 18.10.2015.
 */
public class GameController {
    GameField field;
    Score score = new Score();



    GameController(GameField field){
        this.field = field;
    }


        public void startGame(){
        System.out.println("Start new Game");
        boolean isPlayGame = true;
        boolean isWinner = false;
        Scanner scanner = new Scanner(System.in);
        PrintField print = new PrintField(field);
        System.out.println("Score = " + score.getScore());
        print.printField();
        while(isPlayGame) {

            FieldMove move = new FieldMove(field);

            System.out.println("8 - up,  4 - left, 6 - right, 2 - down, e  - exit");
            char choise = scanner.next().charAt(0);
            switch (choise){
                case '8':
                    move.moveUp();
                    break;
                case '4':
                    move.moveable(Direction.LEFT);
                    break;
                case '2':
                    move.moveable(Direction.DOWN);
                    break;
                case '6':
                    move.moveable(Direction.RIGHT);
                    break;
                case 'e':
                    isPlayGame = false;
                    break;

            }

            score.setScore(move.score.getScore());
            System.out.println("Score = " + score.getScore());
            RandomInsertOfNewCell insert = new RandomInsertOfNewCell();
            if(move.isAction()){
                insert.insertCell(field.field);
            }
            /*StaticInsertNewCell insert = new StaticInsertNewCell();
            if(move.isAction()){
                        insert.insertCell(field.field);
            }*/

            print.printField();

            GameEndConditions gameEndConditions = new GameEndConditions(field);

            if(gameEndConditions.hasNumber2048()){
                System.out.println("YOU WIN!");
                System.out.println("COntinue?  Y  :   N");
                char choise1 = scanner.next().charAt(0);
                switch(choise1){
                    case 'y':
                        break;
                    case 'n':
                        isPlayGame = false;
                        break;
                }
            }
            if(gameEndConditions.isGameContinue()){

            }else {
                System.out.println("Game Over");
                isPlayGame = false;
            }

        }
        scanner.close();
    }
}
