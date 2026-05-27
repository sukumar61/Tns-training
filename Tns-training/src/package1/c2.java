package package1;

public class c2 {

	public static void main(String[] args) {
		c1 c1instance=new c1();
		System.out.println(c1instance.showId());
		boolean finalResult=c1instance.showresult();
		if(finalResult) {
			System.out.println("aishu passed");
		}
		else {
			System.out.println("aishu failed");
		}
	}

}
