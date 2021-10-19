public class Square extends Shape {
    int side;

    public Square(int side){
        this.side = side;
    }

    public Square(String name, String color, int side){
        super(name, color);
        this.side = side;
    }

    @Override
    public int getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public int getArea() {
        return this.side * this.side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }


}
