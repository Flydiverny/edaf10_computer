package instructions;

import computer.Instruction;
import computer.Memory;
import computer.ProgramCounter;

public class Jump implements Instruction {
	protected final int dest;
	
	public Jump(int dest) {
		this.dest = dest;
	}

	@Override
	public void execute(Memory memory, ProgramCounter programCounter) {
		programCounter.jump(dest);
	}
	
	public String toString() {
		return "JMP " + dest;
	}
}
