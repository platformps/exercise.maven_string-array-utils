package com.github.perscholas;

import javax.lang.model.element.NestingKind;
import javax.xml.validation.Validator;
import java.util.ArrayList;
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
        String result = array[array.length - 1];
        return result;
        }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String result = array[array.length - 2];
        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
            boolean arrContains = false;
        for (int i = 0; i < array.length ; i++) {

            if (array[i].contains(value)){
                arrContains = true;
                break;
            }

        }
        return arrContains;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int count = 0;
        String[] reverseArr = new String[array.length];
        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < 1;j++) {
                reverseArr[count] = array[i - 1];
                count++;
            }
        }

        return reverseArr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static Boolean isPalindromic(String[] array) {
        String[] copy = array;
        int count = 0;
        boolean result = false;
        if (array.length % 2 != 0) {
            for (int i = array.length; i > 0; i--) {
                for (int j = 0; j < 1; j++) {
                    if (copy[count] == array[i - 1]) {
                        result = true;
                        count++;
                    } else {
                        result = false;
                    }

                }
            }
        } else {
            result = false;
        }

        return result;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static Boolean isPangramic(String[] array) {
        String result = "";
        boolean answer = false;
        for (int i = 0; i < array.length ; i++) {
            if(array[i].matches("^[a-zA-Z]*$")){
                answer = true;
            }else {
                answer = false;
            }
        }

        return answer;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i].equals(value)){
                count++;
            }
        }
            return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> listOccurence = new ArrayList<>();

        for (int i = 0; i < array.length ; i++) {
            listOccurence.add(array[i]);
        }
        for (int j = 0; j < listOccurence.size(); j++) {
            if (listOccurence.contains(valueToRemove)){
                listOccurence.remove(valueToRemove);
            }
        }

        String[] array2 = new String[listOccurence.size()];
        listOccurence.toArray(array2);
        return array2;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> removeDuplicates = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            if (!removeDuplicates.contains(array[i])) {
                count++;
                removeDuplicates.add(array[i]);

            }
        }
        String[] convertList = new String[count];
        convertList = removeDuplicates.toArray(convertList);
        return convertList;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        char[] char2dArray = new char[1000];
        String[] myArr = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (char2dArray[j] == array[i].charAt(j)) {
                    myArr[i] = String.valueOf(char2dArray[i - 1] + char2dArray[i]);
                } else {
                    myArr[i] = String.valueOf(char2dArray[i]);
                }
            }

        }
        return myArr;
    }
}
