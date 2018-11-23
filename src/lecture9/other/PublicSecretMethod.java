package lecture9.other;

public class PublicSecretMethod extends PackageSecretMethod {

  @Override
  public void secretMethod() {
    System.out.println("Ah ha!");
    super.secretMethod();
  }
}
