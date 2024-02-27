package DataAccess;


import Entities.Course;
import Entities.Database;

public class JdbcDao implements CourseDao{
    @Override
    public void addCourse(Course course, Database database) {
        database.addCourse(course);
        System.out.println("Course added to database with JDBC.");
    }

    @Override
    public void deleteCourse(Course course, Database database) {
        database.deleteCourse(course);
        System.out.println("Course deleted from database with JDBC.");
    }

    @Override
    public void updateCourse(Course course, Database database) {
        database.updateCourse(course);
        System.out.println("Course updated in database with JDBC.");
    }
}
