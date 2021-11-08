public class SubtractOperation implements MathOperation{

    int num1;
    int num2;


    public SubtractOperation() {
    }

    public SubtractOperation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public int performOperation(int num1, int num2) {
        return num1 - num2;
    }
}
