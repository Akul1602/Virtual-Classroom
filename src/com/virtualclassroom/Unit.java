package com.virtualclassroom;

import java.util.ArrayList;
import java.util.List;

public class Unit {
    private String unitName;
    private List<Lecture> lectures;

    public Unit(String unitName) {
        this.unitName = unitName;
        this.lectures = new ArrayList<>();
    }

    public String getUnitName() {
        return unitName;
    }

    public void addLecture(Lecture lecture) {
        lectures.add(lecture);
    }

    public void displayLectures() {
        System.out.println("Lectures in " + unitName + ": ");
        for (Lecture lecture : lectures) {
            System.out.println(" - " + lecture.getLectureTitle());
        }
    }
}
