
public class linearsearch {
    public static int linearSearch(int arr[], int x){
    	for(int i=0; i<= arr.length-1; i++) {
    		if(arr[i]==x) {
    			return i;
    		}
    	}    	
    	return -1;

    }
	public static void main(String[] args) {
		int arr[]= {1,4,5,7,9,12,8};
		System.out.println(linearSearch(arr,8));

	}

}
