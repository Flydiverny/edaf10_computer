package computer;

public class Address implements Operand {
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

	@Override
	public Word word(Memory memory) {
		return memory.read(this);
	}
}
