package com.github.perscholas;

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

        if (array.length > 1 && null != array[1]) return array[1];
        return "";
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        if (array[array.length - 1] != null) return array[array.length-1];
        return "";
    }


    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        if (array[array.length - 2] != null) return array[array.length-2];
        return "";
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String s:array
                ) { if(s.equals(value))return true;
            
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int count=0;
        String[] backwar=new String[array.length];
        for(int i=array.length-1;i>=0;i--){
            backwar[count]=array[i];
            count++;
        }
        return backwar;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static Boolean isPalindromic(String[] array) {
        return (array.equals(reverse(array)));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static Boolean isPangramic(String[] array) {
        String alpha="abcdefghijklmnopqrstuvwxyz";
        String mash=array.toString();
        char carat=' ';
        for(int i =0;i<=alpha.length()-1;i++){
            if(!mash.contains(Character.toString((alpha.charAt(i)))))return false;
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i].equals(value))count++;
        }

        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> nwstring = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                nwstring.add(array[i]);
            }}
            String[] nwarray = new String[nwstring.size()];
            nwarray = nwstring.toArray(nwarray);

        return nwarray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        List<String> nwstring = new ArrayList<String>();
        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i-1])) {
                nwstring.add(array[i]);
            }}
        String[] nwarray = new String[nwstring.size()];
        nwarray = nwstring.toArray(nwarray);

        return nwarray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> nwstring = new ArrayList<String>();
        for (int i = 0; i < array.length-1; i++) {
           if(array[i].equals(array[i+1])){
               nwstring.add(array[i]+array[i+1]);i++;
           }else nwstring.add(array[i]);
        }
        String[] nwarray = new String[nwstring.size()];
        nwarray = nwstring.toArray(nwarray);

        return nwarray;
    }


}
