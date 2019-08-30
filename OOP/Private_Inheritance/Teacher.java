package Private_Inheritance;

public class Teacher extends Person {
	private String Qualificaion;
	
	public void setQualificaion(String Qualificaion) {
		this.Qualificaion= Qualificaion;
	}

	public String getQualificaion() {
		return Qualificaion;
	}
	

	void display() {
		System.out.println("Name: "+getName());
		System.out.println("Age;: "+getAge());
		System.out.println("Qualificaion: "+getQualificaion());
		System.out.println("\n");
		
	}
}
