package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (topBase + bottomBase) * height;
    }

    @Override
    public void draw() {
        System.out.println(
                "IsoscelesTrapezoid, color: " + getColor()
                        + ", topBase: " + topBase
                        + ", bottomBase: " + bottomBase
                        + ", height: " + height
                        + ", area: " + getArea()
        );
    }
}
