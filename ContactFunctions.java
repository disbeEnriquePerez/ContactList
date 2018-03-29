package ContactList;

public interface ContactFunctions {

	void add(String Name, String PhoneNumber);
	String toString();
	void remove(String name);
	void removeLast();
	boolean changePhoneNumber(String Name, String NewNumber);
}