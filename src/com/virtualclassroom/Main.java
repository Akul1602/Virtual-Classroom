package com.virtualclassroom;

public class Main {
    public static void main(String[] args) {
        // Create an instructor
        Instructor instructor = new Instructor("Ksolves");

        // Create a class
        Class classroom = new Class("Java Programming");

        // Instructor adds a unit
        Unit unit1 = new Unit("Object-Oriented Programming");
        instructor.addUnit(classroom, unit1);

        // Add lectures to the unit	
        unit1.addLecture(new Lecture("Introduction to OOP"));
        unit1.addLecture(new Lecture("Classes and Objects"));
        
        // Enroll students
        Student student1 = new Student("Akul", 101);
        Student student2 = new Student("Bobby", 102);

        classroom.enrollStudent(student1);
        classroom.enrollStudent(student2);

        // Display class details
        classroom.displayClassDetails();
    }
}
