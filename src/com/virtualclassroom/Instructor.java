package com.virtualclassroom;

public class Instructor {
    private String name;

    public Instructor(String name) {
        this.name = name;
    }

    public void createClass(Class classroom) {
        System.out.println("Instructor " + name + " created class: " + classroom);
    }

    public void addUnit(Class classroom, Unit unit) {
        classroom.addUnit(unit);
        System.out.println("Unit " + unit.getUnitName() + " added by Instructor " + name);
    }
}
