package exception;

public class exception {
    public static void main(String[] args) {

        try {
            int[] arr = {10, 20, 30};

            int result = 10 / 0;     
            System.out.println(arr[5]);

            String str = null;
            System.out.println(str.length()); 

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
        finally{
        	System.out.println("Program Ended");
        }
        
    }
}