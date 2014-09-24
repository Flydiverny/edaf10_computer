package computer;

public abstract class Program extends java.util.ArrayList<Instruction> {
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < this.size(); i++) {
			sb.append(i).append(' ').append(this.get(i)).append(System.getProperty("line.separator")); // 0 XYZ\n
		}
		
		return sb.toString();
	}
}
 