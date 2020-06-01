package OOP.inheritance;

public class superKeyWord2 {

    public class Vahicle {

        String color;
        double weight;

        public Vahicle(String color, double weight) {
            this.color = color;
            this.weight = weight;
        }

        void attribute() {
            System.out.println("Color: " + color);
            System.out.println("Weight: " + weight);
        }
    }

    public static class Car extends Vahicle {

        //color, weight and attribute()
        int gear;

        public Car(String color, double weight, int gear) {
            super(color, weight);
            this.gear = gear;
        }

        @Override
        void attribute() {
            super.attribute();
            System.out.println("Gear: " + gear);
        }

    }

    public static void main(String[] args) {
        Car car = new Car("White", 200.34, 4);
        car.attribute();
    }
}
