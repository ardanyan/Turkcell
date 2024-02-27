package Entities;

public class Course {
    private String name;
    private int price;
    private Category category;
    private Instructor instructor;

    public Course() {
    }

    public Course(String name, int price , String categoryName, String instructorName) {
        this.name = name;
        if(price < 0)
            throw new IllegalArgumentException("Price cannot be negative");
        this.price = price;
        this.category = new Category(categoryName);
        this.instructor = new Instructor(instructorName);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }



}
