import java.util.List;

/**
 * Created by Oleg on 18.10.2015.
 */
public interface InsertNewCell {
    void insertCell(Cell[][] cells);
    List<Cell> getListOfEmptyCells(Cell[][] cells);
}
