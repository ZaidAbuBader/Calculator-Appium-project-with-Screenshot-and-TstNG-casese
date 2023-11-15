import java.util.ArrayList;
import java.util.List;

public class ListArray {

	public static void main(String[] args) {
     
		List <String> Myname =new ArrayList<String>();
		
		List <Integer> MyMarks  =new ArrayList<Integer>();
		
		List<String> MyFullName=new ArrayList<String>();
	//	MyFullName [0]="zaid";// this is wrong in the list ,we must use add method to accept it .
		MyFullName.add("zaid");
		MyFullName.add("shaker");
		MyFullName.add("abu");
		MyFullName.add("Bader");
		System.out.println(MyFullName.get(2));
		System.out.println(MyFullName.get(0));
		System.out.println(MyFullName.get(0).toUpperCase());
		System.out.println(MyFullName.get(0).toUpperCase().charAt(2));
		
		for(int i=0;i<4;i++);
		
		{
			System.out.println(MyFullName.get(0));
			}
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println();
		

		
		System.out.println();
		
		MyMarks.add(15);
		MyMarks.add(85);
		MyMarks.add(67);
		System.out.println(MyMarks.get(2));
		//System.out.println(MyMarks.get(3)); thats is not approved because its not added 
		System.out.println(MyFullName.get(0)+"  its mark is "+MyMarks.get(2));

		
		
		
		
	}

}
