package day1_Assignment_String_Methods;

//length()
//isEmpty()
//charAt(index)
//equals()
//equalsIgnoreCase()
//contentEquals()  
//compareTo()
//compareToIgnoreCase()
//startsWith()
//endsWith()
//hashCode()
//indexOf()
//lastIndexOf()
//substring()
//subSequence()
//concat()
//replace()
//matches()
//contains()
//split()
//join()
//toLowerCase()
//toUpperCase()
//trim()
//strip()
//stripLeading()
//stripTrailing()
//isBlank()
//toString()
//toCharArray()
//format()
//valueOf()
//repeat()



public class String_Methods {

	public static void main(String[] args) {
		
//		String str1="Welcome to String operations";
		String str1="Sai Teja";
		String str2="Sai Teja";
		String str3="sai teja";
		// Length() method used - it will Return int
		System.out.println("The Length of the given String is ="+str1.length());
		//Is Empty() method - it will return boolean 
		System.out.println("Is the Str1 is Empty ? = "+str1.isEmpty());
		// charAt(index) method 
		System.out.println("The Value on Str1[0] is = "+str1.charAt(0));
		//equals will compare both the strings With case sensitive
		System.out.println("Is Str1 and Str2 are Equal ? : "+str1.equals(str2));
		// equalsIgnoreCase will compare both the string without  Case Sensitive
		System.out.println("Is Str1 and Str2 are Equal?  ignore the Case : "+str1.equalsIgnoreCase(str3));
		
		System.out.println("Is Str1 and Str2 are contentEquals ? "+str1.contentEquals(str2));
		System.out.println("compareTo() = "+str1.compareTo(str3));
		System.out.println("compareToIgnoreCase()"+str1.compareToIgnoreCase(str3));
		
		// starts with prefix and Endswith is Suffix and both the methods are case sensitive
		System.out.println("Starts with()-"+str1.startsWith("S"));
		System.out.println("endsWith()- "+str1.endsWith("a"));
		System.out.println("hashCode()-"+str1.hashCode());
		System.out.println("hashCode()-"+str2.hashCode());
		System.out.println("hashCode()-"+str3.hashCode());
		System.out.println("indexOf() - "+str1.indexOf("T"));
		System.out.println("lastIndexOf() - "+str1.lastIndexOf("a"));
		
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	

}
