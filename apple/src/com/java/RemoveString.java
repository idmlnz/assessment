package com.java;

/**
 * This contains implementations for removing a Character from a string
 * 
 * @author imalonzo
 *
 */
public class RemoveString {
	/**
	 *  This method iterates through the char array and removes occurrences of a character
	 *  
	 * @param oldS - old String
	 * @param ch - char to remove
	 * @return sb - new string with char removed
	 */
	public String removeStringIterator(String oldS, Character ch) {
		if (oldS == null) {
			return oldS;
		}

        StringBuilder sb = new StringBuilder();
        char[] oldArray = oldS.toCharArray();
        for(int i = 0; i < oldArray.length; i++){
            if(oldArray[i] == ch.charValue()){

            } else {
                sb.append(oldArray[i]);
            }
        }
        return sb.toString();
	}

	/**
	 * This method removes the occurrences of char using String method replaceAll
	 * 
	 * @param oldS - old String
	 * @param ch - char to remove
	 * @return newS - new string with char removed
	 */
	public String removeString(String oldS, Character ch) {
		if (oldS == null) {
			return oldS;
		}
		String removeS = ch.toString();
		String newS = oldS.replaceAll(removeS,"");
		return newS;
	}	
	
	public static void main(String args[]) {
		RemoveString rs  = new RemoveString();
		String iter = rs.removeStringIterator(null, ' ');
		System.out.println("string: " +  iter);

		String a = rs.removeString("hello world", 'l');
		System.out.println("string: " +  a);
	}
}
