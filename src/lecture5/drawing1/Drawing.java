package lecture5.drawing1;

import java.util.List;

public class Drawing {

  public void draw(List<Circle> circles, List<Square> squares) {

    for (Circle c : circles) {
      c.drawCircle();
    }
    for (Square s : squares) {
      s.drawSquare();
    }
  }

  public static void main(String[] args) {

    List<Circle> circles = List.of(new Circle(), new Circle());
    List<Square> squares = List.of(new Square());
    Drawing drawing = new Drawing();
    drawing.draw(circles, squares);
  }
}
