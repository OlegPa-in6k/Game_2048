/**
 * Created by Oleg on 18.10.2015.
 */
public class Cell {
    private boolean hasMult = true;
    private int number;
    private int lineNumber;
    private int columnNumber;
    private int color;

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    public int getNumber() {
        return number;
    }

    public boolean isHasMult() {
        return hasMult;
    }

    public void setHasMult(boolean hasMult) {
        this.hasMult = hasMult;
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public void doubleValue(){
        setNumber(getNumber()*2);
    }


    public String toString() {
        String cellNumber = "" + getNumber();
        return cellNumber;
    }
    public void getColor(){
        color = getNumber();
        
    }
}
