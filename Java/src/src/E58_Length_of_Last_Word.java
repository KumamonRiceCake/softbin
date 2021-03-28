package src;

/**
58. Length of Last Word			Easy

Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.
A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5

Example 2:
Input: s = " "
Output: 0
 

Constraints:
1 <= s.length <= 104
s consists of only English letters and spaces ' '.
*/
public class E58_Length_of_Last_Word {
	public int lengthOfLastWord(String s) {
        int len = s.length();
        
        String[] words = s.split(" ");
        if (words.length == 0)
            return 0;
        
        return words[words.length-1].length();
    }
	
	public static void main(String[] args) {
		E58_Length_of_Last_Word e58 = new E58_Length_of_Last_Word();
		System.out.println(e58.lengthOfLastWord("Hello World"));
		System.out.println(e58.lengthOfLastWord(" "));
	}
}
