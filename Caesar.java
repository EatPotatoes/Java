import java.util.Scanner;
/**
 * 
 * @author 23azhang
 * program that implements a Caesar Cipher
 */
public class Caesar 
{
		/**
		 * initializes instance data of plainText, cipherText, recoveredText, shift, and sh;
		 */
		//instance data
		private String plainText;
		private String cipherText;
		private String recoveredText;
		private int shift;
		private int sh;
		//constructors
		/**
		 * initiates the instance data (plain, cipher, and recovered text) to be able to set by user
		 */
		
		/**
		 * initiates the instance data so the user can input strings later
		 * @param x the shift to be used by the Caesar cipher
		 */
		public Caesar(int x) 
		{
			setPlainText("");
			setCipherText("");
			setRecoveredText("");
			/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter encyrption shift: ");
			String str = sc.next();
			shift = Integer.parseInt(str) % 26;
			
			System.out.print("Enter decryption shift: ");
			String s = sc.next();
			sh = Integer.parseInt(s) % 26;
			*/
			shift = x;
			sh = x;
		}
		
		/**
		 * initiates the instance data, assuming the user has already input a string to be encrypted, then encrypts the plaintext and decrypts the encrypted text
		 * @param plain is the plaintext that the user has input to be encrypted
		 */
		public Caesar(String plain, int x)
		{
			plainText = plain;
			cipherText = encrypt(plain);
			recoveredText = decrypt(cipherText);
			/*
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter encryption shift for: " + plain + " ");
			String str = sc.next();
			shift = Integer.parseInt(str) % 26;
			*/
			shift = x;
			sh = x;
		}
		//getters and setters
		/**
		 * gets the plain text from the user to be decrypted
		 * @return the plain text the user has entered
		 */
		public String getPlainText()
		{
			return plainText;
		}
		
		/**
		 * gets the cipher text from the user to be decrypted
		 * @return the cipher text to be decrypted
		 */
		public String getCipherText()
		{
			return cipherText;
		}
		
		/**
		 * gets the recovered text from after the cipher text is decrypted
		 * @return the recovered string
		 */
		public String getRecoveredText()
		{
			return recoveredText;
		}
		
		/**
		 * sets the plain text to str
		 * @param str the plain text to be encrypted
		 */
		public void setPlainText(String str)
		{
			this.plainText = str;
		}
		
		/**
		 * sets the cipher text to str
		 * @param str the cipher text to be decrypted
		 */
		public void setCipherText(String str)
		{
			this.cipherText = str;
		}
		
		/**
		 * sets the recovered text to str
		 * @param str the recovered text after decryption
		 */
		public void setRecoveredText(String str)
		{
			this.recoveredText = str;
		}
		//other methods
		/**
		 * encrypts the plain text str using a caesar cipher
		 * @param str the plain text to be encrypted
		 * @return the encrypted cipher text
		 */
		public String encrypt(String str)
		{
			String text = str.toUpperCase();
			String result = "";
			for (int i = 0; i < text.length(); i++)
			{
				char ch = (char)(((int)text.charAt(i) + shift - 65) % 26 + 65);
				result = result + ch;
			}
			
			return result;
		}
		
		/**
		 * decrypts the cipher text into plain text using a caesar cipher, with orginal key
		 * @param str the cipher text to be decrypted
		 * @return the recovered text
		 */
		public String decrypt(String str)
		{
			Scanner scan = new Scanner(System.in);

			String text = str.toUpperCase();
			String result = "";
			for (int i = 0; i < text.length(); i++)
			{
				char ch = (char)(((int)text.charAt(i) - (sh - 65)) % 26 + 65);
				result = result + ch;
			}
			
			return result;
		}
		
		/**
		 * decrypts the cipher text into plain text using a new key from user
		 * @param str the cipher text to be decrypted
		 * @param s the shift to be used
		 * @return the recovered text
		 */
		public String decrypt(String str, int s)
		{
			Scanner scan = new Scanner(System.in);

			String text = str.toUpperCase();
			String result = "";
			for (int i = 0; i < text.length(); i++)
			{
				char ch = (char)(((int)text.charAt(i) - (s - 65)) % 26 + 65);
				result = result + ch;
			}
			
			return result;
		}
		
		//toString
		public String toString()
		{
			String result = "";
			result = result.concat("Plain text: " + plainText);
			result = result.concat("\n");
			result = result.concat("Cipher text: " + cipherText);
			result = result.concat("\n");
			result = result.concat("Recovered text: " + recoveredText);
			return result;
		}
}
