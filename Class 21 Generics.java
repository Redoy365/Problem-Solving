import java.util.*;

class Printer <T>{
    void printArray(T arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

public class java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }
        n = scanner.nextInt();
        String[] strigArray = new String[n];

        for (int i = 0; i < n; i++) {
            strigArray[i] = scanner.next();
        }
        Printer < Integer > intPrinter = new Printer < Integer > ();
        Printer < String > stringPrinter = new Printer < String > ();
        intPrinter.printArray(intArray);
        stringPrinter.printArray(strigArray);
        if (Printer.class.getDeclaredMethods().length > 1) {
            System.out.println("The Printer class should only have 1 method named pri ntArray.");

        }
    }
}