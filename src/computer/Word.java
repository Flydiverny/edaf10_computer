package computer;

public interface Word extends Comparable<Word>, Operand {
	public Word add(Word word);
	
	public Word mul(Word word);
}
