/*
 * *** Abdul Shad / 272 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

    /**
     * Method different()
     *
     * Given two TreeSets of integers, return a TreeSet containing all elements
     * that are NOT in both sets. In other words, return a TreeSet of all the
     * elements that are in one set but not the other.
     */
    public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
        // Create a new TreeSet to store unique elements
        Set<Integer> uniqueElements = new TreeSet<>(setA);
        uniqueElements.addAll(setB); // Union of both sets

        // Find common elements
        Set<Integer> commonElements = new TreeSet<>(setA);
        commonElements.retainAll(setB); // Intersection of both sets

        // Remove common elements to get the difference
        uniqueElements.removeAll(commonElements);

        return uniqueElements;
    }

    /**
     * Method removeEven()
     *
     * Given a treeMap with the key as an integer, and the value as a String,
     * remove all <key, value> pairs where the key is even.
     */
    public static void removeEven(Map<Integer, String> treeMap) {
        // Use an iterator to avoid ConcurrentModificationException
        Iterator<Integer> iterator = treeMap.keySet().iterator();

        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove(); // Remove even keys
            }
        }
    }

    /**
     * Method treesEqual()
     *
     * Given two treeMaps, each with the key as an integer, and the value as a String,
     * return a boolean value indicating if the two trees are equal or not.
     */
    public boolean treesEqual(Map<Integer, String> tree1, Map<Integer, String> tree2) {
        // Compare the two maps directly
        return tree1.equals(tree2);
    }

} 
