package com.olegyashcherov.task_01_figure;

public abstract class Figure {

    public static final String CIRCLE = "Круг";
    public static final String SQUARE = "Квадрат";
    public static final String TRIANGLE = "Треугольник";
    public static final String RECTANGLE = "Прямоугольник";

    protected String name;

    public abstract double showArea();

    public String getName() {
        return name;
    }
}
