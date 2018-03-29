package ContactList;

public class DriverClass {

	public static void main(String[] args) {

		ContactList Contacts = new ContactList();
		
		Contacts.add("Enrique", "909-933-9136");
		
		Contacts.add("Tristan", "909-123-1142");
		
		Contacts.add("Rosa", "123-134-3443");
		
		System.out.println(Contacts);

		Contacts.add("Eric", "909-123-4353");
		
		
		Contacts.remove("Tristan");
		
		System.out.println(Contacts);
	}

}
