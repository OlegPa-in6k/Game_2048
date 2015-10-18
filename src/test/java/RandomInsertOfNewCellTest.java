import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;/**
 * Created by Oleg on 18.10.2015.
 */

public class RandomInsertOfNewCellTest {
    GameField field = new GameField();

    @Test
    public void testGenerateOneRandom() throws Exception {
        RandomInsertOfNewCell random = new RandomInsertOfNewCell();
       // random.insertCell(field.field);
       /* assertThat(field.toString(), is(
                        "2 2 0 0 \n" +
                        "0 0 0 0 \n" +
                        "0 0 0 0 \n" +
                        "0 0 0 0 \n"
        ));
*/
    }
}
