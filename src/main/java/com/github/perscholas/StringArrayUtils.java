package com.github.perscholas;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

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
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean contains = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] newArr = new String[array.length];
        int count = 0;
        for (int i = array.length-1; i >= 0; i-=1) {
            newArr[count] = array[i];
            count++;
        }
        return newArr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static Boolean isPalindromic(String[] array) {
        String[] newArr = reverse(array);
        if (Arrays.equals(newArr, array)) {
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static Boolean isPangramic(String[] array) {
//  Set array of strings to one string
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        String sentence = sb.toString();

        sentence = sentence.toUpperCase();
        sentence = sentence.replaceAll("[^A-Z]", "");

        char[] chars = sentence.toCharArray();

        Set<Character> set = new HashSet<Character>();

        for( int i = 0; i < chars.length; i++ ) set.add(chars[i]);
        if (Objects.equals(set.size(), 26)) {
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
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

        String[] newArr = new String[array.length-1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(valueToRemove)) {
                System.out.println("remove this please");
            } else {
                newArr[count] = array[i];
                count++;
            }
        }
        return newArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        ArrayList<String> newList = new ArrayList<>();
//        Find amount of duplicates so we can create new Array with accurate length
//        Push non duplicates into newList
        newList.add(array[0]);
        System.out.println(newList);
        for (int i = 1; i < array.length; i++) {
            if(array[i-1] != array[i]) {
                newList.add(array[i]);
            }
        }

        String[] myArray = new String[newList.size()];
        newList.toArray(myArray);
        return myArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        //        find duplicates
//        Concatenate duplicates
//        create temp string to hold dulicate values before pushing to list
        String temp = array[0];

        ArrayList<String> newList = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
//            Check for duplicates
            final boolean equals = array[i].equals(array[i - 1]);

            if(equals) {
                temp = temp + array[i];
            } else {
                newList.add(temp);
                temp = array[i];
            }
            if (i == array.length-1) {
                newList.add(temp);
            }
        }

        String[] myArray = new String[newList.size()];
        newList.toArray(myArray);
        return myArray;
    }


}