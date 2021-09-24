public class Run {
    public static void main(String[] args) {
        Shape[] shape = new Shape[4];
        shape[0] = new Squara();
        shape[1] = new Squara("red", false, 1);
        shape[2] = new Squara("blue", true, 2);
        shape[3] = new Squara("green", true, 3);
        Shape.printShape(shape);
        for (Shape x : shape
        ) {
            if (x instanceof Colorable)
                ((Colorable) x).howToColor();
        }
    }
}
