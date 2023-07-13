package org.example;

import org.example.model.BiologyStudent;
import org.example.model.ComputerScienceStudent;
import org.example.model.Student;

public class Main {
    public static void main(String[] args) {
        Student studentA = new Student();
        Student studentB = new Student("John", "Smith", 1234);

        System.out.println(studentB);


        studentA.setFname("Anna");
        studentA.setLname("Miller");
        studentA.setId(5678);

        System.out.println(studentA.getFname());
        System.out.println(studentA.getLname());
        System.out.println(studentA.getId());


        BiologyStudent bioStudentA = new BiologyStudent();
        BiologyStudent bioStudentB = new BiologyStudent();
        ComputerScienceStudent compStudentA = new ComputerScienceStudent();
        ComputerScienceStudent compStudentB = new ComputerScienceStudent();

        bioStudentA.setFname("Nicolas");
        bioStudentA.setLname("Cage");
        bioStudentA.setId(7758);
        bioStudentA.setAnatomyCourse("Dog");

        compStudentA.setFname("Arnold");
        compStudentA.setLname("Schwarzenegger");
        compStudentA.setId(6587);
        compStudentA.setJavaCourse("Exeptions");


        System.out.println(bioStudentA.toString());
        System.out.println(compStudentA.toString());

        System.out.println(bioStudentA.identityCardNumber());
        System.out.println(bioStudentA.getAdress());

        System.out.println(compStudentA.identityCardNumber());
        System.out.println(compStudentA.getAdress());

    }
}