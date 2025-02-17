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
		String st1="Sai Teja";
		String st2="Sai Teja";
		String st3="sai teja";
		// Length() method used - it will Return int
		System.out.println("The Length of the given String is ="+st1.length());
		//Is Empty() method - it will return boolean 
		System.out.println("Is the Str1 is Empty ? = "+st1.isEmpty());
		// charAt(index) method 
		System.out.println("The Value on Str1[0] is = "+st1.charAt(0));
		//equals will compare both the strings With case sensitive
		System.out.println("Is Str1 and Str2 are Equal ? : "+st1.equals(st2));
		// equalsIgnoreCase will compare both the string without  Case Sensitive
		System.out.println("Is Str1 and Str2 are Equal?  ignore the Case : "+st1.equalsIgnoreCase(st3));
		
		System.out.println("Is Str1 and Str2 are contentEquals ? "+st1.contentEquals(st2));
		System.out.println("compareTo() = "+st1.compareTo(st3));
		System.out.println("compareToIgnoreCase()"+st1.compareToIgnoreCase(st3));
		
		// starts with prefix and Endswith is Suffix and both the methods are case sensitive
		System.out.println("Starts with()-"+st1.startsWith("S"));
		System.out.println("endsWith()- "+st1.endsWith("a"));
		System.out.println("hashCode()-"+st1.hashCode());
		System.out.println("hashCode()-"+st2.hashCode());
		System.out.println("hashCode()-"+st3.hashCode());
		System.out.println("indexOf() - "+st1.indexOf("T"));
		System.out.println("lastIndexOf() - "+st1.lastIndexOf("a"));
		String str1="Welcome to String operations";
		String str2="   + + + + + @@@@@   @#%$% +++ ";
		String str3="     614656432114    !@#$#$#)#&*$)*%&";
		String str4=str1+str2+str3;
		System.out.println("Length Function - length()");
		System.out.println("Length of the given string : "+str4.length());
				
		System.out.println("\nCharAt Function - charAt(index)");
		System.out.println("printing the paticular index on a string : = "+str4.charAt(0));
		System.out.println("printing the paticular index on a string : = "+str4.charAt(2));
		
		
		// isEmpty() only returns true when the String doesn't contain any character
		System.out.println("\nChecking the given string empty or not using - isEmpty() ");
		
		if(str4.isEmpty())
			System.out.println("Given String is Empty");
		else
			System.out.println("Given String is not Empty");
		String str5="y*u$g$a .nd,h//ar";
		String str_5="Yuga";
		String str_6="ndhar";
		String str6="yuga";
		String str7="YUGA";
		System.out.println("equal function to compare two strings - equals(String variableName)");
		System.out.println("\nChecking Str5 and str6 as both are equal= "+str5.equals(str6));
//		System.out.println("\nChecking both the string with case str5 is lower but the text is same - str7 is UpperCase it will result pass if str5 & str7 text are same");
		System.out.println("equalsIgnoreCase() -This function used to compare two strings even if both string are same case like lower and another one is upper it will pass");
		
		System.out.println("comparision two diff case string but same text : "+str5.equalsIgnoreCase(str7));
		
		System.out.println("contentEquals()  --- Same as equals");
		System.out.println(str5.contentEquals(str6));
		System.out.println("compareTo() - : "+str5.compareTo(str7));
		System.out.println(str5.compareTo(str6));
		
		
		System.out.println("compareToIgnoreCase = "+str5.compareToIgnoreCase(str5));
		String str8="yu";
		System.out.println("startsWith() = "+str5.startsWith(str8));
		String str9="har";
		String str10="[,\\.\\s $ /, *]";
		System.out.println("endsWith() - "+str5.endsWith(str9));
		System.out.println("hashCode() - "+ str5.hashCode());
		System.out.println("indexOf()- "+ str5.indexOf("g"));
		System.out.println("lastIndexOf () - "+str5.lastIndexOf(str6));
		System.out.println("lastIndexOf () - "+str5.lastIndexOf("uga"));
		System.out.println("lastIndexOf () - "+str5.lastIndexOf("ndhar"));
		
		System.out.println("concat() -- "+str_5.concat(str_6));
		System.out.print("split() -- ");
		String[] arr=str5.split(str10);
		for (String a:arr)
		System.out.print(a);
		System.out.println();
		String str11="yugan dhar V G";
		String str_11="        yugan dhar V G       ";
		System.out.println("replace()"+str11.replace(" ",""));
		String str12="Yugendher";
		System.out.println("replace () "+str12.replace("e", "a"));
		String str13="By|passed|the|central|Firewall ";
		System.out.print("matches() -- ");
		System.out.println("passed".matches(str13));
	
		System.out.println("matches ()  " +"passed".matches(str13));
		System.out.println("contains()"+str13.contains("Firewall"));
		System.out.println("Substring() "+str13.substring(3,10));
		System.out.println("SubSequence() "+str13.subSequence(3, 10));
		String str14=String.join(str11,str13,str12);// joining one are more string
		System.out.println(str14);
		System.out.println(str14.join("$$$",str11,str12,str13)); // merging the text with a delimiter or Seperator
		System.out.println();
		System.out.println("toLowerCase()-- "+str12.toLowerCase());
		System.out.println("toUpperCase() -- " +str12.toUpperCase());
		System.out.println("trim() --"+str_11.trim());
		System.out.println("strip() --"+str11.strip());
		System.out.println("strip() --"+str11.stripIndent());
		//isBlank() returns true for whitespace characters, like some escape sequences
		System.out.println("isblank()-"+str11.isBlank()); 
		//This method may seem redundant, but its purpose is to allow code that is treating the string as a more generalized object to know its string value without casting it to String type.
		System.out.println("toString() -- "+str11.toString());
		String str15=str12.replace("e","a");
		char[] arr1=str15.toCharArray();
		for (char a:arr1)
		System.out.println(a);
		for (char a:arr1)
			System.out.print(a);
		System.out.println();
		 String str22="Hello %s please wait for your dashboard will get ready %d minutes.";
		System.out.println(str22.format(str22, "Yugandhar",2));
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	

}
