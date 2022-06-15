package Lesson_14;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Students> students = new ArrayList<>();
        Students student1 = new Students("NiKi", "Lauda", 1);
        Students student2 = new Students("Sam", "Givi", 2);
        Students student3 = new Students("Kolya", "Smile", 3);
        Students student4 = new Students("Masha", "Lee", 4);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Group group = new Group(student4, students);

        group.infoStudents();
        group.deleteStudent(student2);
        group.addTask("разобраться с инкапсуляцией");
        group.renameStudent(5, "Petro", "Pupkin");

    }
}
