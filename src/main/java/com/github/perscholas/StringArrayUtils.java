package com.github.perscholas;

import java.util.*;

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

        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String  i: array) {
            if (i.equals(value))
                return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String [] tempArray = new String[array.length];
        for(int i = 0;i<array.length;i++)
            tempArray[i] = array[array.length-i-1];
        return tempArray;
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
        String arrayString = Arrays.toString(array);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String Uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i<alphabet.length();i++) {
            if(!arrayString.contains(String.valueOf(alphabet.charAt(i))) && !arrayString.contains(String.valueOf(Uppercase.charAt(i))) )
                    return false;
            }

        return true ;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (String val:array) {
            if (val.equals(value))
                counter++;
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> newArray = new ArrayList<String>();
        if (!contains(array,valueToRemove))
            return array;
        for (String s : array) {
            if (s.equals(valueToRemove))
                continue;
            newArray.add(s);
        }
        String[] tempArray = new String[newArray.size()];
        return  newArray.toArray(tempArray);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> newArray = new ArrayList<String>();
        int skip = 0;
        for(int i = 0; i <array.length; i++) {
            if (skip > 0) {
                skip--;
                continue;
            }
            newArray.add(array[i]);
            for(int j =i+1; j<array.length;j++){
                if (array[i].equals(array[j])) {
                    skip++;
                }
                else
                    break;
            }
        }

        String[] tempArray = new String[newArray.size()];
        return  newArray.toArray(tempArray);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> newArray = new ArrayList<String>();
        int skip = 0;
        int currIndex = 0;
        for(int i = 0; i<array.length; i++){
            if(skip > 0 ) {
                skip--;
                continue;
            }
            newArray.add(array[i]);
            for(int j = i+1; j<array.length;j++){
                if(array[j].equals(array[i])) {
                    newArray.set(currIndex, newArray.get(currIndex) + array[j]);
                    skip ++;

                }
                else
                    break;
            }
            currIndex++;
        }
        System.out.println(newArray);
        String[] tempArray = new String[newArray.size()];
        return  newArray.toArray(tempArray);
    }


}
