import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Oleg on 18.10.2015.
 */
public class RandomInsertOfNewCell implements InsertNewCell {


    public void insertCell(Cell[][] cells) {
        Random rdm = new Random();
        int randomCell = rdm.nextInt(getListOfEmptyCells(cells).size());
        cells[getListOfEmptyCells(cells).get(randomCell).getLineNumber()][getListOfEmptyCells(cells).get(randomCell).getColumnNumber()].setNumber(new RandomGeneratorOfNewCell().cellValue());



    }

    public List<Cell> getListOfEmptyCells(Cell[][] cells) {

        List<Cell> cellsList = new ArrayList<Cell>();
        for (int i = 0; i < GameField.FIELD_LENGTH; i++) {
            for (int j = 0; j < GameField.FIELD_LENGTH; j++) {
                if (cells[i][j].getNumber() == 0) {
                    cells[i][j].setLineNumber(i);
                    cells[i][j].setColumnNumber(j);
                    cellsList.add(cells[i][j]);
                }
            }
        }
        return cellsList;
    }
}

