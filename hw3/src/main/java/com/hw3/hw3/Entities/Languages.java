package com.hw3.hw3.Entities;

public class Languages {
    private String Name;
    private int id;

    public Languages(String Language, int id) {
        this.Name = Language;
        this.id = id;
    }

    public Languages() {
        this.Name = "";
        this.id = 0;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Language) {
        this.Name = Language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
