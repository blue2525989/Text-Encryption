package model;

public class Encrypt {
	
	/********************* ENCRYPTION METHODS *************************/
	
	/**
	 * rot13
	 * rotates character by 13 characters
	 * @param n a number or character
	 * @return the number rotated 13 spaces
	 */
	
	public static int rot13(int n) {
		return (n >= 'A' && n <= 'Z') ? 
				n = (((n - 'A') + 13) % 26) + 'A' :	
					(n = (n >= 'a' && n <= 'z') ?
						n = (((n - 'a') + 13) % 26) + 'a' : n);
	}
	
	/**
	 * unRot13
	 * un-rotates a character by 13
	 * @param n a character to un-rotate
	 * @return un-rotated character
	 */
	
	public static int unRot13(int n) {
		return (n >= 'A' && n <= 'Z') ?
				n = (((n - 'Z') - 13) % 26) + 'Z' : (n = (n >= 'a' && n <= 'z') ? 
						n = (((n - 'z') - 13) % 26) + 'z' : n);
	}
	
	/**
	 * rot13String
	 * rotate a String each character by 13
	 * @param s String to rotate
	 * @return rotated String
	 */
	
	public static String rot13String(String s) {
		char[] chars = s.toCharArray();
		s = "";
		for (int i = 0; i < chars.length; i++) {
			s += (char)rot13(chars[i]);
		}
		return s;
	}

	/**
	 * unRot13String
	 * un-rotates a String each character by 13
	 * @param s String to rotate
	 * @return un-rotated String
	 */
	
	public static String unRot13String(String s) {
		char[] chars = s.toCharArray();
		s = "";
		for (int i = 0; i < chars.length; i++) {
			s += (char)unRot13(chars[i]);
		}
		return s;
	}
	
	/**
	 * rot13
	 * rotates character by 13 characters
	 * @param n a number or character
	 * @param xtra is an extra parameter to add another layer
	 * @return the number rotated 13 spaces
	 */
	
	public static int rot13(int n, int xtra) {
		return (n >= 'A' && n <= 'Z') ? 
				n = ((((n + xtra) - 'A') + 13) % 26) + 'A' : (n = (n >= 'a' && n <= 'z') ?
							n = ((((n + xtra) - 'a') + 13) % 26) + 'a' : n);
	}
	
	/**
	 * unRot13
	 * un-rotates a character by 13
	 * @param n a character to un-rotate
	 * @param xtra is an extra parameter to add another layer
	 * @return un-rotated character
	 */
	
	public static int unRot13(int n, int xtra) {
		return (n >= 'A' && n <= 'Z') ?
				n = ((((n - xtra) - 'Z') - 13) % 26) + 'Z' : (n = (n >= 'a' && n <= 'z') ? 
						n = ((((n - xtra) - 'z') - 13) % 26) + 'z' : n);
	}
	
	/**
	 * rot13String
	 * rotate a String each character by 13
	 * @param s String to rotate
	 * @param xtra is an extra parameter to add another layer
	 * @return rotated String
	 */
	
	public static String rot13String(String s, int xtra) {
		char[] chars = s.toCharArray();
		s = "";
		for (int i = 0; i < chars.length; i++) {
			s += (char)rot13(chars[i], xtra);
		}
		return s;
	}

	/**
	 * unrot13String
	 * rotate a String each character by 13
	 * @param s String to rotate
	 * @param xtra is an extra parameter to add another layer
	 * @return rotated String
	 */
	
	public static String unRot13String(String s, int xtra) {
		char[] chars = s.toCharArray();
		s = "";
		for (int i = 0; i < chars.length; i++) {
			s += (char)unRot13(chars[i], xtra);
		}
		return s;
	}
	
	/**
	 * rotAny
	 * rotates a character by any number
	 * @param n character
	 * @param offset number to rotate by
	 * @return rotated character
	 */
	
	public static int rotAny(int n, int offset) {
		return (n >= 'A' && n <= 'Z') ? 
				n = (((n - 'A') + offset) % 26) + 'A' :	(n = (n >= 'a' && n <= 'z') ?
							n = (((n - 'a') + offset) % 26) + 'a' : n);
	}
	
	/**
	 * unRotAny
	 * un-rotates a character by any number
	 * @param n character
	 * @param offset number to rotate by
	 * @return un-rotated character
	 */
	
	public static int unRotAny(int n, int offset) {
		return (n >= 'A' && n <= 'Z') ? 
				n = (((n - 'Z') - offset) % 26) + 'Z' :	(n = (n >= 'a' && n <= 'z') ?
							n = (((n - 'z') - offset) % 26) + 'z' : n);
	}
	
	/**
	 * rotateAnyString
	 * rotates a string by any number 
	 * @param s String to rotate
	 * @param offset number to rotate by
	 * @return rotated String
	 */
	
	public static String rotAnyString(String s, int offset) {
		char[] chars = s.toCharArray();
		s = "";
		for (int i = 0; i < chars.length; i++) {			
			s += (char)rotAny(chars[i], offset);
		}
		return s;
	}
	
	/**
	 * un-rotateAnyString
	 * un-rotates a String by any number 
	 * @param s String to un-rotate
	 * @param offset number to rotate by
	 * @return un-rotated String
	 */
	
	public static String unrotAnyString(String s, int offset) {
		char[] chars = s.toCharArray();
		s = "";
		for (int i = 0; i < chars.length; i++) {			
			s += (char)unRotAny(chars[i], offset);
		}
		return s;
	}
	
	/**
	 * rotAny
	 * rotates a character by any number
	 * @param n character
	 * @param offset number to rotate by
	 * @param xtra is an extra parameter to add another layer
	 * @return rotated character
	 */
	
	public static int rotAny(int n, int offset, int xtra) {
		return (n >= 'A' && n <= 'Z') ? 
				n = ((((n + xtra) - 'A') + offset) % 26) + 'A' : (n = (n >= 'a' && n <= 'z') ?
							n = ((((n + xtra) - 'a') + offset) % 26) + 'a' : n);
	}
	
	/**
	 * unRotAny
	 * un-rotates a character by any number
	 * @param n character
	 * @param offset number to rotate by
	 * @param xtra is an extra parameter to add another layer
	 * @return un-rotated character
	 */
	
	public static int unRotAny(int n, int offset, int xtra) {
		return (n >= 'A' && n <= 'Z') ? 
				n = ((((n - xtra) - 'Z') - offset) % 26) + 'Z' : (n = (n >= 'a' && n <= 'z') ?
							n = ((((n - xtra) - 'z') - offset) % 26) + 'z' : n);
	}
	
	/**
	 * rotateAnyString
	 * rotates a string by any number 
	 * @param s String to rotate
	 * @param offset number to rotate by
	 * @param xtra is an extra parameter to add another layer
	 * @return rotated String
	 */
	
	public static String rotAnyString(String s, int offset, int xtra) {
		char[] chars = s.toCharArray();
		s = "";
		for (int i = 0; i < chars.length; i++) {			
			s += (char)rotAny(chars[i], offset, xtra);
		}
		return s;
	}
	
	/**
	 * un-rotateAnyString
	 * un-rotates a String by any number 
	 * @param s String to un-rotate
	 * @param offset number to rotate by
	 * @param xtra is an extra parameter to add another layer
	 * @return un-rotated String
	 */
	
	public static String unrotAnyString(String s, int offset, int xtra) {
		char[] chars = s.toCharArray();
		s = "";
		for (int i = 0; i < chars.length; i++) {			
			s += (char)unRotAny(chars[i], offset, xtra);
		}
		return s;
	}
	
	/**
	 * rotateByWord
	 * takes a String and rotates it by another String
	 * @param s String to be encrypted
	 * @param key String to use as key
	 * @return encrypted String
	 */
	
	public static String rotateByWord(String s, String key) {
		char[] keys = key.toCharArray();
		char[] chars = s.toCharArray();
		s = "";
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			count = (count >= keys.length) ? count = 0 : count;
			char temp = (chars[i] >= 'A' && chars[i] <= 'Z') ?
					temp = (char) ((((chars[i] - 'A') + keys[count]) % 26) + 'A') :
						(temp = (chars[i] >= 'a' && chars[i] <= 'z') ?
								temp = (char) ((((chars[i] - 'a') + keys[count]) % 26) + 'a') : chars[i]);
			s += temp;
			count++;
		}
		return s;
	}
	
	/**
	 * unrotateByWord
	 * takes a String and rotates it by another String
	 * @param s String to be resolved  
	 * @param key String to use as key
	 * @return decrypted String
	 */
	
	public static String unrotateByWord(String s, String key) {
		char[] keys = key.toCharArray();
		char[] chars = s.toCharArray();
		s = "";
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			count = (count >= keys.length) ? count = 0 : count;
			char temp = (chars[i] >= 'A' && chars[i] <= 'Z') ?
					temp = (char) ((((chars[i] - 'Z') - keys[count]) % 26) + 'Z') :
						(temp = (chars[i] >= 'a' && chars[i] <= 'z') ?
								temp = (char) ((((chars[i] - 'z') - keys[count]) % 26) + 'z') : chars[i]);
			s += temp;
			count++;
		}
		return s;
	}
	
	/**
	 * rotateByWord
	 * takes a String and rotates it by another String
	 * @param s String to be encrypted
	 * @param key String to use as key
	 * @param xtra is an extra parameter to add another layer
	 * @return encrypted String
	 */
	
	public static String rotateByWord(String s, String key, int xtra) {
		char[] keys = key.toCharArray();
		char[] chars = s.toCharArray();
		s = "";
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			count = (count >= keys.length) ? count = 0 : count;
			char temp = (chars[i] >= 'A' && chars[i] <= 'Z') ?
					temp = (char) ((((chars[i] - 'A') + (keys[count]*xtra)) % 26) + 'A') :
						(temp = (chars[i] >= 'a' && chars[i] <= 'z') ?
								temp = (char) ((((chars[i] - 'a') + (keys[count]*xtra)) % 26) + 'a') : chars[i]);
			s += temp;
			count++;
		}
		return s;
	}
	
	/**
	 * unrotateByWord
	 * takes a String and rotates it by another String
	 * @param s String to be resolved  
	 * @param key String to use as key
	 * @param xtra is an extra parameter to add another layer
	 * @return decrypted String
	 */
	
	public static String unrotateByWord(String s, String key, int xtra) {
		char[] keys = key.toCharArray();
		char[] chars = s.toCharArray();
		s = "";
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			count = (count >= keys.length) ? count = 0 : count;
			char temp = (chars[i] >= 'A' && chars[i] <= 'Z') ?
					temp = (char) ((((chars[i] - 'Z') - (keys[count]*xtra)) % 26) + 'Z') :
						(temp = (chars[i] >= 'a' && chars[i] <= 'z') ?
								temp = (char) ((((chars[i] - 'z') - (keys[count]*xtra)) % 26) + 'z') : chars[i]);
			s += temp;
			count++;
		}
		return s;
	}
	

	/**
	 * rotateByWord
	 * takes a String and rotates it by another String
	 * @param s String to be encrypted
	 * @param key String to use as key
	 * @param xtra is an extra parameter to add another layer
	 * @return encrypted String
	 */
	// extra extra layer
	public static String rotateByWord(String s, String key, int xtra, int xtra2) {
		char[] keys = key.toCharArray();
		char[] chars = s.toCharArray();
		s = "";
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			count = (count >= keys.length) ? count = 0 : count;
			char temp = (chars[i] >= 'A' && chars[i] <= 'Z') ?
					temp = (char) ((((chars[i] - 'A') + ((keys[count]*xtra)%xtra2)) % 26) + 'A') :
						(temp = (chars[i] >= 'a' && chars[i] <= 'z') ?
								temp = (char) ((((chars[i] - 'a') + ((keys[count]*xtra)%xtra2)) % 26) + 'a') : chars[i]);
			s += temp;
			count++;
		}
		return s;
	}
	
	/**
	 * unrotateByWord
	 * takes a String and rotates it by another String
	 * @param s String to be resolved  
	 * @param key String to use as key
	 * @param xtra is an extra parameter to add another layer
	 * @return decrypted String
	 */
	// extra extra layer
	public static String unrotateByWord(String s, String key, int xtra, int xtra2) {
		char[] keys = key.toCharArray();
		char[] chars = s.toCharArray();
		s = "";
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			count = (count >= keys.length) ? count = 0 : count;
			char temp = (chars[i] >= 'A' && chars[i] <= 'Z') ?
					temp = (char) ((((chars[i] - 'Z') - ((keys[count]*xtra)%xtra2)) % 26) + 'Z') :
						(temp = (chars[i] >= 'a' && chars[i] <= 'z') ?
								temp = (char) ((((chars[i] - 'z') - ((keys[count]*xtra)%xtra2)) % 26) + 'z') : chars[i]);
			s += temp;
			count++;
		}
		return s;
	}

}
