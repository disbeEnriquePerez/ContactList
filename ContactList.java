package ContactList;


public class ContactList implements ContactFunctions{

	
	private Contact firstNode = null;
    
	private class Node
    {
        public String Name, PhoneNumber;
        public Contact next = null;
        public  Contact node = null;
        private Node(Contact Node)
        {
        	next = Node.getNext();
        	Name = Node.getName();
        	PhoneNumber = Node.getPhoneNumber();
        	this.node = Node;
        }
        public void setNext(Contact Next){
        	node.setNext(Next);
        }
        public Contact getContact(){
        	return node;
        }
        public void setContact(Contact contact){
        	this.node = contact;
        }
        
        public String toString()
        {
            return Name + ", " + PhoneNumber;
        }
    }

	@Override
	public void add(String name , String PhoneNumber) {
		Contact contact = new Contact(name,PhoneNumber);
		Node node = null;
		if(firstNode == null){
			firstNode = contact;
			return;
		}else{
			for(Contact iterator = firstNode ; iterator != null; iterator = iterator.next){
				if(name.compareTo(iterator.getName()) < 0 && iterator == firstNode){
					contact.setNext(iterator);
					firstNode = contact;
					return;	
					
				}else if(name.compareTo(iterator.getName()) > 0 && iterator.next == null){
					iterator.setNext(contact); 
					contact.setNext(null);
					return;
				}else if(name.compareTo(iterator.getName()) > 0){
					node = null;
					node = new Node(iterator);
					
				}else if(name.compareTo(iterator.getName()) < 0){	
					contact.setNext(node.next);
					node.setNext(contact);
					return;
					
				}
			}
		}		
	}


	@Override

	public void remove(String name){
		Contact index = null;
		for(Contact iterator = firstNode; iterator != null; iterator = iterator.next){
			if(name.equals(iterator.getName())){
				index = iterator;
			}
		}
		for(Contact iterator = firstNode ; iterator != null; iterator = iterator.next){
			if(index == firstNode){
				firstNode = firstNode.getNext();
			}else if(iterator.next== index){
				iterator.setNext(index.getNext());
				index.setNext(null);
			}
		}
	}
	
	public String toString(){
		String toString = "";
		
		for(Contact iterator = firstNode ; iterator!= null; iterator = iterator.next){
			
		toString +=	(iterator.getName() + ", " + iterator.getPhoneNumber()) + "\n";
		}
		
		return toString;
	}

	@Override
	public void removeLast() {
		Contact Last_Contact = null;
		
		for(Contact iterator = firstNode; iterator != null; iterator = iterator.next){
			if(iterator.getNext() == null ){
				Last_Contact = iterator; 
			}
		}for(Contact iterator = firstNode; iterator != null; iterator = iterator.next){
			if(iterator.next == Last_Contact){
				iterator.setNext(null);
			}
		}
	}

	@Override
	public boolean changePhoneNumber(String Name,String NewNumber) {
		for(Contact iterator = firstNode; iterator != null; iterator = iterator.next){
			
			if(Name.equals(iterator.getName())){
				iterator.setPhoneNumber(NewNumber);
				return true;
			}
		}
		return false;
	}

}

