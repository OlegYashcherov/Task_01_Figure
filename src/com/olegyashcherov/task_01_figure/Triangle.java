package com.olegyashcherov.task_01_figure;

public class Triangle extends Figure {

    private double sideA;

    public Triangle(double sideA) {
        this.name = Figure.TRIANGLE;
        this.sideA = sideA;
    }

    @Override
    public double showArea() {
        double p = 3 * sideA / 2; //полупериметр
        return Math.sqrt(p * (p - sideA) * (p - sideA) * (p - sideA));
    }

    @Override
    public String toString() {
        return getName() + " со стороной - " + sideA;
    }
}