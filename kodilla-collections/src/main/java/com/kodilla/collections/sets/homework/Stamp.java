package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String name;
    private String dimensions;

    private boolean stamp;

    public Stamp(String name, String dimensions) {
        this.name = name;
        this.dimensions = dimensions;
        this.stamp = stamp;
    }

    public boolean isStamped() {
        return true;
    }

    public String getName() {
        return name;
    }

    public String getDimensions() {
        return dimensions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp1 = (Stamp) o;
        return stamp == stamp1.stamp && Objects.equals(name, stamp1.name) && Objects.equals(dimensions, stamp1.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dimensions, stamp);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", stamp=" + stamp +
                '}';
    }
}
