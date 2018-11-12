package lecture5.drawing3;

import java.util.List;

public class Drawing {

  public void draw(List<Shape> shapes) {

    for (Shape s : shapes) {
      s.draw();
    }
  }

  public static void main(String[] args) {

    List<Shape> shapes = List.of(new Circle(), new Square());
    Drawing drawing = new Drawing();
    drawing.draw(shapes);
  }
}
