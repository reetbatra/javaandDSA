package factorial;

public class checkSorted {
	
public static boolean checkSorted(int input[]){
		
		if(input.length <= 1){
			return true;
		}
		
		int smallInput[] = new int[input.length - 1];
		for(int i = 1; i < input.length; i++){
			smallInput[i - 1] = input[i];
		}
		
		boolean smallAns = checkSorted(smallInput);
		if(!smallAns){
			return false;
		}
		if(input[0] <= input[1]){
			return true;
		}else{
			return false;
		}
		
	}
public static boolean checkSorted_2(int input[]){
		
		if(input.length <= 1){
			return true;
		}
		if(input[0] > input[1]){
			return false;
		}
		 
		int smallInput[] = new int[input.length - 1];
		for(int i = 1; i < input.length; i++){
			smallInput[i - 1] = input[i];
		}
		boolean smallAns = checkSorted_2(smallInput);
		return smallAns;
//		if(smallAns){
//			return true;
//		}else{
//			return false;
//		}

}
//this ftn checks if the array is sorted from startIndex to end
public static boolean checkSortedBetter(int input[], int startIndex) {
	if(startIndex >= input.length -1) {
		return true;
}
	if(input[startIndex] > input[startIndex + 1]) {
		return false;
	}
	boolean smallAns = checkSortedBetter(input, startIndex +1);
	return smallAns;
}
//in previous situation, we are taking base case and main problem in arrays length and in checksorted better
//we are considering arrays index as to make the problem smaller we need to realise that array's length remain the
//same as array is same

	public static void main(String[] args) {
		int input[] = {1,2,3, 5, 7, 1, 4};
		System.out.println(checkSortedBetter(input,0));

	}

}