package ContactList;

public class Contact {

	private String Name, Phonenumber;
	public Contact next = null;
	public Contact(String name, String Phonenumber){
	
			this.Name = name;
			this.Phonenumber = Phonenumber;		
	}
	
	public String toString(){
		
		return Name + ", " + Phonenumber;
	}
	
	public Contact getNext(){
		
		return next;
	}
	
	public String getName(){
		return Name;
	}
	public String getPhoneNumber(){
		return Phonenumber;
	}
	public void setNext(Contact next){
		this.next = next;
	}
	public void setName(String Name){
		this.Name = Name;
	}
	public void setPhoneNumber(String PhoneNumber){
		this.Phonenumber = PhoneNumber;
	}
	
}
