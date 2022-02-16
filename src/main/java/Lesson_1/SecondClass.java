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

        String pattern = "--- %03d ---";
        String pattern2 = "%n~~~ %S, he turned %d %d years ago ~~~ %n%n";

        System.out.printf(pattern, i);
        System.out.printf(pattern2, kolya.name, kolya.age, i);

        System.out.println("Спасибо, Тарас! Действительно удобней с форматированием строк.");
    }

}
