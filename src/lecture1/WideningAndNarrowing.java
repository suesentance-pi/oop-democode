package lecture1;

public class WideningAndNarrowing {

  public static void main(String[] args) {
    byte b = 10;

    // this is a widening conversion and Java is very happy
    int i = b;

    // this is a narrowing conversion and Java is not happy
    // WONT-COMPILE
    // byte c = i;

    // this is an explicit cast that forces the conversion.
    byte d = (byte) i;

    // In the lecture we talked about the fact that 255 is 11111111 (8 ones)
    int j = 255;

    // you can use this to print out the binary form of an int
    System.out.println(Integer.toBinaryString(j));

    // When we cast this int to a byte we don't lose information because we've only used 8 bits.
    // However, we get a surprising result:
    byte k = (byte) j;

    // k is now equal to -1
    // this is because bytes are signed and since the most significant bit is set we get a negative
    // number (2's complement)
  }
}
