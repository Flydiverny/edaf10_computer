package instructions;

import computer.Instruction;
import computer.Memory;
import computer.ProgramCounter;

public class Halt implements Instruction {

	@Override
	public void execute(Memory memory, ProgramCounter programCounter) {
		programCounter.jump(-1);
	}
	
	public String toString() {
		return "HLT";
	}
}
