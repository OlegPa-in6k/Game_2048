import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Oleg on 18.10.2015.
 */
public class StaticInsertNewCellTest {
    StaticInsertNewCell st = new StaticInsertNewCell();

    @Test
    public void testInsertNewCell() throws Exception {
        GameField field = new GameField();
        field.setEmptyBoard();
        st.insertCell(field.field);
        assertThat(field.toString(), is(
                        "2 0 0 0 \n" +
                        "0 0 0 0 \n" +
                        "0 0 0 0 \n" +
                        "0 0 0 0 \n"
        ));

    }
}
