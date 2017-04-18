package Ch61;

public class TiaoHuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[][]array={{1,2,3},{4,5,6,},{7,8,9}
	};
      TiaoHuan sorter=new TiaoHuan();
      sorter.sort(array);
      

}
	public void sort(int[][]array){
		for(int i=0;i<array.length;i++)
		{
			for(int j=i;j<array[i].length;j++)
			{
				int temp=array[i][j];
				array[i][j]=array[j][i];
				array[j][i]=temp;
				
			}
			
		}
	showArray(array);	
		
	}
	public void showArray(int[][]array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
}