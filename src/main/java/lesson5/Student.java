package lesson5;

import java.io.Serializable;

public class Student implements Serializable {
    private int number;
    private String name;
    private String email;

    public Student(int number, String name, String email) {
        this.number = number;
        this.name = name;
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return getNumber() + ";" + getName() + ";" + getEmail();
    }
}
