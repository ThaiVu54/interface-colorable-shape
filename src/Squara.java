public class Squara extends Shape implements Colorable{
    private double side = 0;

    public Squara() {
    }

    public Squara(double side) {
        this.side = side;
    }

    public Squara(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides..");
    }

    @Override
    public String toString() {
        return "Squara{" +
                "side=" + side +
                super.toString()+
                '}';
    }
}
