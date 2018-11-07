package lecture3;

import lecture3.complex2.Complex;

public class ComplexTest {

  public static void main(String[] args) {

    Complex c1 = Complex.createRectangular(1, 2);
    Complex c2 = Complex.createRectangular(3, 4);

    Complex c3 = c1.mult(c2);

    System.out.printf("%f + %f i", c3.re(), c3.im());
  }
}
