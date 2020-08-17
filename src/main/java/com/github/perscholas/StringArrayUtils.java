package com.github.perscholas;

import java.lang.String;
import java.lang.*;
import java.io.*;
import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    //create method to return first element of the array
    // public means that the method is visible and can be called from other objects
    // static means that the method is associated with the class 'StringArrayUtils',
    // not a specific instance (object) of that class.
    // We can call a static method without creating an object of the class.
    public static String getFirstElement(String[] array) {
        // declare non-primitive variable that holds an array of strings
        //use array literal - place values in comma separated list
        String[] someArray = {"quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        //declare variable to store result
        String firstElement = someArray[0];
        return firstElement;
    }
        //System.out.println(someArray[0]);
        //find length
        //System.out.println(someArray.length);


    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        String[] someArray = {"quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String secondElement = someArray[1];
        return secondElement;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String[] someArray = {"quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        // since the first element has index of [0], the last element is array length 8-1=7
        String lastElement = someArray[someArray.length-1];
        return lastElement;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String[] someArray = {"quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String secondToLastElement = someArray[someArray.length-2];
        return secondToLastElement;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static Boolean contains(String[] array, String value) {
        String[] someArray = {"quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String indexThreeValue = "jumps";
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(indexThreeValue)) {
                return true;
            }
        }
        return false;

       /*
        for(String i: someArray) {
            if(i == "jumps");{
            return true;
            {
                return false;
                }
        }

        */
    }




    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String [] Reverse(String[] array){
            // function to reverse an array and stores it in another array 'reverseArray'
            String[] reverseArray = new String[array.length];
            for (int i = 0; i < array.length; i++)
                reverseArray[i] = array[array.length - i - 1];
                return reverseArray;
        }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static Boolean isPalindromic(String[] array) {
        int arrayLength = array.length;
        int counter = 0;
        if(arrayLength % 2 == 0) {
            for (int i = 0; i < arrayLength/2; i++) {
                if(array[i] == array[arrayLength - i - 1]) {
                    counter++;
                    continue;
                }
                break;
            }
        } else {
            for (int i = 0; i < arrayLength/2 - 1; i++) {
                if(array[i] == array[arrayLength - i - 1]) {
                    counter++;
                    continue;
                }
                break;
            }
        }
        if(counter == arrayLength/2 - 1) return true;
        return false;
    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO


    //A Pangram is a sentence containing every letter in the English Alphabet.
    //
    //Examples : The quick brown fox jumps over the lazy dog ” is a Pangram [Contains all the characters from ‘a’ to ‘z’]
    //“The quick brown fox jumps over the dog” is not a Pangram [Doesn’t contains all the characters from ‘a’ to ‘z’, as ‘l’, ‘z’, ‘y’ are missing]
    //Solution1
    /*
    public Boolean isPangramic(String[] array) {
        String[] alphabets = {"A","B","C","D","E","F","G","H","I","J","K","L",
                "M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
                "a","b","c","d","e","f","g","h","i","j",
                "k","l","m","n","o","p","q","r",
                "s","t","u","v","w","x","y","z"};

        char value;
        String input = "";
        for (int i = 0; i < array.length; i++){
            input = array[i];
            for (int j = 0; j < input.length(); j++) {
                if (alphabets.toString((input.charAt(j));
                    input = Character.toString(input.charAt(j));
                if (contains(alphabets, input)){
                    removeValue(alphabets, input);
                    if (alphabets.length == 0)
                        return true;
                }
            }
        }
        return false;
    }
*/
    //Solution2
    public static boolean isPangramic(String str)
    {
        // Create a hash table to mark the
        // characters present in the string
        // By default all the elements of mark would be false.
        boolean[] mark = new boolean[26];

        // For indexing in mark[]
        int index = 0;

        // Traverse all characters
        for (int i = 0; i < str.length(); i++) {
            // If uppercase character, subtract 'A' to find index.
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
                index = str.charAt(i) - 'A';

                // If lowercase character, subtract 'a'
                // to find index.
            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')

                index = str.charAt(i) - 'a';

                // If this character is other than english
                // lowercase and uppercase characters.
            else
                continue;
            mark[index] = true;
        }

        // Return false if any character is unmarked
        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);

        // If all characters were present
        return (true);
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "The quick brown fox jumps over the lazy dog";

        if (isPangramic(str) == true)
            System.out.print(str + " is a pangram.");
        else
            System.out.print(str + " is not a pangram.");
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(value)) counter++;
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] someArray = new String [array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToRemove) {
                continue;
            } else {
                someArray[j] = array[i];
                j++;
            }

        }
        return someArray;
    }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String[] someArray = new String[30];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) { //set both [0] values
                someArray[j] = array[i];
                continue;
            } else if (someArray[j] == array[i]) {
                continue; //if the indices match don't save the value; increment i
            } else {
                someArray[j+1] = array[i]; // if [i] & [j] do not match, save [i] at [j + 1]
                if (i == array.length) {
                    continue;
                }
            }
            j++;
        }
        String[] newArray = new String[j+1];
        for (int k = 0; k < newArray.length; k++) {
            newArray[k] = newArray[k];
        }
        return newArray;
    }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String[] someArray = new String[30];
        int j = 0;
        String tempValue;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) { //set both [0] values
                someArray[j] = array[i];
                continue;
            } else if (someArray[j] == array[i]) {
                tempValue = someArray[j]; //if the indices match save [j] as tempValue; add [i] to [j]
                someArray[j] += array[i];
                if ((i + 1 <= array.length - 1) && tempValue == array[i + 1]) { //if we don't go beyond the index limit,
                    someArray[j] += array[i + 1];  //and tempValue == [i+1], add [i+1] to [j]
                    i++; //advance [i] because it will be removed and to check for a match with the next element
                    if ((i + 1 <= array.length - 1) && tempValue == array[i + 1]) {  //if we don't go beyond the index limit,
                        someArray[j] += array[i + 1];  //and tempValue == [i+1], add [i+1] to [j] again
                        i++; // advance [i] because it will be removed
                    } else {
                        continue;
                    }
                }
            } else {
                someArray[j + 1] = array[i]; // if [i] & [j] do not match, save [i] at [j + 1]
                j++; //increment [j]
                if (i <= array.length) {
                    continue;
                }
            }
        }
        String[] newArray = new String[j + 1];
        for (int k = 0; k < newArray.length; k++) {
            newArray[k] = someArray[k];
        }
        return newArray;
    }

    }


