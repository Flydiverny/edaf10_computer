package computer;

public interface Instruction {
	public void execute(Memory memory, ProgramCounter programCounter);
}
