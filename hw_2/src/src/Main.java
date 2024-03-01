package src;

import DataAccess.CourseDao;
import DataAccess.HibernateDao;
import DataAccess.JdbcDao;
import Entities.Course;
import Entities.Database;
import Business.CourseManager;

import javax.xml.crypto.Data;


public class Main {
    public static void main(String[] args) {

        Database database = new Database();

        //course names are unique check the database
        Course course = new Course("Java", 100, "Programming", "Arda Altintas");
        Course course2 = new Course("Python", 101, "Programming", "Arda Altintas_2");

        CourseDao courseDao = new HibernateDao();
        CourseDao courseDao2 = new JdbcDao();

        

        CourseManager courseManager = new CourseManager();
        CourseManager courseManager2 = new CourseManager();

        courseDao.addCourse(course, database);
        courseDao2.addCourse(course2, database);






    }
}