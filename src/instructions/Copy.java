package instructions;

import computer.Address;
import computer.Instruction;
import computer.Memory;
import computer.Operand;
import computer.ProgramCounter;

public class Copy implements Instruction {
	private Operand op;
	private Address dest;
	
	public Copy(Operand op, Address dest) {
		this.op = op;
		this.dest = dest;
	}
	
	@Override
	public void execute(Memory memory, ProgramCounter programCounter) {
		memory.put(op.word(memory), dest);
	}

	public String toString() {
		return "CPY " + op + " " + dest;
	}
}
