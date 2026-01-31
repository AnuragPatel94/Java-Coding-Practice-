package String;

public class StringMethods {
	public static void  main(String[]args) {
	
	String Subject ="lets learn java";
	String Subject2 ="Lets learn Java";
	
	int string =Subject.length();
	System.out.println(string);
	
	char charatindex=Subject.charAt(3);
	System.out.println(charatindex);
	
	int indexofChar=Subject.indexOf("j");
	System.out.println(indexofChar);
	
	int indexoflast=Subject.lastIndexOf("l");
	System.out.println(indexoflast);
	
	boolean contain=Subject.contains(Subject);
	System.out.println(contain);
	
	boolean equal=Subject.equals(Subject2);
	System.out.println(equal);
	
	boolean equalto=Subject.equalsIgnoreCase(Subject2);
	System.out.println(equalto);
	
	boolean endwith=Subject.endsWith("js");
	System.out.println(endwith);
	
	boolean startwith=Subject.startsWith("lets");
	System.out.println(startwith);
	
    }


}
