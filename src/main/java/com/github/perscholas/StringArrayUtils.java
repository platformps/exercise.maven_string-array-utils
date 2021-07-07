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

        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(value)) {
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

        String[] backwards = new String[array.length];
        int j=0;
        for (int i = array.length-1; i >= 0; i--) {
             backwards[j] = array[i];
             j++;
        }
        return backwards;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static Boolean isPalindromic(String[] array) {
        int j = array.length-1;
        for (int i = 0; i < array.length-1; i++) {
            if(!array[i].equals(array[j])) {
                return false;
            }
            j--;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static Boolean isPangramic(String[] array) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String alphabits[] = alphabet.split("");
        for (int k = 0; k < alphabits.length; k++) {
            //  String alphabit = alphabits[k];

            for (int i = 0; i < array.length; i++) {
                array[i] = array[i].toLowerCase();
                if (array[i].contains(alphabits[k])) {
                    break;
                } else if (i == array.length -1) {
                    return false;
                }
              //  System.out.println(array[i] + "  " + alphabits[k]);
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

        int counter =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(value)) {
                counter ++;
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

        String[] newArray = new String [array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToRemove) {
                continue;
            } else {
                newArray[j] = array[i];
                j++;
            }

        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        String[] newArray = new String[30];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) { //set both [0] values
                newArray[j] = array[i];
                continue;
            } else if (newArray[j] == array[i]) {
                continue; //if the indices match don't save the value; increment i
                } else {
                    newArray[j+1] = array[i]; // if [i] & [j] do not match, save [i] at [j + 1]
                    if (i == array.length) {
                        continue;
                    }
                }
                j++;
            }
        String[] newerArray = new String[j+1];
        for (int k = 0; k < newerArray.length; k++) {
            newerArray[k] = newArray[k];
        }
        return newerArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String[] newArray = new String[30];
        int j = 0;
        String tempValue;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) { //set both [0] values
                newArray[j] = array[i];
                continue;
            } else if (newArray[j] == array[i]) {
                tempValue = newArray[j]; //if the indices match save [j] as tempValue; add [i] to [j]
                newArray[j] += array[i];
                if ((i+1 <= array.length-1) && tempValue == array[i + 1]) { //if we don't go beyond the index limit,
                    newArray[j] += array[i + 1];  //and tempvalue == [i+1], add [i+1] to [j]
                    i++; //advance [i] because it will be removed and to check for a match with the next element
                    if ((i+1 <= array.length-1) && tempValue == array[i + 1]){  //if we don't go beyond the index limit,
                        newArray[j] += array[i + 1];  //and tempvalue == [i+1], add [i+1] to [j] again
                        i++; // advance [i] because it will be removed
                    } else {
                        continue;
                    }
                }
            } else {
                newArray[j+1] = array[i]; // if [i] & [j] do not match, save [i] at [j + 1]
                    j++; //increment [j]
                if (i <= array.length) {
                    continue;
                }
            }
        }
        String[] newerArray = new String[j+1];
        for (int k = 0; k < newerArray.length; k++) {
            newerArray[k] = newArray[k];
        }
        return newerArray;
    }
}
