
public class ArrayTest {

	public static void main(String[] args) {

		////// ARRRRRRRRRAYS ///////

		//// Static Array

		String MyStudents[] = new String[4];
		MyStudents[0] = "zaid";
		MyStudents[1] = "shaker";
		MyStudents[2] = "ahmaed";
		MyStudents[3] = "bader";

		System.out.println(MyStudents[0] + " " + MyStudents[1] + " " + MyStudents[2] + " " + MyStudents[3]);
		System.out.println(MyStudents[0].toUpperCase());
		System.out.println(MyStudents[0] + " " + MyStudents[1] + " " + MyStudents[2] + " " + MyStudents[3]);

		String Mydaughter[] = new String[3];
		Mydaughter[0] = "Naya";
		Mydaughter[1] = "Tuleen";
		Mydaughter[2] = "Yara";

		// Mydaughter[3]="wateen";مابزبط نحط عنصر رابع و المصفوفه انا محددها ل 3 عناصر
		// بس

		System.out.println(Mydaughter[0] + "  " + Mydaughter[1] + " " + Mydaughter[2]);
		System.out.println(Mydaughter[0] + "  " + Mydaughter[1] + " " + Mydaughter[2] + "  " + MyStudents[0]);

		System.out.println();
		System.out.println();

		// Dynamic array

		int Mymobilnumber[] = { 0, 7, 9, 9, 9, 5, 0, 3 };
		System.out.println(Mymobilnumber[2]);
		System.out.println();

		Mymobilnumber[0] = 1;
		System.out.println(Mymobilnumber[0]);
		
		System.out.println();

		//System.out.println(Mymobilnumber[8]);راح يطلع ايرور لانو خترج النطاق ,ومش موجود ضمن المصفوفه الاندكس 8
       
		String [] Mylove= {"naya" ,"Tuleen","Yara","wateen"};
		System.out.println(Mylove[2]);
		
		Mylove[3]="osama";
		System.out.println(Mylove[3]);


}
	}


