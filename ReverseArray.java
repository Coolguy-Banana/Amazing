// ReverseArray.java
public class ReverseArray {

    // Method to reverse an array and return a new array
    public static int[] reverseArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        return reversedArr;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversed = reverseArray(arr);
        
        System.out.print("Reversed array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
        System.out.println();  // Output: 5 4 3 2 1
    }
}
