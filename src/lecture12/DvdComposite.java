package lecture12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

interface Watchable {
  String getTitle();

  int getPriceInPence();
}

class Movie implements Watchable {
  private final String title;
  private final int priceInPence;

  public Movie(String title, int priceInPence) {
    this.title = title;
    this.priceInPence = priceInPence;
  }

  @Override
  public String getTitle() {
    return title;
  }

  @Override
  public int getPriceInPence() {
    return priceInPence;
  }
}

class BoxSet implements Watchable {
  private final List<Watchable> items;

  public BoxSet(List<Watchable> items) {
    this.items = new ArrayList<>(items);
  }

  @Override
  public String getTitle() {
    return items.stream().map(Watchable::getTitle).collect(Collectors.joining(","));
  }

  @Override
  public int getPriceInPence() {
    return (int) (items.stream().mapToInt(Watchable::getPriceInPence).sum() * 0.9);
  }
}

public class DvdComposite {

  public static void main(String[] args) {

    Movie m1 = new Movie("Episode IV: A New Hope", 100);
    Movie m2 = new Movie("Episode V: The Empire Strikes Back", 100);
    Movie m3 = new Movie("Episode VI: Return of the Jedi", 100);
    BoxSet b1 = new BoxSet(List.of(m1, m2, m3));
    System.out.println(b1.getPriceInPence() + "\t" + b1.getTitle());

    Movie m4 = new Movie("Episode I: The Phantom Menace", 5);
    Movie m5 = new Movie("Episode II: Attack of the Clones", 5);
    Movie m6 = new Movie("Episode III: Revenge of the Sith", 5);
    BoxSet b2 = new BoxSet(List.of(m4, m5, m6));
    System.out.println(b2.getPriceInPence() + "\t" + b2.getTitle());

    BoxSet b3 = new BoxSet(List.of(b1, b2));
    System.out.println(b3.getPriceInPence() + "\t" + b3.getTitle());
  }
}
