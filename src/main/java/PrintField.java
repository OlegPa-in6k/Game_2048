/**
 * Created by Oleg on 18.10.2015.
 */
public class PrintField {
    GameField field;
    PrintField(GameField field){
        this.field = field;
    }

    public void printField(){
        System.out.println("-------------------------");

        for (int i = 0; i < GameField.FIELD_LENGTH; i++) {
            System.out.print("|");

            for (int j = 0; j < GameField.FIELD_LENGTH; j++) {
                if(field.field[i][j].getNumber()==0){
                    System.out.print("     |");
                }else{
                    System.out.printf(new Color().getColor(field.field[i][j].getNumber()));

                    System.out.printf("%5s", field.field[i][j].getNumber());
                    System.out.print("|");
                    System.out.printf(Color.DEFAULT_COLOR);

                }
            }

            System.out.println();
            System.out.println("--------------------------");
        }

    }

}
