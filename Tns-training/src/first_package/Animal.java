package first_package;
class animal{
	String makeSound() {
		return "makes sound";
	}
}
class Dog extends animal{
	String bark() {
		return "bark";
	}
}
public class Animal extends Dog{

	public static void main(String[] args) {
		Animal a=new Animal();
		System.out.print(a.bark()+a.makeSound());
		// TODO Auto-generated method stub

	}

}
