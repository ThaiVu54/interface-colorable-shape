public abstract class Shape {
    private String color = "white";
    private boolean filled = false;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return
                ", color='" + color + '\'' +
                        ", filled = " + (isFilled() ? "filled" : "not filled");
    }

    public static boolean isColorable(Shape shape) {
        return shape instanceof Colorable;
//todo        return Colorable.class.isInstance(shape);
    }
    public static void printShape(Shape[] shape){
        for (Shape x : shape) {
            System.out.println(x.toString());
        }
    }
}
