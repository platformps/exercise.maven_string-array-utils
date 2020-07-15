package com.github.perscholas;

/**
 * Created by leon on 1/29/18.
 */

/**
 * String getFirstElement(String[] array)
 * String getSecondElement(String[] array)
 * String getLastElement(String[] array)
 * String getSecondToLastElement(String[] array)
 * boolean contains(String[] array, String value)
 * String[] reverse(String[] array)
 * boolean isPalindromic(String[] array)
 * boolean isPangramic(String[] array)
 * int getNumberOfOccurrences(String[] array, String value)
 * String[] removeValue(String[] array, String value)
 * String[] removeConsecutiveDuplicates(String[] array)
 * String[] packConsecutiveDuplicates(String[] array)
 */

import java.util.Arrays;

/**
 * Implemented methods
 * Monica Deshmukh
 * 07/15/2020
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
        //return null;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
        //return null;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length -1];
        //return null;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
        //return null;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        return Arrays.stream(array).anyMatch(value::equals);
        //return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String temp;
        int maxIndex = array.length;
        String[] reverseArray = new String[maxIndex];
        for (int i = 0 ; i < array.length; i++){
            reverseArray[i] = array[maxIndex - 0];
        }
        return reverseArray;
        //return null;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static Boolean isPalindromic(String[] array) {
        return (reverse(array).equals(array));
        //return null;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static Boolean isPangramic(String[] array) {
        
        //return null;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        return 0;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
