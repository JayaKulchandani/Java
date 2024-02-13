package sd;

public class emp {
	String name;
	int id;
	Address add;
	
	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	void display() {
		
		System.out.println("Name of Student "+name+" Id of Student "+id);
		System.out.print("Address of student "+ add.getCity());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
