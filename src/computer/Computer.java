package computer;

public class Computer {
	private Memory memory;
	private Program program;
	
	public Computer(Memory memory) {
		this.memory = memory;
	}
	
	public void load(Program program) {
		this.program = program;
	}
	
	public void run() {
		ProgramCounter pC = new ProgramCounter();

		while(pC.next() >= 0) {
			this.program.get(pC.current()).execute(this.memory, pC);
		}
	}
}
