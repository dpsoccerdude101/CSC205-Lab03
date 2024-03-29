package TestingAndComplexity;
import java.util.Random;
public class IntSortSearchTester {
    //non-static random object
    Random rand = new Random(); 
    int randomInt = rand.nextInt(100 + 100) -100;

    //method which just calls all the tester methods, using a statement like: IntSortSearch.linearSearchTester();
    public static void main(String [] args) {
        //Test Case 1, 2, and 3 for linearSearch method
        System.out.println("Testing for linearSearch of the IntSortSearch class\n");
        for (int count = 0; count < 3; count++) {
            IntSortSearchTester.linearSearchTester();
            System.out.println("\n****************************************\n");
        }

        //Test Case 1, 2, and 3 for binarySearch method
        System.out.println("Testing for binarySearch of the IntSortSearch class\n");
        for (int count = 0; count < 3; count++) {
            IntSortSearchTester.binarySearchTester();
            System.out.println("\n****************************************\n");
        }
        
        //Test Case 1, 2, and 3 for selectionSort method
        System.out.println("Testing for selectionSort of the IntSortSearch class\n");
        for (int count = 0; count < 3; count++) {
            IntSortSearchTester.sortTester();
            System.out.println("\n****************************************\n");
        }
    } 

    //This hard-codes the test data for linearSearch method
    public static void linearSearchTester()  {
        //prompts       
        String prompt1 = "Array containing one element only, and the value being searched for is the element in the array ";
        String prompt2 = "Array containing one element only, and the value being searched for is NOT the element in the array";
        String prompt3 = "Array containing two unequal elements, and the value being searched for is one of the elements of the array";
        String prompt4 = "Array containing two unequal elements, and the value being searched for is NOT ANY of the elements of the array";
        String prompt5 = "Array containing 3 elements, and the value being searched for is the very first element of the array";
        String prompt6 = "Array containing 3 elements, and the value being searched for is the very last element of the array";
        String prompt7 = "Array containing 3 elements, and the value being searched for is the middle element";
        String prompt8 = "Array containing 3 elements, and the value being searched for is NOT ANY of the elements in the array";
        String [] prompts = new String [] {prompt1, prompt2, prompt3, prompt4, prompt5, prompt6, prompt7, prompt8};

        //declare all variables
        int [] oneElemA, oneElemB, twoElemA, twoElemB, threeElemA, threeElemB, threeElemC, threeElemD;
        int oneElem1, oneElem2, twoElem1, twoElem2, threeElem1, threeElem2, threeElem3, threeElem4;

        //all random integers are in the range of (-99 , 99)
        Random rand = new Random(); 

        //Array containing one element only, and the value being
        //searched for is the element in the array 
        oneElemA = new int[] {rand.nextInt(100 + 100) -100};
        oneElem1 = oneElemA[0];

        //Array containing one element only, and the value being 
        //searched for is NOT the element in the array 
        oneElemB = new int[] {rand.nextInt(100 + 100) -100};
        oneElem2 = rand.nextInt(100 + 100) -100;
        //make sure that the element is not in the array
        while (oneElem2 == oneElemB[0])
            oneElem2 = rand.nextInt(100 + 100) -100;

        //Array containing two unequal elements, and the value being
        //searched for is one of the elements of the array 
        twoElemA = new int[] {rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100};
        //make sure that the elements in the array are not equal to each other
        while (twoElemA[0] == twoElemA[1])
            twoElemA[1] = rand.nextInt(100 + 100) -100;
        twoElem1 = twoElemA[0];

        //Array containing two unequal elements, and the value being
        //searched for is NOT ANY of the elements of the array 
        twoElemB = new int[] {rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100};
        //make sure that the elements in the array are not equal to each other
        while (twoElemB[0] == twoElemB[1])
            twoElemB[1] = rand.nextInt(100 + 100) -100;
        twoElem2 = rand.nextInt(100 + 100) -100;
        while ((twoElem2 == twoElemB[0]) || (twoElem2 == twoElemB[1]))
            twoElem2 = rand.nextInt(100 + 100) -100;

        //Array containing 3 elements, and the value being
        //searched for is the very first element of the array 
        threeElemA = new int[] {rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100};
        threeElem1 = threeElemA[0];

        //Array containing 3 elements, and the value being
        //searched for is the very last element of the array 
        threeElemB = new int[] {rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100};
        threeElem2 = threeElemB[2];

        //Array containing 3 elements, and the value being
        //searched for is the middle element 
        threeElemC = new int[] {rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100};
        threeElem3 = threeElemC[1];

        //Array containing 3 elements, and the value being
        //searched for is NOT ANY of the elements in the array 
        threeElemD = new int[] {rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100};
        threeElem4 = rand.nextInt(100 + 100) -100;
        //make sure that the element is not in the array
        while ((threeElem4 == threeElemD[0]) || (threeElem4 == threeElemD[1]) || (threeElem4 == threeElemD[2]))
            threeElem4 = rand.nextInt(100 + 100) -100;

        int [] arrayOfElements = {oneElem1, oneElem2, twoElem1, twoElem2, threeElem1, threeElem2, threeElem3, threeElem4};
        int [] [] allArrays = {oneElemA, oneElemB, twoElemA, twoElemB, threeElemA, threeElemB, threeElemC, threeElemD};

        int element;
        int [] array;
        int position;
        for (int count = 0; count < 8; count++) {
            element = arrayOfElements[count];
            array = allArrays[count];

            position = IntSortSearch.binarySearch(array, element);
            String output;
            if (position >= 0){
                output = ("In searching for " + element + " in the " + prompts[count]);
                output += (", aka " + toString(allArrays[count]) + ", " + element + " was found at position " + position + ".");
                System.out.println(output);
            }
            else {
                output = ("In searching for " + element + " in the " + prompts[count]);
                output += (", aka " + toString(allArrays[count]) + ", " + element + " was not found.");
                System.out.println(output);
            }
        }
    }

    //This hard-codes the test data for binarySearch method
    public static void binarySearchTester(){
        //prompts       
        String prompt1 = "Array containing one element only, and the value being searched for is the element in the array ";
        String prompt2 = "Array containing one element only, and the value being searched for is NOT the element in the array";
        String prompt3 = "Array containing two unequal elements, and the value being searched for is one of the elements of the array";
        String prompt4 = "Array containing two unequal elements, and the value being searched for is NOT ANY of the elements of the array";
        String prompt5 = "Array containing 3 elements, and the value being searched for is the very first element of the array";
        String prompt6 = "Array containing 3 elements, and the value being searched for is the very last element of the array";
        String prompt7 = "Array containing 3 elements, and the value being searched for is the middle element";
        String prompt8 = "Array containing 3 elements, and the value being searched for is NOT ANY of the elements in the array";
        String [] prompts = new String [] {prompt1, prompt2, prompt3, prompt4, prompt5, prompt6, prompt7, prompt8};

        //declare all variables
        int [] oneElemA, oneElemB, twoElemA, twoElemB, threeElemA, threeElemB, threeElemC, threeElemD;
        int oneElem1, oneElem2, twoElem1, twoElem2, threeElem1, threeElem2, threeElem3, threeElem4;

        //all random integers are in the range of (-99 , 99)
        Random rand = new Random(); 

        //Array containing one element only, and the value being
        //searched for is the element in the array 
        oneElemA = new int[] {rand.nextInt(100 + 100) -100};
        oneElem1 = oneElemA[0];

        //Array containing one element only, and the value being 
        //searched for is NOT the element in the array 
        oneElemB = new int[] {rand.nextInt(100 + 100) -100};
        oneElem2 = rand.nextInt(100 + 100) -100;
        //make sure that the element is not in the array
        while (oneElem2 == oneElemB[0])
            oneElem2 = rand.nextInt(100 + 100) -100;

        //Array containing two unequal elements, and the value being
        //searched for is one of the elements of the array 
        twoElemA = new int[] {rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100};
        //make sure that the elements in the array are not equal to each other
        while (twoElemA[0] == twoElemA[1])
            twoElemA[1] = rand.nextInt(100 + 100) -100;
        twoElem1 = twoElemA[0];

        //Array containing two unequal elements, and the value being
        //searched for is NOT ANY of the elements of the array 
        twoElemB = new int[] {rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100};
        //make sure that the elements in the array are not equal to each other
        while (twoElemB[0] == twoElemB[1])
            twoElemB[1] = rand.nextInt(100 + 100) -100;
        twoElem2 = rand.nextInt(100 + 100) -100;
        while ((twoElem2 == twoElemB[0]) || (twoElem2 == twoElemB[1]))
            twoElem2 = rand.nextInt(100 + 100) -100;

        //Array containing 3 elements, and the value being
        //searched for is the very first element of the array 
        threeElemA = new int[] {rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100};
        threeElem1 = threeElemA[0];

        //Array containing 3 elements, and the value being
        //searched for is the very last element of the array 
        threeElemB = new int[] {rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100};
        threeElem2 = threeElemB[2];

        //Array containing 3 elements, and the value being
        //searched for is the middle element 
        threeElemC = new int[] {rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100};
        threeElem3 = threeElemC[1];

        //Array containing 3 elements, and the value being
        //searched for is NOT ANY of the elements in the array 
        threeElemD = new int[] {rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100, rand.nextInt(100 + 100) -100};
        threeElem4 = rand.nextInt(100 + 100) -100;
        //make sure that the element is not in the array
        while ((threeElem4 == threeElemD[0]) || (threeElem4 == threeElemD[1]) || (threeElem4 == threeElemD[2]))
            threeElem4 = rand.nextInt(100 + 100) -100;

        int [] arrayOfElements = {oneElem1, oneElem2, twoElem1, twoElem2, threeElem1, threeElem2, threeElem3, threeElem4};
        int [] [] allArrays = {oneElemA, oneElemB, twoElemA, twoElemB, threeElemA, threeElemB, threeElemC, threeElemD};

        //sort all arrays
        for (int count = 0; count < allArrays.length; count++) {
            IntSortSearch.selectionSort(allArrays[count]);
        }

        int element;
        int [] array;
        int position;
        for (int count = 0; count < 8; count++) {
            element = arrayOfElements[count];
            array = allArrays[count];

            position = IntSortSearch.binarySearch(array, element);
            String output;
            if (position >= 0){
                output = ("In searching for " + element + " in the " + prompts[count]);
                output += (", aka " + toString(allArrays[count]) + ", " + element + " was found at position " + position + ".");
                System.out.println(output);
            }
            else {
                output = ("In searching for " + element + " in the " + prompts[count]);
                output += (", aka " + toString(allArrays[count]) + ", " + element + " was not found.");
                System.out.println(output);
            }
        }
    }  

    //This hard-codes the test data for selectionSort method
    public static void sortTester() {
        //prompts
        String prompt1 = "Array containing one element only";
        String prompt2 = "Array containing two unequal elements";
        String prompt3 = "Array containing 3 elements, already sorted";
        String prompt4 = "Array containing 3 elements, already sorted in the reverse order"; 
        String prompt5 = "Array containing 3 elements, all of them negative";
        String prompt6 = "Array containing 3 elements, one negative, one zero, one positive";
        String prompt7 = "Array containing 3 elements, all of them the same value (like: 5,5,5)";
        String [] prompts = new String [] {prompt1, prompt2, prompt3, prompt4, prompt5, prompt6, prompt7};
        //declare all variables
        int [] oneElemA,twoElemA, threeElemA, threeElemB, threeElemC, threeElemD, threeElemE;

        Random rand = new Random();
        //Array containing one element only
        oneElemA = new int[] {rand.nextInt(100 + 100) - 100};

        //Array containing two unequal elements
        twoElemA = new int[] {rand.nextInt(100 + 100) - 100, rand.nextInt(100 + 100) - 100};
        //make sure that the elements in the array are not equal to each other
        while (twoElemA[0] == twoElemA[1])
            twoElemA[1] = rand.nextInt(100 + 100) - 100;

        //Array containing 3 elements, already sorted
        threeElemA = new int[] {rand.nextInt(100 + 100) - 100, rand.nextInt(100 + 100) - 100, rand.nextInt(100 + 100) - 100};
        bubbleSort(threeElemA);

        //Array containing 3 elements, already sorted in the reverse order
        threeElemB = new int[] {rand.nextInt(100 + 100) - 100, rand.nextInt(100 + 100) - 100, rand.nextInt(100 + 100) - 100};
        bubbleSort(threeElemB);
        //reverse order
        int temp;
        temp = threeElemB[0];
        threeElemB[0] = threeElemB[2];
        threeElemB[2] = temp;

        //Array containing 3 elements, all of them negative
        threeElemC = new int[] {rand.nextInt(100) - 100, rand.nextInt(100) - 100, rand.nextInt(100) - 100};

        //Array containing 3 elements, one negative, one zero, one positive
        threeElemD = new int[] {rand.nextInt(100) - 100, 0, rand.nextInt(100)};

        //Array containing 3 elements, all of them the same value (like: 5,5,5)
        int perm = rand.nextInt(100 + 100) - 100;
        threeElemE = new int[] {perm, perm, perm};

        int [] [] allArrays = {oneElemA,twoElemA, threeElemA, threeElemB, threeElemC, threeElemD, threeElemE};
        int [] array, expectedArray, ogArray;
        String output;
        for (int count = 0; count < 7; count++) {
            array = allArrays[count];
            
            //preserve original array
            ogArray = array.clone();
            
            //expected output
            expectedArray = array.clone();
            bubbleSort(expectedArray);

            //test the selectionSort method
            IntSortSearch.selectionSort(array);
            //print statements
            output = ("In sorting the " + prompts[count] + ", aka " + toString(ogArray));
            output += (", the expected array is " + toString(expectedArray));
            output += (". The actual sorted array using the selectionSort method is " + toString(array) + ".");
            System.out.println(output);
        }
    } 

    public static void bubbleSort(int[] a) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static String toString(int [] a) {
        String answer = "[";
        for (int count = 0; count < a.length; count++) {
            answer += (a[count] + ", ");
        }
        answer = answer.substring(0, answer.length() - 2);
        answer += "]";
        return answer;
    }
}