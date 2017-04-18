package Ch5;

public class Link {
	public static void main(String args[]){
		String str="we are student!";
		int a=str.length();
		System.out.println(a);
	   int size=str.lastIndexOf("w");
	   System.out.println(size);
	   System.out.println("字符串的长度"+str.length());
	   char mychar=str.charAt(5);	   
 System.out.println("输出索引位置威武的字符："+mychar);
// 获取指定索引位置的字符；
 String substr=str.substring(0,3);
 System.out.println(substr);
 String str1="  java   class  ";
 System.out.println("changdu:"+str1.length());
 System.out.println("changdu ;"+str1.trim());
 String newstr1=str.replace("a","Q" );
 System.out.println(newstr1);
		 
		
		
		
		
	}

}