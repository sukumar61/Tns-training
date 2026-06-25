package animal;
class behivar {
	String bark="barks";
	void barks() {
		System.out.print("barks");
	}
	behivar(){
		System.out.print("cat is con");
	}
}
class cat extends behivar{
	String bark="barks";
	void barks() {
		System.out.print("smiles");

		super.barks();
	}

}
class animal {
	public static void main(String []args) {
		cat sc=new cat();
		sc.barks();
		
	}
}