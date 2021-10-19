public class Rectangle extends Shape{
    int width;
    int height;


    public Rectangle(int side){
        this.width = this.height = side;
    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(String name, String color, int width, int height){
        super(name, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return this.width * this.height;
    }

    @Override
    public int getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
