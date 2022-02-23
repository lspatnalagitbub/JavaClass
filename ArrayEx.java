
public class ArrayEx {

	public static void main(String[] args) {

		int arr1[] = new int[10]; // one way of array declaration, this is empty array

		int arr2[] = { 12, 34, 56, 78, 98, 65, 454, 534, 56, 10, 23, 24 };
		
		int arr3[];  
		//initialize an array  
		arr3= new int[6];  

		/*
		 * arr2[0]=12; arr2[1]=34; . . . . arr[11]=24
		 */

		int addResult = 0;
		for (int i = 1; i < 12; i++) {
			addResult += arr2[i];

		}

		System.out.println("Addition of arrary values   "+addResult);

		arr1[0] = 99;
		arr1[1] = 78;
		arr1[2] = 86;
        arr1[3] =4;
		
		System.out.println(arr1[0]);
		
		int mul=1;
		for(int  i=0;i<=2;i++)
		{
			mul*=arr1[i];
		}
		
		System.out.println("Multiplication    :"+mul);
		
		//arr3= new int[20];  dynamic inilization of arrays
    
	}

}
