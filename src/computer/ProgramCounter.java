package computer;

public class ProgramCounter {
	private int pC = 0;
	private int next = 0;
	
	public int next() {
		this.pC = next;
		this.next = pC + 1;
		
		return pC;
	}
	
	public int current() {
		return this.pC;
	}

	public void jump(int dest) {
		this.next = dest; 
	}
}
