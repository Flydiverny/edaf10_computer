package instructions;

import computer.Memory;
import computer.Operand;
import computer.ProgramCounter;

public class JumpEq extends Jump {

	private Operand op1, op2;
	
	public JumpEq(int dest, Operand op1, Operand op2) {
		super(dest);
		this.op1 = op1;
		this.op2 = op2;
	}
	
	@Override
	public void execute(Memory memory, ProgramCounter programCounter) {
		if(op1.word(memory).compareTo(op2.word(memory)) == 0) {
			super.execute(memory, programCounter);
		}
	}
	
	public String toString() {
		return "JEQ " + dest + " " + op1 + " " + op2;
	}
}
