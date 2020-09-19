public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Shape();
        shapes[1] = new Circle();
        shapes[2] = new Rectangle();
        shapes[3] = new Square();
        for (Shape shape:shapes) {

            if (shape instanceof Square) {
                Square square = (Square) shape;
                square.howToColor();
            }
            System.out.println(shape.toString());
        }
    }
}
