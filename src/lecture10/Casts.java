package lecture10;

public class Casts {

  static void add(Number n) {
    /* 1 */ int i = (Integer) n;
  }

  @Override
  public Casts clone() throws CloneNotSupportedException {
    /* 2 */ return (Casts) super.clone();
  }

  public static void main(String[] args) {
    Number n = 4.0;
    /* 3 */ Object o = (Object) n;
    if (o instanceof Double) {
      /* 4 */ Double d = (Double) o;
    }
  }
}
