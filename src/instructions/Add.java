package instructions;

import computer.Address;
import computer.Operand;
import computer.Word;

public class Add extends BinaryInstruction {

	public Add(Operand v1, Operand v2, Address dest) {
		super(v1, v2, dest);
	}

	@Override
	protected Word op(Word op1, Word op2) {
		return op1.add(op2);
	}

	@Override
	protected String code() {
		return "ADD";
	}
}