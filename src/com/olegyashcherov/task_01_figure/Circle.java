package com.olegyashcherov.task_01_figure;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.name = Figure.CIRCLE;
        this.radius = radius;
    }

    @Override
    public double showArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return getName() + " c радиусом - " + radius;
    }
}