package com.github.perscholas;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        return array[array.length - 1];
    }
    
    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }
    
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            String s = array[i];
            if (Objects.equals(value, s)) {
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
        String[] reverse = new String[array.length];
        for (int index = array.length - 1; index >= 0; index--) {
            reverse[array.length - 1 - index] = array[index];
        }
        return reverse;
    }
    
    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */
    public static Boolean isPalindromic(String[] array) {
        int mid = array.length % 2 == 0 ? array.length / 2 - 1 : array.length / 2;
        for (int start = 0; array.length / 2 > start; start++) {
            int end = array.length - 1 - start;
            if (!Objects.equals(array[start], array[end])) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */
    public static Boolean isPangramic(String[] array) {
        //Initialize Frequency Map
        Map<Character, Integer> characterToFrequency = IntStream.range(0, 26).boxed().map(value -> Character.valueOf((char) (value + 65))).collect(Collectors.toMap(value -> {
            return value;
        }, value -> {
            return 0;
        }));
        
        for (String word : array) {
            word = word.toUpperCase();
            for (char character : word.toCharArray()) {
                if (!Character.isAlphabetic(character)) {
                    continue;
                }
                characterToFrequency.put(character, characterToFrequency.get(character) + 1);
            }
        }
        return characterToFrequency.values().stream().allMatch(value -> value > 0);
    }
    
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */
    public static int getNumberOfOccurrences(String[] array, String value) {
        return Arrays.asList(array).stream().map(words -> {
            return Objects.equals(words, value) ? 1 : 0;
        }).reduce(Integer::sum).get();
    }
    
    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] result = new String[array.length];
        int resultIndex = 0;
        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            if(!Objects.equals(word, valueToRemove)){
                result[resultIndex] =array[i];
                resultIndex++;
            }
        }
        return Arrays.copyOf(result, resultIndex);
    }
    
    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String[] result = new String[array.length];
        String previousWord = "";
        int resultIndex = -1;
        for(String word : array){
            if(!Objects.equals(previousWord, word)) {
                resultIndex++;
                result[resultIndex] = word;
                previousWord = word;
                continue;
            }
        }
        return Arrays.copyOf(result, resultIndex+1);
    }
    
    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */
    public static String[] packConsecutiveDuplicates(String[] array) {
        String[] result = new String[array.length];
        String previousWord = "";
        int resultIndex = -1;
        for(String word : array){
            if(!Objects.equals(previousWord, word)) {
                resultIndex++;
                result[resultIndex] = word;
                previousWord = word;
                continue;
            }
            result[resultIndex] = result[resultIndex]+word;
        }
        return Arrays.copyOf(result, resultIndex+1);
    }
}
