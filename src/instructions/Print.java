package instructions;

import computer.Address;
import computer.Instruction;
import computer.Memory;
import computer.ProgramCounter;

public class Print implements Instruction {

	private Address address;
	
	public Print(Address address) {
		this.address = address;
	}
	
	@Override
	public void execute(Memory memory, ProgramCounter programCounter) {
		System.out.println(memory.read(address));
	}
	
	public String toString() {
		return "PRT " + address;
	}
}
