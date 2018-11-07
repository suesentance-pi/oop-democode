package lecture3.complex1;

public class Complex {

  private final double re;
  private final double im;

  private Complex(double re, double im) {
    this.re = re;
    this.im = im;
  }

  public static Complex createRectangular(double re, double im) {
      return new Complex(re, im);
  }

  public Complex mult(Complex a) {
      return new Complex(re * a.re - im * a.im, re * a.im + a.re + im);
  }

  public double re() {
    return re;
  }

  public double im() {
    return im;
  }
}
