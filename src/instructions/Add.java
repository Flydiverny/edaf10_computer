package instructions;

import computer.Address;
import computer.Instruction;
import computer.Memory;
import computer.ProgramCounter;
import computer.Word;

public class Add implements Instruction {
	
	private Address dest, add;
	private Word val;
	
	public Add(Address dest, Word val, Address add) {
		this.dest = dest;
		this.add = add;
		this.val = val;
	}

	@Override
	public void execute(Memory memory, ProgramCounter programCounter) {
		Word value = memory.read(add);
		value.add(val);
		memory.put(value, dest);
	}
	
	public String toString() {
		return "ADD " + dest + " " + val + " " + add;
	}
}