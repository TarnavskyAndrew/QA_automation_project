package Lesson_14;

import java.util.*;

public class Group {

    private Students starosta;

    private List<Students> students = new ArrayList<>();
    private HashMap<String, Set<Integer>> tasks = new HashMap<>();

    public Group(Students starosta, List<Students> students) {
        this.starosta = starosta;
        this.students = students;

        students.add(starosta);
    }

    public void infoStudents() {
        for (Students st : students) {
            if (st == starosta)
                System.out.print("Starosta: ");
            System.out.println(st.getId() + " " + st.getName() + " " + st.getSurname());
        }
    }

    public void changeStarosta(Students newStarosta) {
        starosta = newStarosta;

        if (!students.contains(starosta))
            students.add(starosta);
    }


    public void deleteStudent(Students student) {
        students.remove(student);

    }

    public void renameStudent(int id, String newName, String newSurname) {
        for (Students students : students) {
            if (students.getId() == id) {
                students.setName(newName);
                students.setSurname(newSurname);
            }
        }
    }

    public void addTask(String newTask) {
        Set<Integer> emptySet = new HashSet<>();
        tasks.put(newTask, emptySet);
    }

    public void completeTask(String task, int id) {
        Set<Integer> currentSet = tasks.get(task);
        currentSet.add(id);
        tasks.put(task, currentSet);
    }

    private String getStudentbyId(int id) {
        for (Students student : students) {
            if (student.getId() == id)
                return student.getName() + " " + student.getSurname();
        }
        return null;
    }

    public void completedTasks(){
        for (Map.Entry<String, Set<Integer>> mapEntry : tasks.entrySet()) {
            String key = mapEntry.getKey();
            Set<Integer> currentSet = mapEntry.getValue();

            System.out.println("Task: " + key + " performed by: ");

            for (Integer taskPerformerId : currentSet) {
                String performer = getStudentbyId(taskPerformerId);
                if (performer != null) {
                    System.out.println(taskPerformerId + " " + performer);
                    break;
                }
            }
        }
    }


}
