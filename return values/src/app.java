class worker{
	int age;
	String name;
	int yearsToRetirement(){
		return 65-age;
	}
}
public class app {

	public static void main(String[] args) {
		worker worker1=new worker();
		worker1.name= "smith";
		worker1.age=29;
		int age = worker1.yearsToRetirement();
		System.out.println(age + " years left till retirement");

	}

}
