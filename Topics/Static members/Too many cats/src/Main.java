
class Cat {
    String name;
    int age;
    static int counter;
    final int five = 5;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        if (counter > five) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        return counter;
    }
}