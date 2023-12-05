package string_operation;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "College";
	    char result = str.charAt(3); //Shows the character at the specified index
	    System.out.println(result);
	    
	    String s1 = "college";
	    String s2 = "coll";
	    String s3 = "ege";
	    System.out.println(str.compareTo(s2)); //compares two strings and returns 0 if they're equal
	    System.out.println(str.compareToIgnoreCase(s2));
	    
	    int l=str.length();
	    System.out.println("The length of string:"+l); //length of the string
	    
	    System.out.println("After Concatenation:"+s2.concat(s3)); //concatenate 2 strings
	    
	    System.out.println("Is the string empty? -> " +str.isEmpty()); //checks if the string is empty or not
	    
	    
	    System.out.println("Are the two strings equal? -> "+ str.equals(s1));
	    System.out.println("Are the two strings equal after ignoring the case? -> "+ str.equalsIgnoreCase(s1));
	    
	    System.out.println(str.indexOf(s3));
	    
	    System.out.println(str.toUpperCase());
	    
	    System.out.println(str.toLowerCase());
	    
	    System.out.println(str.startsWith(s2));
	    System.out.println(str.endsWith(s3));
	    
	    System.out.println(str.substring(3,5));
	    System.out.println(str.substring(2));
	    
	    String s4 = "       Hello, How is your cat?          ";
	    System.out.println("After trim:"+s4.trim());
	    
	    System.out.println(str.regionMatches(3, s3 , 1, 3));
	    
	    System.out.println(str.lastIndexOf("l"));
	    System.out.println(str.replace('l', 't'));
	    
	    
	    int max=Math.max(2, 8);
	    System.out.println(max); //returns the maximum of the 2 numbers given
	    
	}

}
