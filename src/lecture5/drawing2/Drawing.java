package lecture5.drawing2;

import java.util.List;

public class Drawing {

  public void draw(List<Shape> shapes) {

    for (Shape s : shapes) {
      if (s instanceof Circle) {
        Circle circle = (Circle) s;
        circle.drawCircle();
      } else if (s instanceof Square) {
        Square square = (Square) s;
        square.drawSquare();
      }
    }
  }

  public static void main(String[] args) {

    List<Shape> shapes = List.of(new Square(), new Circle(), new Square());

    Drawing drawing = new Drawing();
    drawing.draw(shapes);
  }
}
