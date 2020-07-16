package com.github.perscholas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        return Arrays.asList(array).contains(value);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverseArray = new String[array.length];
        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[i] = array[array.length - i - 1];
        }
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
    public static Boolean isPangramic(String[] array) {
        List<String> charList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if(!charList.contains((array[i].charAt(j) + "").toLowerCase()) && !(array[i].charAt(j) + "").equals(" ")) {
                    charList.add((array[i].charAt(j) + "").toLowerCase());
                }
            }
        }
        if(charList.size() == 26) return true;
        return false;
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
        List<String> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i] != valueToRemove) result.add(array[i]);
        }
        return result.toArray(new String[result.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> result = new ArrayList<>();
        String str = array[0];
        for (int i = 1; i < array.length; i++) {
            if(str == array[i]) {
                continue;
            } else {
                result.add(str);
                str = array[i];
            }
        }
        result.add(str);
        return result.toArray(new String[result.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String str = array[0];
        String packStr = str;
        List<String> result = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            if(str == array[i]) {
                packStr += array[i];
            } else {
                result.add(packStr);
                str = array[i];
                packStr = str;
            }
        }
        result.add(packStr);
        return result.toArray(new String[result.size()]);
    }
}


