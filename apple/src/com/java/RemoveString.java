package com.java;

/**
 * This contains implementations for removing a Character from a string
 * 
 * @author imalonzo
 *
 */
public class RemoveString {
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
