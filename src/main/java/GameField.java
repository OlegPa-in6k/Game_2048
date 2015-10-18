/**
 * Created by Oleg on 18.10.2015.
 */
public class GameField {

    public static final int FIELD_LENGTH = 4;
    StaticInsertNewCell insert = new StaticInsertNewCell();
    RandomInsertOfNewCell randomInsert = new RandomInsertOfNewCell();
    public Cell[][] field = new Cell[FIELD_LENGTH][FIELD_LENGTH];
     public  GameField(){
        setStaticStartField();
    }

    public void setStaticStartField(){
        setEmptyBoard();
        randomInsert.insertCell(field);
        randomInsert.insertCell(field);
    }

    public void setEmptyBoard(){
        for(int i =0; i < FIELD_LENGTH; i++){
            for(int j = 0; j < FIELD_LENGTH; j++){
                Cell cell = new Cell();

                cell.setNumber(0);
                field[i][j] = cell;
            }
        }
    }

    public void printField(){

        for(int i =0; i< FIELD_LENGTH; i++){
            for(int j =0; j < FIELD_LENGTH; j++){
                System.out.printf("%5s", field[i][j].getNumber());
            }
            System.out.println();
        }
    }
    public String toString(){
        String gameField ="";
        for(int i =0; i < FIELD_LENGTH;i++){
            for(int j =0; j < FIELD_LENGTH; j++){
                gameField += field[i][j].getNumber() + " ";
            }
            gameField+="\n";
        }
        return gameField;
    }
    

}
