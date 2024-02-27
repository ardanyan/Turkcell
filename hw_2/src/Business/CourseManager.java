package Business;

import DataAccess.CourseDao;
import Entities.Course;
import Entities.Database;
import Log.Logger;


public class CourseManager {

    private CourseDao courseDao;
    private Logger logger;
    private Database database;

    public void addCourse(Course course, Database database) {
        courseDao.addCourse(course, database);
        logger.log("Course added to database: " + course.getName());
    }

    public void deleteCourse(Course course, Database database) {
        courseDao.deleteCourse(course, database);
        logger.log("Course deleted from database: " + course.getName());
    }

    public void updateCourse(Course course, Database database) {
        courseDao.updateCourse(course, database);
        logger.log("Course updated in database: " + course.getName());
    }



}
