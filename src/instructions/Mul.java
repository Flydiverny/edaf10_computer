package instructions;

import computer.Address;
import computer.Operand;
import computer.Word;

public class Mul extends ArithmeticInstruction{

	public Mul(Operand v1, Operand v2, Address dest) {
		super(v1, v2, dest);
	}

	@Override
	protected Word op(Word op1, Word op2) {
		op1.mul(op2);
		return op1;
	}

	@Override
	protected String code() {
		return "MUL";
	}

}
