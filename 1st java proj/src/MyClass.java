
public class MyClass {

	public static void main(String[] args) {

		String MyName = "Zaid Abu Bader ";
		String DaughterName = "Naya";


		int MyAge = 42;

		char Myfirstletter = 'N';

		boolean iLovejava = true;

		double MyHighest = 173.2595465121321645;

		float Myhomearea = 125.756f;
		System.out.println(MyName.toUpperCase());
		System.out.println(MyName.toLowerCase());
		System.out.println(Myfirstletter);
		System.out.println(iLovejava);
		System.out.println(MyHighest);
		System.out.println(Myhomearea);
		System.out.println();

		// STRING methods
		System.out.println("the length of my name is  " + MyName.length());
		System.out.println(MyName.indexOf("Bader"));
		System.out.println(MyName.indexOf("bader") + " " + MyName.indexOf("Abu"));
		System.out.println(MyName.indexOf("a", 3));
		System.out.println(MyName.indexOf("a", 3));
		System.out.println(MyName.indexOf("A", 3));
		System.out.println(MyName.toUpperCase().indexOf("A", 0));
		System.out.println(MyName.toUpperCase().length());
		//System.out.println(MyName.codepoi


		//
		System.out.println();
		System.out.println();

		System.out.println(MyName.codePointAt(10));//97
		System.out.println(MyName.codePointBefore(11));//97
		System.out.println(MyName.codePointBefore(10));//66
		System.out.println(MyName.codePointCount(0, 3));//3

		System.out.println();
		System.out.println();

		// "test" System.out.println(MyName.codePointAt(758));
		// "test" System.out.println(MyName.codePointAt(-4));

		String myStr = "Hello Jordan";
		int result = myStr.codePointAt(3);
		System.out.println(result);

//
		
		System.out.println(MyName.charAt(3));
		//System.out.println(MyName.charAt(70));// error number y zaid
		
		System.out.println(MyName.compareTo(MyName));//0
		System.out.println(MyName.compareTo(DaughterName));//
		
		//////////
		
System.out.println(MyName.concat(DaughterName));

System.out.println(" " +DaughterName.concat(" " ).concat(MyName));

System.out.println("zaid".concat(" "). concat("abu").concat(" "). concat("bader"));

           ///////////
System.out.println(MyName.contains("Abu"));
System.out.println(MyName.contains("shaker"));
System.out.println();
/////////////
System.out.println(MyName.contentEquals(MyName));
System.out.println(MyName.contentEquals(DaughterName));
System.out.println(MyName.contentEquals("Zaid Abu Bader "));
System.out.println(MyName.contentEquals("Zaid Abu Bader      "));
System.out.println();

////////////
char[] mycharacters = {'z', 'a', 'i', 'd', 'a','b', 'u', 'b', 'a', 'd','e', 'r'};
System.out.println(MyName.copyValueOf(mycharacters, 0, 5));
System.out.println(MyName.copyValueOf(mycharacters, 2, 9));
System.out.println(MyName.copyValueOf(mycharacters, 4, 6));


char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
String myStr2 = "";
myStr2 = myStr2.copyValueOf(myStr1, 0, 2);
System.out.println("Returned String: " + myStr2); 
System.out.println();
////////////

System.out.println(MyName.endsWith("r"));
System.out.println(MyName.endsWith("r "));
System.out.println(MyName.endsWith("der "));
System.out.println(MyName.endsWith("r"));
System.out.println();
System.out.println();
System.out.println();

/////////

//////System.out.println(MyName.format("bbbbbbbb"));


//////////////////////////// ARRRRRRRRRAAAAAAAAAYYYYYYYYY///////////
System.out.println("                 This is Array partition");

//*
String[] cars = {"Volvo", "BMW", "Ford", "Mazda","kia","lada","Ferari","Opel"};
String [] days={"Sunday","Monday","Tuesday","Friday"};
int [] birthdate = {2,6,0,1,9,8,0};


System.out.println(cars[3]);
System.out.println(cars[5]);

System.out.println(cars[0]);

System.out.println(days[2]);
System.out.println(cars.length);

System.out.println();

System.out.println(birthdate[2]);
System.out.println(birthdate[4]);

System.out.println(birthdate.length);



    //System.out.println(days[7]);
	}

}

	

