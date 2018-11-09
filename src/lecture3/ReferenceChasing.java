package lecture3;

import java.util.Arrays;

public class ReferenceChasing {

  private static void update(Link l) {
    l.value = l.value.toUpperCase();
  }

  private static void update(String[] arr) {
    arr[0] = arr[0].toUpperCase();
  }

  public static void main(String[] args) {

    String[] ar = new String[] {"andy", "was", "here"};
    update(ar);
    System.out.println(Arrays.toString(ar));

    Link l1 = new Link("andy");
    Link l2 = new Link("was");
    Link l3 = new Link("here");

    l1.next = l2;
    l2.next = l3;

    update(l2);

    System.out.println(l1);
    System.out.println(l2);
  }
}
