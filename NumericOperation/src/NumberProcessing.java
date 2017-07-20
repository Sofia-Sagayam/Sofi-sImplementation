import java.util.Scanner;

public class NumberProcessing {

	public int getInput(){
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if((int)(Math.log10(num)+1)<=1){
			System.out.println("enter 5 digit number..");
		}
		return num;
	}
	
	public int[] includeSpace(int num){
		int a=num;
		int len=(int)Math.log10(num)+1;
		int rev[]=new int[len];
		
		for(int i=len-1;i>=0;i--){
			rev[i]=a%10;
			a=a/10;
		}
		
		 
		return rev;
	}
	
	public int[] sortIt(int arr[]){
	int len=arr.length;
	int temp=0;
	for(int i=0;i<len;i++){
		for(int j=i+1;j<len;j++){
			if(arr[i]>arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	return arr;
	}
	
	public int sumIt(int arr[],String oddrEven){
		int result=0;
		int len=arr.length;
		switch(oddrEven){
		case "Odd":
			for(int i=0;i<len;i++){
				if(arr[i]%2!=0){
					result+=arr[i];
				}
			}
			break;
		case "Even":
			for(int i=0;i<len;i++){
				if(arr[i]%2==0){
					result+=arr[i];
				}
			}
			break;
		}
		return result;
	}
}
