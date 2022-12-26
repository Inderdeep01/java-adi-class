public class mergeSort
{
	private static int []aux;
	public static void merge(int[] arr, int[] aux, int lo, int mid, int hi)
	{
		for(int k= 0; k<=hi ; k++)
			aux[k] = arr[k]; // coping all data in auxiliary array
		int i = lo , j = mid+1;
		for(int k =lo ; k <= hi ; k++)
		{
			if(i > mid)
				arr[k] = aux[j++];
			else if (j > hi)
				arr[k] = aux[i++];
			else if (aux[j] <aux[i])
				arr[k] = aux[j++];
			else
				arr[k] = aux[i++];
		}
	}
	public static void sort(int []arr) 
	{
		int n = arr.length;
		aux = new int[n];
		for(int size = 1; size < n ; size = size + size)
			for(int lo = 0; lo < n-size ; lo = lo +(size+size) )
				merge(arr,aux,lo, lo+size -1 , Math.min(lo+size+size-1, n-1));
	}
	public static void main(String[] args) 
	{
		int[] arr = {5,9,17,3,29,13,10,7,2,11,23};
		int[] aux = new int[arr.length];
		int lo =0;
		int hi = arr.length;
		int mid = (lo+hi)/2;
		sort(arr);
		for(int a : arr)
			System.out.print(a + "  ");
	}

}


