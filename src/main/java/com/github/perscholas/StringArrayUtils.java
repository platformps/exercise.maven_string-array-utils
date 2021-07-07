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
        boolean truth = false;
        for (String s : array) {
            if (s.equals(value)) {
                truth = true;
                break;
            }

        }
        return truth;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] realArray = new String[array.length];
        int j=0;
        for (int i = array.length-1; i >= 0; i--) {

            realArray[j] = array[i];
            j+=1;
        }
        return realArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static Boolean isPalindromic(String[] array) {
        boolean facts=false;
        int counter=0;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i].equals(array[(array.length - 1)-i])) {
                counter++;
            }


        }
        if(counter== array.length/2)
        {
            facts=true;
        }
        return facts;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static Boolean isPangramic(String[] array) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String sentence = Arrays.toString(array);
        for (int j = 0; j < 26; j++) {
            if(!sentence.toLowerCase().contains(Character.toString(alphabet.charAt(j))))
                return false;
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (String s : array) {
            if (s.equals(value)) {
                counter++;
            }

        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> list =new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(valueToRemove)) {
                continue;
            }
            else {
                list.add((array[i]));
            }
        }
        return list.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String>list=new ArrayList<String>();
        list.add(array[0]); // add the first word in the array because of index problem
        //Arrays.sort(array);
        for (int i = 0; i < array.length-1; i++) {

            if (array[i] != array[i + 1]) {
                list.add(array[i + 1]);
            }
        }
        String[] sentence=new String[list.size()];
        return list.toArray(sentence);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String>list=new ArrayList<String>();
        String s = array[0];

        //Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1])) {
                s+=array[i+1];
            }
            else {
                list.add(s);
                s = array[i+1];
            }
        }
        if(s != "") list.add(s);        // this checks for empty strings
        else list.add(array[array.length-1]);

        String[] sentence = new String[list.size()];
        return list.toArray(sentence);

    }
}
