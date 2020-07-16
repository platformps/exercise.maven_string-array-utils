package com.github.perscholas;

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
        for (String s : array) {
            if(s.equals(value)) {
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
        String[] reversedArray = new String[array.length];
        int counter = 0;
        for (int i = array.length-1; i >= 0; i--) {
            reversedArray[counter] = array[i];
            counter++;
        }
        return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static Boolean isPalindromic(String[] array) {
        String[] reversedArray = reverse(array);
        for (int i = 0; i < array.length; i++) {
            if(!array[i].equals(reversedArray[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static Boolean isPangramic(String[] array) {
        String temp = "";
        int letter = 0;
        boolean[] letterIsPresent = new boolean[26];
        for(int i = 0; i < array.length; i++) {
            temp = array[i].toLowerCase();
            for(int j = 0; j < temp.length(); j++) {
                letter = ((int) temp.charAt(j) - 97);
                if (letter >= 0 && letter <= 25) {
                    letterIsPresent[letter] = true;
                }
            }
        }
        for (int i = 0; i < letterIsPresent.length; i++) {
            if(!letterIsPresent[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurrenceCount = 0;
        for (String s : array) {
            if (s.equals(value)) {
                occurrenceCount++;
            }
        }
        return occurrenceCount;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] arrayWithValueRemoved = new String[(array.length-1)];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(!valueToRemove.equals(array[i])) {
                arrayWithValueRemoved[counter] = array[i];
                counter++;
            }
        }
        return arrayWithValueRemoved;
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
