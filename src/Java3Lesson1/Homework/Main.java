package Java3Lesson1.Homework;

public class Main {
    public static void main(String[] args) {
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();


        Box <Orange> orangeBox = new Box<Orange>(orange1, orange2, orange3);
        Box <Apple> appleBox = new Box <Apple> (apple1,apple2,apple3,apple4);


        System.out.println(appleBox.compare(orangeBox));


    }
}
