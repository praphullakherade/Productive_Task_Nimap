package trycatch;

//Let's see an example to handle another unchecked exception.
public class TryCatchExample9 {
    public static void main(String[] args) {
       try {
           int arr[] = {1,2,3,8};
           System.out.println(arr[10]);//may throw exception
       }
       // handling the array exception
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println(e);
       }
        System.out.println("rest of the code");
    }
}
