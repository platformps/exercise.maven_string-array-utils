package com.github.perscholas;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean found = false;
        int position = 0;
        while(found == false && position < array.length){
            if(array[position].contains(value)){
                found = true;
            }
            else{
                position++;
            }
        }
        return found;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverseArray = new String[array.length];
        int reverseArrayPostion = 0;

        for(int count = array.length - 1; count > -1; count--){
            reverseArray[reverseArrayPostion] = array[count];
            reverseArrayPostion++;
        }
        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static Boolean isPalindromic(String[] array) {
       return Arrays.equals(array, reverse(array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static Boolean isPangramic(String[] array) {
        String alphabetList = "abcdefghijklmnopqrstuvwxyz";
        int postion = 0;
        boolean arrayIsStillPangramic = true;
        while(arrayIsStillPangramic && postion < alphabetList.length()){
            //Gross
            if(contains(array, String.valueOf(alphabetList.charAt(postion))) || contains(array, String.valueOf(Character.toUpperCase(alphabetList.charAt(postion))))){
                postion++;
            }
            else{
                arrayIsStillPangramic = false;
            }
        }
        return arrayIsStillPangramic;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurrences = 0;
        for(String word : array){
            if(word == value){
                occurrences++;
            }
        }
        return occurrences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int removeValues = getNumberOfOccurrences(array, valueToRemove);
        int nextWordAdded = 0;
        String[] returnArray = new String[array.length - removeValues]; // will have the length of the array without the removed values
        for(int pos = 0; pos < array.length; pos++){
            if(array[pos].equals(valueToRemove)) {

            }
            else{
                returnArray[nextWordAdded] = array[pos];
                nextWordAdded++;
            }
        }
        return returnArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array){
        int pos = 0;
        //String[] returnArray = new String[];
        String currentString, previousString;
        currentString = array[0];
        previousString = currentString;
        pos++;
        while(pos < array.length){
            currentString = array[pos];

        }
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int position = 0;
        String previousString;
        String currentString = array[position];
        StringBuilder sb = new StringBuilder("");
        position++;
        return null;
    }

}
