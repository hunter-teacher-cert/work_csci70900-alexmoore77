public class vertBarGraphify{

  public static void vertBarGraphify(int[] array){

    int largestValue = 0;

    //Iterate through the array and find the largest value
    for(int i = 0; i < array.length; i++){
      if (array[i] > largestValue){
        largestValue = array[i];
      }
    }

    System.out.println("largest value = " + largestValue);


//i=0
//j=0
    //Iterate through the array and print the index
    for(int i = 0; i < array.length; i++){//iterates through every item in the array

      for(int j = 0; j < array[i]; j++){
          if (array[i] >= j){

          }

        System.out.print("*"); //iterate through and print all "="
      }

      System.out.print(i + ": "); //print out index number

      System.out.println(); //Start a new line
  }
}

  public static void main(String[] args) {

    int[] arrayNums1 = {0,1,2,3}; //initialize a new arrayNums1
    int[] arrayNums2 = {4,6,8,10,12}; //initialize a new arrayNums2

    System.out.println("Array 1: ");
    vertBarGraphify(arrayNums1);

    System.out.println("\nArray 2: ");
    vertBarGraphify(arrayNums2);
  }

}


// for x = {0,1,2,3}:
// vertBarGraphify(x)
//       *
//     * *
//   * * *
// 0 1 2 3
//
// for x = {1,0,3,2}:
// vertBarGraphify(x) ->
//     *
//     * *
// *   * *
// 0 1 2 3
