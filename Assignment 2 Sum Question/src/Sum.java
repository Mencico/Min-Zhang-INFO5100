public class Sum { //This is method overload, not override!
    int a;
    int b;
    int c;

    public int add(int a, int b){
        return a + b + c;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(int a, double b){
        return a + b + c;
    }

    public double add (double a, int b){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b + c;
    }

}
