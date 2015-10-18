import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Oleg on 18.10.2015.
 */
public class RandomGeneratorOfNewCellTest {
    RandomGeneratorOfNewCell valuse = new RandomGeneratorOfNewCell();

    @Test
    public void testGetValue() throws Exception {
        assertThat(valuse.cellValue(), is(2));

    }
}
