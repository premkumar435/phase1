package practice;

public class OrderStat {
	
	int SmS(int arr[], int l, int r, int k) { 
		if (k > 0 && k <= r - l + 1) { 
			int pos = randomPartition(arr, l, r); 
        	if (pos-l == k-1) 
            	return arr[pos]; 
        	if (pos-l > k-1) 
            	return SmS(arr, l, pos-1, k); 
        		return SmS(arr, pos+1, r, k-pos+l-1); 
    		} 
		return Integer.MAX_VALUE; 
	} 

	void swap(int arr[], int i, int j) { 
		int temp = arr[i]; 
		arr[i] = arr[j]; 
		arr[j] = temp; 
	} 

	int partition(int arr[], int l, int r) { 
		int x = arr[r], i = l; 
		for (int j = l; j <= r - 1; j++) { 
			if (arr[j] <= x) { 
				swap(arr, i, j); 
				i++; 
			} 
		} 
		swap(arr, i, r); 
		return i; 
	} 

	int randomPartition(int arr[], int l, int r) { 
		int n = r-l+1; 
		int pivot = (int)(Math.random()) * (n-1); 
		swap(arr, l + pivot, r); 
		return partition(arr, l, r); 
	} 


	public static void main(String[] args) {
		OrderStat ob = new OrderStat(); 
		int arr[] = {6, 5, 4, 3, 2, 1}; 
		int n = arr.length,k = 4; 
		System.out.println("Sms is the Given element "+ ob.SmS(arr, 0, n-1, k)); 
	}
}