package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {

    private String schoolName;
    private List<Double> school = new ArrayList<>();

    public School(List<Double> classes, String schoolName) {
        this.school = classes;
        this.schoolName = schoolName;
    }


    public double getSum() {
        double sum = 0.0;
        for (double school : school)
            sum = sum + school;
        return sum;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school1 = (School) o;
        return Objects.equals(schoolName, school1.schoolName) && Objects.equals(school, school1.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, school);
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                '}';
    }
}
