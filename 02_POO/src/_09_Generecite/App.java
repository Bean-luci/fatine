package _09_Generecite;

public class App {

	public static void main(String[] args) {
		
		MyGeneric <String> MyGenericStr= new MyGeneric <>("Hello");
		MyGeneric <Integer> MyGenericInt= new MyGeneric <>(12);
		
		System.out.println(MyGenericStr);
		System.out.println(MyGenericInt);
		
		MyGeneric <String>myGenericStr2= new MyGeneric<>("Hello World");
		
		System.out.println(MyGenericStr.myEquals(myGenericStr2));
		System.out.println(MyGenericInt.myEquals(new MyGeneric<>(13)));
		
		
	}

}
