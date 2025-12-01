package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 10;

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int figureType = random.nextInt(5); // 5 типов фигур
        String color = getRandomColor();

        switch (figureType) {
            case 0:
                return new Circle(color, random.nextInt(MAX_SIZE) + 1);
            case 1:
                return new Square(color, random.nextInt(MAX_SIZE) + 1);
            case 2:
                return new Rectangle(
                        color,
                        random.nextInt(MAX_SIZE) + 1,
                        random.nextInt(MAX_SIZE) + 1
                );
            case 3:
                return new RightTriangle(
                        color,
                        random.nextInt(MAX_SIZE) + 1,
                        random.nextInt(MAX_SIZE) + 1
                );
            case 4:
                return new IsoscelesTrapezoid(
                        color,
                        random.nextInt(MAX_SIZE) + 1,
                        random.nextInt(MAX_SIZE) + 1,
                        random.nextInt(MAX_SIZE) + 1
                );
            default:
                return getDefaultFigure();
        }
    }

    private String getRandomColor() {
        String[] colors = {"Red", "Blue", "Green", "Yellow", "Black", "White"};
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
