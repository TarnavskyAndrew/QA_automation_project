package Lesson_1;

public class SecondClass {

    public static class people {

        int age;
        String name;

    }

    public static void main(String[] args) {

        int i = 2;
        people kolya = new people();
        kolya.age = 25;
        kolya.name = "Kolya";

        System.out.println("--- " + i + " ---");
        System.out.println();
        System.out.println("~~~ " + kolya.name + ", he turned " + kolya.age + " " + i + " years ago" + " ~~~");
    }

}
