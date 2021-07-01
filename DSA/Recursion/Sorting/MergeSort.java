public class MergeSort {
	
	public static void merge(int [] s1, int [] s2, int[] d) {
		int i=0;//for p1
		int j=0;//for p2
		int k=0;//index in the destination(d) array
		//comparing each element of p1 and p2 to decide which should come first
		while(i< s1.length && j< s2.length) {
			if(s1[i] <= s2[j]) {
				d[k] = s1[i];
				i++;
				k++;
			}else {
				d[k]=s2[j];
				k++;
				j++;
			}
		}
		if(i< s1.length) {
			while(i<s1.length) {
				d[k]= s1[i];
				i++;
				k++;
			}
		}
		if(j< s2.length) {
			while(j< s2.length) {
				d[k]=s2[j];
				k++;
				j++;
			}
		}
	}
	
	public static void mergeSort(int arr[]) {
		if(arr.length <=1) {
			return;
		}
		int p1[] = new int[arr.length/2];
		int p2[] = new int[arr.length - p1.length];
		
		for(int i = 0; i< arr.length/2; i++) {
			p1[i]=arr[i];
		}
		for(int i=arr.length/2; i <arr.length; i++) {
			p2[i-arr.length/2] = arr[i];
		}
		mergeSort(p1);
		mergeSort(p2);
		//two sorted array
		merge(p1,p2, arr);
			}

	public static void main(String[] args) {
		int arr[] = {10, 4, 5, 9, 8, 6, 12, 11, 7};
		mergeSort(arr);
		for(int i =0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
