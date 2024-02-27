package Entities;

import java.util.List;


public class Database {

    private List<Course>courseList;
    private List<Instructor>instructorList;
    private List<Category>categoryList;


    public Database() {
    }

    public Database(List<Course> courseList, List<Instructor> instructorList, List<Category> categoryList) {
        this.courseList = courseList;
        this.instructorList = instructorList;
        this.categoryList = categoryList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public List<Instructor> getInstructorList() {
        return instructorList;
    }

    public void setInstructorList(List<Instructor> instructorList) {
        this.instructorList = instructorList;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public void addCourse(Course course){
        //course names should be unique
        if(courseList != null){
            for (Course c : courseList) {
                if (c.getName().equals(course.getName())) {
                    throw new IllegalArgumentException("Course name should be unique");
                }
            }
            courseList.add(course);
        }

    }

    public void addInstructor(Instructor instructor){
        instructorList.add(instructor);
    }

    public void addCategory(Category category){
        //category names should be unique
        for (Category c : categoryList) {
            if (c.getName().equals(category.getName())) {
                throw new IllegalArgumentException("Category name should be unique");
            }
        }
        categoryList.add(category);
    }

    public void removeCourse(Course course){
        courseList.remove(course);
    }

    public void removeInstructor(Instructor instructor){
        instructorList.remove(instructor);
    }

    public void removeCategory(Category category){
        categoryList.remove(category);
    }

    public void updateCourse(Course course){
        for (Course c : courseList) {
            if (c.getName().equals(course.getName())) {
                c.setPrice(course.getPrice());
                c.setCategory(course.getCategory());
                c.setInstructor(course.getInstructor());
            }
        }
    }

    public void updateInstructor(Instructor instructor){
        for (Instructor i : instructorList) {
            if (i.getName().equals(instructor.getName())) {
                i.setName(instructor.getName());
            }
        }
    }

    public void updateCategory(Category category){
        for (Category c : categoryList) {
            if (c.getName().equals(category.getName())) {
                c.setName(category.getName());
            }
        }
    }

    public void printCourseList(){
        for (Course c : courseList) {
            System.out.println(c.getName());
        }
    }

    public void printInstructorList(){
        for (Instructor i : instructorList) {
            System.out.println(i.getName());
        }
    }

    public void printCategoryList(){
        for (Category c : categoryList) {
            System.out.println(c.getName());
        }
    }


    public void deleteCourse(Course course) {
        courseList.remove(course);
    }
}
