package lecture11;

import java.util.List;

public class CovariantArray {

  public static void main(String[] args) {

    String[] strings = new String[] {"a", "b"};
    Object[] objects = strings;

    Object o = objects[0];
    objects[1] = 1;

    List<String> stringList = List.of("a", "b");
    //    List<Object> objectList = stringList;
  }
}
