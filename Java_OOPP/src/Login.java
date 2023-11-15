
public class Login {

	public static void main(String[] args) {

		Parameterssss myobject = new Parameterssss();

		System.out.println(myobject.MyUsername);
		System.out.println(myobject.Myage);
		System.out.println(myobject.Myhighest);
		System.out.println(myobject.MyUrl);

		int myageplusten = myobject.Myage + 10;
		System.out.println(myageplusten);
		System.out.println(myobject.Myage);
		
		// this is wrong ,the object created from the class name 
		// not from the variable
		// ihatejave hateit=new ihatejave 
		// for that we must do the following
		Victor hateit=new Victor();
		System.out.println(hateit.ihatejave);
		System.out.println(hateit.myhate);
		

	}

}
