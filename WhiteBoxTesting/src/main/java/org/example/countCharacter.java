package org.example;

//Function to calculate
public class countCharacter {
    public static int countOccurrences(char[] arr, char ch) {
        int count = 0;                              //CFG Node: 1
        for (int i = 0; i < arr.length;) {          //CFG Node: 2
            char c = arr[i];                        //CFG Node: 2
            if (c == ch) {                          //CFG Node: 3
                count++;                            //CFG Node: 4
            }
        i++;                                        //CFG Node: 5
        }
        return count;                               //CFG Node: 6
    }                                               //CFG Node: 7
    // Main to locally test
    public static void main(String args[]){
        char[] array = new char[5];
        array[0] = 'q';
        array[1] = 'a';
        array[2] = 's';
        array[3] = 'd';
        int x =countOccurrences(array, 'd');
    System.out.print("Count = " + x);
    }
}
