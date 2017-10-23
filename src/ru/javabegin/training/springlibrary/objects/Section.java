package ru.javabegin.training.springlibrary.objects;

public class Section implements java.io.Serializable {
    private String name;

    public Section() {
    }

    public Section(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
