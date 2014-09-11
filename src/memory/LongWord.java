package memory;

import computer.Word;

public class LongWord implements Word {
	private long value;
	
	public LongWord(long value) {
		this.value = value;
	}
	
	@Override
	public void add(Word word) {
		this.value += ((LongWord)word).value;
	}

	@Override
	public void mul(Word word) {
		this.value *= ((LongWord)word).value;
	}
	
	public String toString() {
		return Long.toString(value);
	}

	@Override
	public int compareTo(Word o) {
		return Long.compare(this.value, ((LongWord)o).value);
	}
}
