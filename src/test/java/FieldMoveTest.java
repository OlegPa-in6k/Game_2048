import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Oleg on 18.10.2015.
 */
public class FieldMoveTest {
    StaticInsertNewCell inserStatic = new StaticInsertNewCell();
    GameField field = new GameField();


    @Test
    public void testFillFieldWithDiffNumbers() throws Exception {
        field.setEmptyBoard();
        FieldMove move = new FieldMove(field.field);
        move.setFieldFithDiffNumbers();
        assertThat(field.toString(), is(
                        "1 2 3 4 \n" +
                        "5 6 7 8 \n" +
                        "9 10 11 12 \n" +
                        "13 14 15 16 \n"
        ));
    }

    @Test
    public void testRotateField() throws Exception {
        field.setEmptyBoard();
        FieldMove move = new FieldMove(field.field);

        move.setFieldFithDiffNumbers();
        move.rotateFieldRight(field);
        move.rotateFieldRight(field);
        assertThat(field.toString(), is(
                        "16 15 14 13 \n" +
                        "12 11 10 9 \n" +
                        "8 7 6 5 \n" +
                        "4 3 2 1 \n"
        ));


    }

    @Test
    public void testSlideLeft() throws Exception {
        field.setEmptyBoard();
        FieldMove move = new FieldMove(field.field);

        inserStatic.insertCell(field.field);
        inserStatic.insertCell(field.field);
        inserStatic.insertCell(field.field);
        inserStatic.insertCell(field.field);

        move.slideLeft(field);
        move.slideLeft(field);

        assertThat(field.toString(), is(
                        "8 0 0 0 \n" +
                        "0 0 0 0 \n" +
                        "0 0 0 0 \n" +
                        "0 0 0 0 \n"
        ));


    }

}
