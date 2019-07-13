package arrays.sort;

import java.util.Arrays;

public class Triedenie {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35,1 };

        // To convert the elements as List
        System.out.println("Integer Array as List: "
                + Arrays.asList(intArr));

        //sortovanie
        Arrays.sort(intArr);

        System.out.println("Integer Array: "
                + Arrays.toString(intArr));
    }
}
