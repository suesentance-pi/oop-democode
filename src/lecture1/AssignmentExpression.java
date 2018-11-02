package lecture1;

public class AssignmentExpression {

    public static void main(String[] args) {

        int y;
        int x = (y = 2);

        System.out.println(x);

        // This prints 2
        //  y=2 is an assignment expression which has type int and value 2....

    }
}
