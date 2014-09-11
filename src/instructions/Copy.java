package instructions;

import computer.Address;
import computer.Instruction;
import computer.Memory;
import computer.ProgramCounter;
import computer.Word;

public class Copy implements Instruction {
	private Word word;
	private Address address;
	
	public Copy(Word word, Address address) {
		this.word = word;
		this.address = address;
	}
	
	@Override
	public void execute(Memory memory, ProgramCounter programCounter) {
		memory.put(word, address);
	}

	public String toString() {
		return "CPY " + word + " " + address;
	}
}
