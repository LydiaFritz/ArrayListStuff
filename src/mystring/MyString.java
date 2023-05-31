/**
 * 
 */
package mystring;

/**
 * @author a4432_asu
 *
 */
public class MyString {

	//TEST YOUR CODE HERE
	public static void main(String[] args) {
		MyString me = new MyString();

	}
	
	//MyString instance variables
	private char [] arr;
	private int curr_len;
	
	//provided - do not change
	private void ensureCapacity(int minCapacity) {

		if (minCapacity < arr.length)
			return;

		char[] temp = new char[arr.length * 2];

		for (int i = 0; i < curr_len; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}
	
	//provided - do not change
	public MyString() {
		//create MyString with 0 characters
		arr = new char[5];
		curr_len = 0;
	}
		

}
