package com.olegyashcherov.task_01_figure;

public class Main {

    public static void main(String[] args) {

        Figure circle = new Circle(4);
        Figure square = new Square(4);
        Figure triangle = new Triangle(4);
        Figure rectangle = new Rectangle(4, 4);

        showAreaFigure(circle);
        showAreaFigure(square);
        showAreaFigure(triangle);
        showAreaFigure(rectangle);

    }

    private static void showAreaFigure(Figure figure) {
        System.out.println(figure + " имеет площадь " + figure.showArea());
    }
}
