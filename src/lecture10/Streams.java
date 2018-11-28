package lecture10;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams {

  public static void main(String[] args) {

    List<Integer> list =
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

    List<Integer> collect =
        list.stream()
            .filter(x -> x % 2 == 0)
            .map(
                new Function<Integer, Integer>() {
                  @Override
                  public Integer apply(Integer integer) {
                    return integer * integer;
                  }
                })
            .map(x -> -x)
            .collect(Collectors.toList());

    list.stream().mapToInt(x -> x * x).mapToObj(x -> x).collect(Collectors.toList());
  }
}
