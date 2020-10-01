package youtube.pack1;

public class BinarySearch {
	
	public static int binarySearch(int [] a, int item) {
		
		int low = 0;
		int high = a.length-1;
		int mid = 0;
		
		while(low <= high) {
		
			mid = (low+high)/2;
			
			if(a[mid] == item)
				return mid;
			else if(a[mid] < item)
				low = mid+1;
			else
				high = mid-1;
		}
		
		return -1;
		
	}
	
	public static void main(String [] args) {
		
		
		int [] sort = {1,2,3,4,6,8,10,12};
		
		System.out.println(binarySearch(sort, 1));
		
		
		
		
	}

}
