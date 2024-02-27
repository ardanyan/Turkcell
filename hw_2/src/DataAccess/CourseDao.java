package DataAccess;

import Entities.Course;
import Entities.Database;

public interface CourseDao {
    public void addCourse(Course course , Database database);

    public void deleteCourse(Course course, Database database);

    public void updateCourse(Course course, Database database);
}
