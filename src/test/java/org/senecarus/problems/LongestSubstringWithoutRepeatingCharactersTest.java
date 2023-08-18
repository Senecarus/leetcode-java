package org.senecarus.problems;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void lengthOfLongestSubstring() {
        Assert.assertEquals(2, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("au"));
        Assert.assertEquals(0, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(""));
        Assert.assertEquals(1, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(" "));
        Assert.assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
        Assert.assertEquals(1, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
        Assert.assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
    }
}