public class SumClass {
  public static void main(String[] args) {
      // Initialize the array
      int[] arr = {1, 2, 3, 4, 5};
      int sum = sumArray(arr);
      System.out.println("Sum of array elements: " + sum);
  }

  public static int sumArray(int[] arr) {
      int sum = 0; 
      for (int i = 0; i < arr.length; i++) {
          sum += arr[i];
      }
      return sum; 
  }
}
