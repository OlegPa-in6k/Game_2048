import java.util.Random;

/**
 * Created by Oleg on 18.10.2015.
 */
public class RandomGeneratorOfNewCell implements GeneratorOfNewCell {
    public int cellValue() {
        Random rdm = new Random();
        int value = 0;
        switch (rdm.nextInt(10)){
            case 1: value = 4;
                break;
            default:
                value =2;
                break;

        }
        return value;
    }
}
