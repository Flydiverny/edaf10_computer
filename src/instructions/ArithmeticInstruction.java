package instructions;

import computer.Address;
import computer.Instruction;
import computer.Memory;
import computer.Operand;
import computer.ProgramCounter;
import computer.Word;

public abstract class ArithmeticInstruction implements Instruction {
	
	private Address dest;
	private Operand v1, v2;
	
	public ArithmeticInstruction(Operand v1, Operand v2, Address dest) {
		this.dest = dest;
		this.v1 = v1;
		this.v2 = v2;
	}

	@Override
	public void execute(Memory memory, ProgramCounter programCounter) {
		memory.put(op(v1.word(memory), v2.word(memory)), dest);
	}
	
	protected abstract Word op(Word op1, Word op2);
	
	protected abstract String code();
	
	public String toString() {
		return code() + " " + v1 + " " + v2 + " " + dest;
	}
}