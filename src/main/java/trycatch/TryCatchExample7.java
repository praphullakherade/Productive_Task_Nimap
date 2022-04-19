package trycatch;

//In this example, along with try block, we also enclose exception code in a catch block.
public class TryCatchExample7 {
    public static void main(String[] args) {
        try {
            int data = 50/0;//may throw exception
        }
        //handling the exception
        catch (Exception e){
            //generating the exception in catch block
            int data1 = 50/0;//may throw exception
        }
        System.out.println("Rest of the code");
    }
}
