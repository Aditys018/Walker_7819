/*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, 
starting with word1. If a string is longer than the other, append the additional letters onto the 
end of the merged string.
Return the merged string.
*/


package org.aditys.stringsandarrays;

public class MergeStringsAlternately {
	 public String mergeAlternately(String word1, String word2) {
	        StringBuilder str=new StringBuilder();
	        int n=word1.length();
	        int m=word2.length();
	        int i=0;
	        while(i<n && i<m){
	            str.append(word1.charAt(i)).append(word2.charAt(i));
	            i++;
	        }
	        str.append(word1.substring(i, n)).append(word2.substring(i, m));
	        return str.toString();
	    }

}
