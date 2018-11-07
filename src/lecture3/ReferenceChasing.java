package lecture3;

public class ReferenceChasing {


    public static void main(String[] args) {

        Link l1 = new Link("andy");
        Link l2 = new Link("was");
        Link l3 = new Link("here");

        l1.next = l2;
        l2.next = l3;

        System.out.println(l1);

    }
}
