package factorial;

public class ReturnKeypads {

	public static char[] numberOptions(int n) {
		switch(n) {
		case 2:
			char options2[]= {'a', 'b', 'c'};
			return options2;
		case 3:
			char options3[]= {'d', 'e', 'f'};
			return options3;
		case 4: 
			char options4[]= {'g', 'h', 'i'};
	        return options4;
		case 5:
			char options5[]= {'j', 'k', 'l'};
			return options5;
		case 6:
			char options6[]= {'m', 'n', 'o'};
			return options6;
		case 7:
			char options7[]= {'p', 'q', 'r'};
			return options7;
		case 8:
			char options8[]= {'s', 't', 'w'};
			return options8;
		case 9:
			char options9[]= {'x', 'y', 'z'};
			return options9;
		default:
		    char options[]= {'\0'};
		    return options;
			}
		}
public static String[] returnKeypad(int n) {
	if(n== 0) {
		String ans[]= {""};
		return ans;
	}
	int lastDigit= n%10;
	int smallerNumber= n/10;
	String SmallAns[]= returnKeypad(smallerNumber);
	char options[]= numberOptions(lastDigit);
	String ans[] = new String[SmallAns.length * options.length];
	int k=0;
	for(int i=0; i<SmallAns.length; i++) {
		for(int j=0; j<options.length;j++) {
			ans[k]=SmallAns[i]+ options[j];
			k++;
		}
	}
	return ans;
		
}

	public static void main(String[] args) {
		int num = 234;
		String[] ans= returnKeypad(num);
		for(int i=0; i<ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

}
