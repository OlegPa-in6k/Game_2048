import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg on 18.10.2015.
 */
public class StaticInsertNewCell implements InsertNewCell {

    public void insertCell(Cell[][] cells) {

        int staticCell = 0;

        if (getListOfEmptyCells(cells).size() > 0) {
            boolean isInsert = true;
            for (int i = 0; i < GameField.FIELD_LENGTH; i++) {
                for (int j = 0; j < GameField.FIELD_LENGTH; j++) {
                    if (cells[i][j].equals(getListOfEmptyCells(cells).get(staticCell))) {
                        cells[i][j].setNumber(new StaticGeneratorOfNewCell().cellValue());
                        isInsert = false;
                        break;
                    }
                }
                if (!isInsert) {
                    break;
                }
            }
        }



    }


    public List<Cell> getListOfEmptyCells(Cell[][] cells) {
        List<Cell> cellsList = new ArrayList<Cell>();
        for (int i = 0; i < GameField.FIELD_LENGTH; i++) {
            for (int j = 0; j < GameField.FIELD_LENGTH; j++) {
                if (cells[i][j].getNumber() == 0) {
                    cellsList.add(cells[i][j]);
                }
            }
        }
        return cellsList;
    }
}
