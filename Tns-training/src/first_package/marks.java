package first_package;
class id{
	int id() {
		return 100;
	}
}
class name extends id{
	String nameis(){
		return "aishu";
	}
}
public class marks extends name {

	public static void main(String[] args) {
		marks nameinstance=new marks();
		nameinstance.nameis();
		nameinstance.id();
		// TODO Auto-generated method stub

	}

}
