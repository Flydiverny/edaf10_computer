package computer;

public abstract class Program extends java.util.ArrayList<Instruction> {
	public void run(Memory memory, ProgramCounter pC) {
		while(pC.next() >= 0) {
			this.get(pC.current()).execute(memory, pC);
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < this.size(); i++) {
			sb.append(i).append(' ').append(this.get(i)).append(System.getProperty("line.separator")); // 0 XYZ\n
		}
		
		return sb.toString();
	}
}
 