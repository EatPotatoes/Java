/**
 * Creates a class that encodes and decodes strings using a rail fence cipher
 * @author 23azhang
 *
 */
//Albert Zhang rail fence cipher object
public class RFcipher 
{
	//instance data
	private String plainText;
	private String cipherText;
	private String recoveredText;
	//constructors
	/**
	 * initiates the instance data (plain, cipher, and recovered text) to be able to set by user
	 */
	public RFcipher() 
	{
		setPlainText("");
		setCipherText("");
		setRecoveredText("");
	}
	
	/**
	 * initiates the instance data, assuming the user has already input a string to be encrypted, then encrypts the plaintext and decrypts the encrypted text
	 * @param plain is the plaintext that the user has input to be encrypted
	 */
	public RFcipher(String plain)
	{
		plainText = plain;
		cipherText = encrypt(plain);
		recoveredText = decrypt(cipherText);
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
	 * encrypts the plain text str using a rail fence cipher
	 * @param str the plain text to be encrypted
	 * @return the encrypted cipher text
	 */
	public String encrypt(String str)
	{
		plainText = str;
		String result = "";
		String format = str.toUpperCase();
		format = format.replaceAll(" ", "");
		for (int i = 0; i < format.length(); i += 2)
		{
			result = result.concat(format.substring(i, i + 1));
		}
		for (int i = 1; i < format.length(); i += 2)
		{
			result = result.concat(format.substring(i, i + 1));
		}
		cipherText = result;
		return result;
	}
	
	/**
	 * decrypts the cipher text into plain text using a rail fence cipher
	 * @param str the cipher text to be decrypted
	 * @return the recovered text
	 */
	public String decrypt(String str)
	{
		cipherText = str;
		String result = "";
		String endLetter = "";
		int checkOdd = str.length() % 2; //1 means length is odd number
		int index = Math.floorDiv(str.length(), 2);
		if (checkOdd == 1) {
			endLetter = str.substring(index, index + 1);
			str = str.substring(0, index) + str.substring(index + 1);
		}
		for (int i = 0; i < index; i++)
		{
			result = result.concat(str.substring(i, i + 1));
			result = result.concat("" + str.charAt(i + index));
		}
		if (checkOdd == 1)
		{
			result = result.concat(endLetter);
		}
		recoveredText = result;
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
