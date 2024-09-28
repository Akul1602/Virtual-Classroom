package com.virtualclassroom;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private String className;
    private List<Unit> units;
    private List<Student> enrolledStudents;

    public Class(String className) {
        this.className = className;
        this.units = new ArrayList<>();
        this.enrolledStudents = new ArrayList<>();
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.getName() + " enrolled in " + className);
    }

    public void displayClassDetails() {
        System.out.println("Class: " + className);
        System.out.println("Units: ");
        for (Unit unit : units) {
            System.out.println("- " + unit.getUnitName());
            unit.displayLectures();
        }
    }
}
