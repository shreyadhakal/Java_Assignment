package ExtraAssignment;

public class Person_Encapsulation {

	public static void main(String[] args) {
		PersonText_encapsulation obj1 = new PersonText_encapsulation();
		obj1.setRoll(10);;  //set
		obj1.setName("Ram");;   //set
		obj1.setNationality("Nepali");;   //set
		System.out.println(obj1.getRoll());    //get
		System.out.println(obj1.getName());    //get
		System.out.println(obj1.getNationality());   //get
		
		System.out.println("-----------------------");
		
		PersonText_encapsulation obj2 = new PersonText_encapsulation();
		obj1.setRoll(15);;  //set
		obj1.setName("Shyam");;   //set
		obj1.setNationality("Nepali");;   //set
		System.out.println(obj1.getRoll());    //get
		System.out.println(obj1.getName());    //get
		System.out.println(obj1.getNationality());   //get
	}

}
