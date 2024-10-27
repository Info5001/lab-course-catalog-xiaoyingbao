import model.CourseCatalog;
import model.Program;

public class CourseCatalogMain {
  public static void main(String[] args) throws Exception {

    CourseCatalog nuCourseCatalog = new CourseCatalog("2022-2023");
    Program informationSystems = new Program("Information Systems Program");

    nuCourseCatalog.addNewCourse("INFO 5001", "Application Modeling and Design",
        "Practices social-technical software engineering methods and tools to solve real-world problems. Explores innovative design and programming techniques ...",
        informationSystems, true, 4);

    nuCourseCatalog.addNewCourse("INFO 5100", "Application Engineering & Development",
        "Introduces the concepts and skills necessary to design, develop, and deploy applications using a contemporary framework. ...",
        informationSystems, true, 4);

    nuCourseCatalog.addNewCourse("INFO 5002", "Introduction to Python for Information Systems",
        "Introduces the Python programming language and its use in information systems. Covers the basics of Python programming ...",
        informationSystems, true, 4);

    System.out.println("-----------------");

    nuCourseCatalog.printCourseCatalog();

    // use UpperCamerCase letter for class name
    // use lowerCamelCase for variable name and method name
    // use lowercase for package name

  }
}
