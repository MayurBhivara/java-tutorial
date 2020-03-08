package setters;
class cats{
	private int age;
	private String name;
	public void setAge(int newAge){
		age=newAge;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
		
	}
}
public class App {

	public static void main(String[] args) {
		cats cat1=new cats();
		cat1.setAge(13);
		cat1.setName("ginger");
		System.out.println("name of cat is " + cat1.getName());
		System.out.println("age of cat is "+cat1.getAge()); 
		

	}

}
