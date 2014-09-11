package instructions;

import computer.Address;
import computer.Memory;
import computer.ProgramCounter;
import computer.Word;

public class JumpEq extends Jump {

	private Word word;
	private Address addr;
	
	public JumpEq(int dest, Address addr, Word word) {
		super(dest);
		this.addr = addr;
		this.word = word;
	}
	
	@Override
	public void execute(Memory memory, ProgramCounter programCounter) {
		if(memory.read(addr).compareTo(word) == 0) {
			super.execute(memory, programCounter);
		}
	}
	
	public String toString() {
		return "JEQ " + dest + " " + addr + " " + word;
	}
}
