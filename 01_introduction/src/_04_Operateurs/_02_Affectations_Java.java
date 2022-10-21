package _04_Operateurs;

public class _02_Affectations_Java {

	public static void main(String[] args) {

		int c= 10;
		System.out.println(c);//10
		System.out.println(c++); //10: écrit puis incrémente
		System.out.println(++c); // 12: incrémente à partir de 11 puis écrit
		
		int a= 0;
		
		a+= 5;
		System.out.println("a="+a);
		
		a*= 5;
		System.out.println("a="+a);
		
		a/= 5;
		System.out.println("a="+a);
		
		a-= 5;
		System.out.println("a="+a);
		
	}

}
