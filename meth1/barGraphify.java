public class barGraphify{

  public static void barGraphify(int[] array){

    for(int i = 0; i < array.length; i++){

      System.out.print(i + ": "); //print out index number

      for(int j = 0; j < array[i]; j++){
        System.out.print("="); //iterate through and print all "="
      }

      System.out.println(); //Start a new line
/*
      switch(array[i])
      {

        case 0: System.out.println();//no output
        break;
        case 1: System.out.println("="); // if array[i]==1
        break;
        case 2: System.out.println("==");
        break;
        case 3: System.out.println("===");
        break;
        default: System.out.println("default");//default case
        break;
      }
*/
      //System.out.println(array[i]);
    }
  }

  public static void main(String[] args) {

    int[] arrayNums1 = {1,0,2,3}; //initialize a new arrayNums1
    int[] arrayNums2 = {4,6,8,10,12}; //initialize a new arrayNums2

    System.out.println("Array 1: ");
    barGraphify(arrayNums1);
    System.out.println("\nArray 2: ");
    barGraphify(arrayNums2);
  }
}

// for x = {0,1,2,3}:
// barGraphify(x)
// 0:
// 1: =
// 2: ==
// 3: ===


// and for x = {1,0,3,2}
// barGraphify(x)
// 0: =
// 1:
// 2: ===
// 3: ==
