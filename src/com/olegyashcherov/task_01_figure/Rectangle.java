package com.olegyashcherov.task_01_figure;

public class Rectangle extends Square {

    protected double sideB;

    public Rectangle(double sideA, double sideB) {
        super(sideA);
        this.name = Figure.RECTANGLE;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double showArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return getName() + " со стороной А  - " + sideA + " и стороной Б  - " + sideB;
    }
}
