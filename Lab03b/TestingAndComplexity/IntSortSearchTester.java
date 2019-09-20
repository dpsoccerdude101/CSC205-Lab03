package TestingAndComplexity;
import java.util.Random;
public class IntSortSearchTester {
    Random rand = new Random(); 
    int randomInt = rand.nextInt(100);

    //This hard-codes the test data for linearSearch method
    public static void linearSearchTester()  {
        Random rand = new Random(); 

        //Array containing one element only, and the value being
        //searched for is the element in the array 
        int [] oneElemA = new int[] {rand.nextInt(100)};
        int oneElem1 = oneElemA[0];

        //Array containing one element only, and the value being 
        //searched for is NOT the element in the array 
        int [] oneElemB = new int[] {rand.nextInt(100)};
        int oneElem2 = rand.nextInt(100);
        //make sure that the element is not in the array
        while (oneElem2 == oneElemB[0])
            oneElem2 = rand.nextInt(100);

        //Array containing two unequal elements, and the value being
        //searched for is one of the elements of the array 
        int [] twoElemA = new int[] {rand.nextInt(100), rand.nextInt(100)};
        //make sure that the elements in the array are not equal to each other
        while (twoElemA[0] == twoElemA[1])
            twoElemA[1] = rand.nextInt(100);
        int twoElem1 = twoElemA[0];

        //Array containing two unequal elements, and the value being
        //searched for is NOT ANY of the elements of the array 
        int [] twoElemB = new int[] {rand.nextInt(100), rand.nextInt(100)};
        //make sure that the elements in the array are not equal to each other
        while (twoElemB[0] == twoElemB[1])
            twoElemB[1] = rand.nextInt(100);
        int twoElem2 = rand.nextInt(100);
        while ((twoElem2 == twoElemB[0]) || (twoElem2 == twoElemB[1]))
            twoElem2 = rand.nextInt(100);

        //Array containing 3 elements, and the value being
        //searched for is the very first element of the array 
        int [] threeElemA = new int[] {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)};
        int threeElem1 = threeElemA[0];

        //Array containing 3 elements, and the value being
        //searched for is the very last element of the array 
        int [] threeElemB = new int[] {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)};
        int threeElem2 = threeElemB[2];

        //Array containing 3 elements, and the value being
        //searched for is the middle element 
        int [] threeElemC = new int[] {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)};
        int threeElem3 = threeElemC[1];

        //Array containing 3 elements, and the value being
        //searched for is NOT ANY of the elements in the array 
        int [] threeElemD = new int[] {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)};
        int threeElem4 = rand.nextInt(100);
        //make sure that the element is not in the array
        while ((threeElem4 == threeElemD[0]) || (threeElem4 == threeElemD[1]) || (threeElem4 == threeElemD[2]))
            threeElem4 = rand.nextInt(100);
    }

    public static void binarySearchTester(){}  //This hard-codes the test data for binarySearch method

    public static void sortTester() {} //This hard-codes the test data for selectionSort method

    public static void main(String[] args){} //method which just calls all the tester methods, using a statement like: IntSortSearch.linearSearchTester();
}