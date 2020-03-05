package method;
class studentInfo{
	int rollNo;
	String name;
	String cls;
	void info(){
		System.out.println("Name of student is "+ name + " of class " + cls + " and roll no "+ rollNo);
	}
	
}
public class App {

	public static void main(String[] args) {
		studentInfo student1 = new studentInfo();
student1.rollNo= 001;
student1.name= "nick";
student1.cls= "etrx-A";
student1.info();

	}

}
