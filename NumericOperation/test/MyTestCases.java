import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyTestCases {
	private NumberProcessing ipobj;	
	@Before
	public void instansiate(){
		ipobj=new NumberProcessing();
	}
	/*@Test
	public void getInputFromUser(){
		int num=ipobj.getInput();
		int length = (int)(Math.log10(num)+1);
		Assert.assertEquals(5,length);
		show("input from user", num);	
	}
	@Test
	public void insertSpacesInbetween(){
		
		int num=ipobj.getInput();
		int arr[]=ipobj.includeSpace(num);
		Assert.assertEquals(5,arr.length);
	show("after 3 spaces inbetween", arr);	
	}
	
	@Test
	public void sortingAsc(){
		int num=ipobj.getInput();
		int arr[]=ipobj.includeSpace(num);
		int sorted[]=ipobj.sortIt(arr);
		Assert.assertEquals(5,arr.length);
		show("after sorting", sorted);
	}*/
	
	@Test
	public void addIt(){
		int num=ipobj.getInput();
		int arr[]=ipobj.includeSpace(num);
		int res=ipobj.sumIt(arr, "Even");
		int length = (int)(Math.log10(res)+1);
		Assert.assertEquals(2,length);
		show("sum of even is", res);
		
	}
	public void show(String msg,int arr[]){
		System.out.println(msg);
		System.out.println("--------------");
		int l=arr.length;
		for(int i=0;i<l;i++ ){
			System.out.print(arr[i]+"\t");}
	}
public void show(String msg,int num){
	System.out.println(msg);
	System.out.println("--------------");
	System.out.println(num);
	}

}
