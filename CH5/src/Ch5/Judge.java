package Ch5;

public class Judge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String regex="\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
     String str1="aaa@";
     String str2="14260499@qq.com";
     String str3="935230569@qq.qq.qq.qq.qq.com";
     if(str3.matches(regex)){
    	 
    	 System.out.println(str3);
    	
     }
     
	}

}
