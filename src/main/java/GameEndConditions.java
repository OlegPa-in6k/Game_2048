/**
 * Created by Oleg on 18.10.2015.
 */
public class GameEndConditions {

    GameField field;
    GameEndConditions(GameField field){
        this.field = field;
    }


    ;
    StaticInsertNewCell insert = new StaticInsertNewCell();

    public boolean hasLeftMove(){
        boolean gameplay = false;
        for(int i =0; i < GameField.FIELD_LENGTH; i++){
            for(int j = 0; j < GameField.FIELD_LENGTH-1;j++){
                if(field.field[i][j].getNumber()==field.field[i][j+1].getNumber()){
                    gameplay = true;
                } else gameplay = false;
            }
        }
        return gameplay;
    }

    public boolean hasDownMove(){
        FieldMove move = new FieldMove(field);
        boolean gameplay = false;
        move.rotateFieldRight(field);
        gameplay = hasLeftMove();
        move.rotateFieldRight(field);
        move.rotateFieldRight(field);
        move.rotateFieldRight(field);
        return gameplay;
    }
    public boolean hasEmptyCell(){
        boolean gamePlay = false;
        if(insert.getListOfEmptyCells(field.field).size()>0){
            gamePlay = true;
        } else{
            gamePlay = false;
        }
        return gamePlay;
    }
    public boolean hasNumber2048(){
        boolean playGame = false;
        for(int i =0; i < GameField.FIELD_LENGTH; i++){
            for(int j =0; j < GameField.FIELD_LENGTH; j++){
                if(field.field[i][j].getNumber()==2048){
                    playGame = true;
                }
            }
        }
        return playGame;
    }

    public boolean isGameContinue(){
        boolean gameplay = false;
        if(hasDownMove()){
            gameplay = true;
        }
        if (hasLeftMove()){
            gameplay = true;
        }
        if(hasEmptyCell()){
            gameplay = true;
        }
        return gameplay;
    }



}
