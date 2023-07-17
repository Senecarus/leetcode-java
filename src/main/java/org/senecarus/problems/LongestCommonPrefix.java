package org.senecarus.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        List<String> sortedList = Arrays.stream(strs).sorted(Comparator.comparingInt(String::length)).toList();
        String shortestString = sortedList.get(0);

        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < shortestString.length(); ++i) {

            prefix.append(shortestString.charAt(i));

            int finalI = i;
            if (!sortedList.stream().allMatch(s -> prefix.charAt(finalI) ==  s.charAt(finalI))){
                return prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix.toString();
    }

    public static String longestCommonPrefix1(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

}
