package org.senecarus.problems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstringSubOptimal(String s) {

        if (s.isEmpty())
            return 0;

        int maxVal = 1;

        Set<Character> subStr = new HashSet<>();

        for (int i = 0 ; i < s.length(); ++i) {
            subStr.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); ++j) {
                if (!subStr.contains(s.charAt(j))){
                    subStr.add(s.charAt(j));
                } else{
                    break;
                }
            }
            if (maxVal < subStr.size())
                maxVal = subStr.size();
            subStr.clear();
        }
        return maxVal;
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet();
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while(!set.add(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

}
