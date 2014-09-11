package instructions;

import computer.Address;
import computer.Instruction;
import computer.Memory;
import computer.ProgramCounter;
import computer.Word;

public class Mul implements Instruction {
	
	private Address dest, x, y;
	
	public Mul(Address dest, Address x, Address y) {
		this.dest = dest;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void execute(Memory memory, ProgramCounter programCounter) {
		Word xw = memory.read(x);
		Word xy = memory.read(y);
		xy.mul(xw);
		
		memory.put(xy, dest);
	}
	
	public String toString() {
		return "MUL " + dest + " " + x + " " + y;
	}

}
