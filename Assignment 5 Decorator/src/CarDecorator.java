public class CarDecorator implements Car {
    protected  Car car = null;

    public CarDecorator(Car car){
        this.car = car;

    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
