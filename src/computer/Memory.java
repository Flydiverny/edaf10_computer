package computer;

public abstract class Memory {
	private Word[] memory;
	
	public Memory(int size) {
		this.memory = new Word[size];
	}
	
	public Word read(Address address) {
		return this.memory[address.value()];
	}
	
	public void put(Word word, Address address) {
		this.memory[address.value()] = word;
	}
}
