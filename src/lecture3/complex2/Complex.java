package lecture3.complex2;

public class Complex {

  private final double theta;
  private final double r;

  private Complex(double theta, double r) {
    this.theta = theta;
    this.r = r;
  }

  public static Complex createRectangular(double re, double im) {
    return new Complex(Math.atan2(im, re), Math.sqrt(re * re + im * im));
  }

  public Complex mult(Complex a) {
    return new Complex(theta + a.theta, r * a.r);
  }

  public double re() {
    return r * Math.cos(theta);
  }

  public double im() {
    return r * Math.sin(theta);
  }
}
