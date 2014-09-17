package memory;

import computer.Memory;
import computer.Word;

public class LongWord implements Word {
	private long value;
	
	public LongWord(long value) {
		this.value = value;
	}
	
	@Override
	public Word add(Word word) {
		this.value += ((LongWord)word).value;
		return this;
	}

	@Override
	public Word mul(Word word) {
		this.value *= ((LongWord)word).value;
		return this;
	}
	
	public String toString() {
		return Long.toString(value);
	}

	@Override
	public int compareTo(Word o) {
		return Long.compare(this.value, ((LongWord)o).value);
	}

	@Override
	public Word word(Memory memory) {
		return this;
	}
}
