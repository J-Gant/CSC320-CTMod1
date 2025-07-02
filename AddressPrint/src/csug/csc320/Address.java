package csug.csc320;

public class Address {
	private String nameFirst;
	private String nameLast;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	
	//parameterized constructor for Address objects
	public Address(String nameFirst, String nameLast, String streetAddress, String state, String city, String zipCode) {
		this.nameFirst = nameFirst.trim();
		this.nameLast = nameLast.trim();
		this.streetAddress = streetAddress.trim();
		this.city = city.trim();
		this.state = state.trim();
		this.zipCode = zipCode.trim();
	}
	
	//echos input for user address
	public void printAddress() {
		System.out.println(nameFirst + " " + nameLast);
        System.out.println(streetAddress);
        System.out.println(city + ", " + state + " " + zipCode);
        System.out.println();
	}
	
}
