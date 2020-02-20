package zReplit.Task_223_OOP4_calcII;

public class Calc {

    private int x, y, result;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getResult() {
        return result;
    }

    public void plus() {
        result = x + y;
    }

    public void minus() {
        result = x - y;
    }

}
