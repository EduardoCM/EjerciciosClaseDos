package urbanreyes.adan;

public class Person{
	private String fullName;
	private char gender;
	public Person father;
	public Person mother;

	public Person(){
	}

	public Person(String fullName, char gender){
		this.gender = gender;
		this.fullName = fullName;
	}

	public Person makeBaby(Person couple, String fullName, char gender){
		Person s = null;
		if(this.gender != couple.gender){
			s = new Person(fullName, gender);
			if(this.gender == 'M'){
				s.father = this;
				s.mother = couple;
			}
			else
			{
				s.father = couple;
				s.mother = this;
			}
		}
		return s;
	}
}
