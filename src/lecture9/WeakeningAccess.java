package lecture9;

import lecture9.other.PackageSecretMethod;
import lecture9.other.PublicSecretMethod;

public class WeakeningAccess {

  // NOTE: be careful with terminology here - we are "weakening the access restrictions" i.e. going
  // from protected to public is a weaker restriction
  // An alternative phrasing is the opposite: "weakening the access privileges" i.e. going from
  // public to protected is weaker privileges

  public static void main(String[] args) {

    PackageSecretMethod p = new PackageSecretMethod();
    // p.secretMethod();

    PublicSecretMethod q = new PublicSecretMethod();
    q.secretMethod();
  }
}
