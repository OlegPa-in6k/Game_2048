import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Oleg on 18.10.2015.
 */
public class CellTest {
    Cell cell = new Cell();

    @Test
    public void testSetName() throws Exception {
        cell.setNumber(0);
        assertThat(cell.getNumber(), is(0) );

    }
}
