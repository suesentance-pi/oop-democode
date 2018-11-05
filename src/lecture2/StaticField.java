package lecture2;

class StaticField {

  private static int instanceCount = 0;

  StaticField() {
    instanceCount++;
  }

  public static void main(String[] args) {

    for (int i = 0; i < 100; i++) {
      new StaticField();
    }

    System.out.println(StaticField.instanceCount); // do this

    StaticField f = new StaticField();
    System.out.println(f.instanceCount); // dont do this
  }
}
