package instructions;

import computer.Address;
import computer.Instruction;
import computer.Memory;
import computer.Operand;
import computer.ProgramCounter;

public class Print implements Instruction {

	private Operand op;
	
	public Print(Operand op) {
		this.op = op;
	}
	
	@Override
	public void execute(Memory memory, ProgramCounter programCounter) {
		System.out.println(op.word(memory));
	}
	
	public String toString() {
		return "PRT " + op;
	}
}
