package com.github.perscholas;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */
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
     */
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */
    public static boolean contains(String[] array, String value) {
        for(String s: array){
            if(s == value)
                return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */
    public static String[] reverse(String[] array) {
        String[] newArray = new String[array.length];
        for (int i = 0; i < array.length; i++) { //itar
            newArray[i] = array[array.length-i-1];
        }
        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */
    public static Boolean isPalindromic(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] != array[array.length-1-i])
                return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */
    public static Boolean isPangramic(String[] array) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String str = Arrays.toString(array);
        for(int i = 0; i < 26; i++){
            if(!str.toLowerCase().contains(Character.toString(alphabet.charAt(i))))
                return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */
    public static int getNumberOfOccurrences(String[] array, String value) {
        int num = 0;
        for(String str: array){
            if(str == value)
                num ++;
        }
        return num;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == valueToRemove)
                continue;
            else list.add(array[i]);
        }
        return list.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> list = new ArrayList<String>();
        list.add(array[0]);
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] != array[i+1])
                list.add(array[i+1]);
        }
        String[] result = new String[list.size()];
        return list.toArray(result);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> list = new ArrayList<String>();
        String str = array[0];
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] == array[i+1]){
                str = str + array[i+1];
            }
            else {
                    list.add(str);
                    str = array[i+1];

            }
        }
        if(str != "") list.add(str);
        else list.add(array[array.length-1]);

        String[] result = new String[list.size()];
        return list.toArray(result);
    }


}
