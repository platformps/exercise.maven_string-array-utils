package com.github.perscholas;

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
     String valueFirst = array[0];
        return (valueFirst);
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        String valueSecond = array[1];
        return (valueSecond);
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String valueLast = array[array.length-1];
        return (valueLast);
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String valueSecondLast = array[array.length-2];
        return (valueSecondLast);
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String element : array) {
            if (element == value)
                return true;
            }
        return false;
    }


    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String [] newArray = new String[array.length];
        for(int i = 0;i<array.length;i++) {
            newArray[i] = array[array.length - i - 1];
        }
        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static Boolean isPalindromic(String[] array) {
        String [] newArray = new String[array.length];  //or just call the reverse(array) function
        for(int i = 0;i<array.length;i++) {
            newArray[i] = array[array.length - i - 1];
        }
        return Arrays.equals(array, newArray);

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static Boolean isPangramic(String[] array) {
        //String[] array = {"The quick brown", "Fox jumps over", "The lazy dog"};
        String elements = "";
        for (int i = 0; i < array.length; i++){
            elements += array[i];
    }
        //System.out.println(elements); made an entire strings from array elements to compare
        boolean[] mark = new boolean[26];

        // For indexing in mark[]
        int index = 0;

        // Traverse all characters
        for (int i = 0; i < elements.length(); i++) {
            // If uppercase character, subtract 'A' to find index.
            if ('A' <= elements.charAt(i) && elements.charAt(i) <= 'Z')
                index = elements.charAt(i) - 'A';

                // If lowercase character, subtract 'a'
                // to find index.
            else if ('a' <= elements.charAt(i) && elements.charAt(i) <= 'z') {
                index = elements.charAt(i) - 'a';
            }

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

         //If all characters were present
        return (true);
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (String val:array) {
            if (val.equals(value))
                count++;
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> newArray = new ArrayList();
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
        List<String> newArraylist = new ArrayList();

        newArraylist.add(array[0]);

        for(int i=1;i<array.length;i++) {
            if(array[i]!=newArraylist.get(newArraylist.size()-1)) {
                newArraylist.add(array[i]);
            }
        }

        int lstSize = newArraylist.size();
        String[] revisedArray = new String[lstSize];
        for(int i = 0; i < lstSize; i++) {
            revisedArray[i] = newArraylist.get(i);
        }
        return revisedArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArray = new ArrayList();
        int count = 0;
        int element = 0;
        for(int i = 0; i<array.length; i++){
            if(count > 0 ) {
                count--;
                continue;
            }
            newArray.add(array[i]);
            for(int j = i+1; j<array.length;j++){
                if(array[j].equals(array[i])) {
                    newArray.set(element, newArray.get(element) + array[j]);
                    count ++;

                }
                else
                    break;
            }
            element++;
        }
        String[] revisedArray = new String[newArray.size()];
        return  newArray.toArray(revisedArray);
    }


}
