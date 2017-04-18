package Ch5;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("abc,cde,fgh,hlk");
		String []newstr=str.split(",");
		for(int i=0;i<newstr.length;i++){
			System.out.println(newstr[i]);
			
		}
		String[]newstr2=str.split(",",3);
		for(int j=0;j<newstr2.length;j++){
			System.out.println(newstr2[j]);
		}

	}

}
