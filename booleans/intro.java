/* 
Boolean data type
*/
public class intro {
    public static void main(String[] args) {
        boolean a = true ;
        boolean b = false ;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        if(a) {
            System.out.println("a is true");
        }
        if(b) {
            System.out.println("b is true");
        }
        if(! b) {
            System.out.println("b is false");
        }
        if(a && b) {
            System.out.println("a and b are true");
        }
        if(a || b) {
            System.out.println("a or b is true");
        }
        if(a ^ b) {
            System.out.println("a and b are different");
        }
        if(! (a && b)&& ! (a || b)) {
            System.out.println("a and b are different");
        }
    }
}