package Ch5;

import java.util.Date;

public class Eval {

	public static void main(String[] args){
		// TODO Auto-generated method stub
    Date date=new Date();
    String year=String.format("%tY", date);
    String month=String.format("%tm", date);
    String day=String.format("%td", date);
    String date1=String.format("%tT", date);
    System.out.println("¼ûÄêÊÇ£º "+year);
    System.out.println();
    System.out.println();
    System.out.println(date1);
    String  str3=String.format("%",400/2);
    System.out.println(str3);
    
	}

}
