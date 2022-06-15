package Lesson_14;

public class Students {

    private String name;
    private String surname;
    private int id;

    private static int lastId;


    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    private int getNextId() {return ++lastId;}

    public Students(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;

        id = getNextId();

    }

}
