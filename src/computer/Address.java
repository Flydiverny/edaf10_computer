package computer;

public class Address {
	private int address;
	
	public Address(int address) {
		this.address = address;
	}
	
	public int value() {
		return this.address;
	}
	
	public String toString() {
		return "[" + this.address + "]";
	}
}
