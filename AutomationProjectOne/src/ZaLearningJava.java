import java.util.Random;

public class ZaLearningJava {

	public static void main(String[] args) {
		int MyAge = -43;
		String MyName = "Zaid abu bader ?? ";
		boolean ilovejava = true;
		char Myfirstcharacter = 'z';
		double Myhighest = 178.5;

		System.out.println(MyAge);
		System.out.println(MyName.replace("Zaid", "Naya"));
		System.out.println(MyName);
		System.out.println(MyName.replace("??", ""));
		System.out.println(MyName.contains("Z"));
		System.out.println(MyName.contains("N"));
		System.out.println(MyName.contains("z"));

		System.out.println(MyName.charAt(3));

		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println(MyAge);
		System.out.println(Math.abs(MyAge));

		System.out.println(Math.ceil(Myhighest));// بتشيل الرقم الي بعد الفاصله و بتزيد عليه واحد

		System.out.println(Math.floor(Myhighest));// بتشيل الرقم الي بعد الفاصله و بترجع الرقم الي قبل

		System.out.println(Math.round(Myhighest));
		System.out.println();
		System.out.println();

		Random rand = new Random();
		System.out.println(rand.nextInt());// بجيب ارقام عشوائيه مالهاش اساس
		System.out.println(rand.nextInt(10));// بجيب ارقاملحد ال 10
		System.out.println(rand.nextInt(2, 10));// راح يجيب ارقام مابين ال 2 و ال 10 بس مابوخذ ال 10، وراح يجيب ال 2
		System.out.println(rand.nextInt(2, 11));// راح يجيب ارقام مابين ال 2 و ال 10 بس راح بوخذ ال 10، وراح يجيب ال 2

	}

}
