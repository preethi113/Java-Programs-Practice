
public class BubbleSort {

	public static void main(String[] args) {
	
		int[] arr= new int[]{3,9,1,7};
    
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
			int temp=0;
			if(arr[j]>arr[j+1]){
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
			
		}
		for(int x=0;x<arr.length;x++)
		{
			System.out.println(arr[x]);
		}
	}

}
