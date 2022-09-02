
class Car {

    int yearModel;
    String make;
    int speed;
    final int five = 5;
    final int four = 4;
    final int zero = 0;

    public void accelerate() {
        this.speed += five;
    }

    public void brake() {
        if (this.speed > four) {
            this.speed -= five;
        } else {
            this.speed = zero;
        }
    }
}