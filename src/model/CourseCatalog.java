package model;

import java.util.ArrayList;

public class CourseCatalog {
  private String year;
  private ArrayList<Course> courseList;

  public CourseCatalog(String y) {
    year = y;
    courseList = new ArrayList<Course>();
  }

  public void addCourse(Course course) {
    courseList.add(course);
  }

  public Course addNewCourse(String id, String name, String description, Program program, boolean isRequired,
      int creditHours) {
    Course newCourse = new Course(id, name, description, program, isRequired, creditHours);
    courseList.add(newCourse);
    return newCourse;
  }

  public void printCourseCatalog() {
    System.out.println("Course Catalog for " + year);
    System.out.println("-----------------");
    for (Course everyCourse : courseList) {
      everyCourse.printCourseInfo();
      System.out.println("-----------------");
    }
  }

}
