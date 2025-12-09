package rvt;

public class Books {
    private String name;
    private int pages;
    private int age;

    public Books(String name, int pages, int age) {
        this.name = name;
        this.pages = pages;
        this.age = age;

    }

    public String getName() {
        return this.name;

    }

    public String toString() {
        return name + ", " + pages + " pages, " + age;

    }

}