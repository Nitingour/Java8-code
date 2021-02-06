import java.util.Arrays;

public class SortingDemo {

	public static double[] createArray(int size)
	{
		double myarr[]=new double[size];
		   for(int i=0;i<size;i++)
		   {
			   myarr[i]=Math.random();
		   }
		return myarr;
	}
	
	
	public static void main(String[] args) {
		
		double arr1[]=createArray(10000000);
		
		double arr2[]=Arrays.copyOf(arr1,arr1.length);
		
		long starttime =System.currentTimeMillis();// 1 jan 1970 00:00AM to tilldate
		Arrays.sort(arr1);	
		long endtime =System.currentTimeMillis();
		System.out.println("Time taken by serial sorting is="+(endtime-starttime)+" ms");
		
		long starttime1 =System.currentTimeMillis();// 1 jan 1970 00:00AM to tilldate
		Arrays.parallelSort(arr2);	
		long endtime1 =System.currentTimeMillis();
		System.out.println("Time taken by parallel sorting is="+(endtime1-starttime1)+" ms");
		
	}

}
