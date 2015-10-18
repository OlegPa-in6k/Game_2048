/**
 * Created by Oleg on 18.10.2015.
 */
public class FieldMove {
    Score score = new Score();


    GameField field = new GameField();
    StaticInsertNewCell insert = new StaticInsertNewCell();
    FieldMove(GameField field){
        this.field = field;
    }



    private boolean isAction = false;
    public FieldMove(Cell[][] field) {
        this.field.field = field;
    }

    public boolean isAction() {
        return isAction;
    }

    public void setIsAction(boolean isAction) {
        this.isAction = isAction;
    }

    public void setFieldFithDiffNumbers() {
        int someNumber = 1;
        for (int i = 0; i < GameField.FIELD_LENGTH; i++) {
            for (int j = 0; j < GameField.FIELD_LENGTH; j++) {
                field.field[i][j].setNumber(someNumber);
                someNumber++;
            }
        }
    }

    public void rotateFieldRight(GameField field) {

        for (int i = 0; i < GameField.FIELD_LENGTH / 2; i++) {
            for (int j = 0; j < Math.ceil(((double) GameField.FIELD_LENGTH) / 2.); j++) {
                Cell temp = field.field[i][j];
                field.field[i][j] = field.field[GameField.FIELD_LENGTH - 1 - j][i];
                field.field[GameField.FIELD_LENGTH - 1 - j][i] = field.field[GameField.FIELD_LENGTH - 1 - i][GameField.FIELD_LENGTH - 1 - j];
                field.field[GameField.FIELD_LENGTH - 1 - i][GameField.FIELD_LENGTH - 1 - j] = field.field[j][GameField.FIELD_LENGTH - 1 - i];
                field.field[j][GameField.FIELD_LENGTH - 1 - i] = temp;
            }
        }
    }

    public void slideLeft(GameField field) {
        setIsAction(false);
        for (int i = 0; i < GameField.FIELD_LENGTH; i++) {

            for (int j = 1; j < GameField.FIELD_LENGTH; j++) {

                if (field.field[i][j].getNumber() != 0) {

                    for (int k = j; k > 0; k--) {
                        if (field.field[i][k - 1].getNumber() == 0) {
                            field.field[i][k - 1].setNumber(field.field[i][k].getNumber());
                            field.field[i][k].setNumber(0);
                           setIsAction(true);


                        } else if (field.field[i][k - 1].getNumber() == field.field[i][k].getNumber() && field.field[i][k].isHasMult()) {
                            field.field[i][k - 1].doubleValue();
                            field.field[i][k - 1].setHasMult(false);
                            field.field[i][k].setNumber(0);
                            score.setScore(field.field[i][k-1].getNumber());
                            setIsAction(true);

                        }

                    }

                }
            }
        }
        setAllCellsNotMult(field);

    }

    public void setAllCellsNotMult(GameField field) {
        for (int i = 0; i < GameField.FIELD_LENGTH; i++) {
            for (int j = 0; j < GameField.FIELD_LENGTH; j++) {
                field.field[i][j].setHasMult(true);
            }
        }
    }

    public void moveLeft(){
        slideLeft(field);



    }
    public void moveUp(){
        rotateFieldRight(field);
        rotateFieldRight(field);
        rotateFieldRight(field);
        slideLeft(field);
        rotateFieldRight(field);


    }
    public void moveDown(){
        rotateFieldRight(field);
        slideLeft(field);
        rotateFieldRight(field);
        rotateFieldRight(field);
        rotateFieldRight(field);

    }
    public void moveRight(){

        rotateFieldRight(field);
        rotateFieldRight(field);
        slideLeft(field);
        rotateFieldRight(field);
        rotateFieldRight(field);

    }

    public void moveable(Direction direction){
        switch (direction){
            case LEFT:
                moveLeft();
                break;
            case RIGHT:
                moveRight();
                break;
            case DOWN:
                moveDown();
                break;
            case UP:
                moveUp();
                break;
        }
    }

}
