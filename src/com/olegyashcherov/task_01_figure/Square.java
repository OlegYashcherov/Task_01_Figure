package com.olegyashcherov.task_01_figure;

public class Square extends Figure {

    protected double sideA;

    public Square(double sideA) {
        this.name = Figure.SQUARE;
        this.sideA = sideA;
    }

    @Override
    public double showArea() {
        return sideA * sideA;
    }

    @Override
    public String toString() {
        return getName() + " со стороной - " + sideA;
    }
}
