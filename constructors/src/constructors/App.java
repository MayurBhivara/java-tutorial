package constructors;
class machine{
	private String name;
	private int code;
	public machine(){
		System.out.println("machine running");
		name="arnie";
		code=00;
	}
	public machine(String name){
	this.name=name;
	}
	public machine(String name, int code){
		this.name=name;
		this.code=code;
	}
	public String getName(){
		return name;
		
	}
	public int getCode(){
		return code;
	}
}
public class App {
	public static void main(String[] args){
		
		machine machine1= new machine();
		System.out.println(machine1.getName());
		System.out.println(machine1.getCode());
		machine machine2= new machine("berta");
		System.out.println(machine2.getName());
		machine machine3=new machine("albert",007);
		System.out.println(machine3.getName()+ machine3.getCode());
	}

}
