package projPractice;

public class LongstIncSeq {
	static int lis(int arr[], int n) {
		int lis[] = new int[n];
		int i, j, max = 0;

		for (i = 0; i < n; i++)
			lis[i] = 1;

		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++)
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;

		for (i = 0; i < n; i++)
			if (max < lis[i])
				max = lis[i];

		return max;
	}

	public static void main(String args[])
	{
		int arr[] = { 10, 22, 60, 13, 11, 15, 3, 99};
		int n = arr.length;
		System.out.println("Length of list is " + lis(arr, n) + "\n");
	}
}
