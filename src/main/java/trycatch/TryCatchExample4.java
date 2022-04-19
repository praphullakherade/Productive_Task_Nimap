package trycatch;

//Here, we handle the exception using the parent class exception.
public class TryCatchExample4 {
    public static void main(String[] args) {
        try {
            int data = 50/0;//may throw exception

        }
        // handling the exception by using exception class
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
