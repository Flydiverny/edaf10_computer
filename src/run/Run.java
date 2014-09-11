package run;

import memory.LongMemory;
import computer.Computer;
import computer.Program;

public class Run {
	public static void main(String[] args) {
		Program factorial = new Factorial();
		System.out.println(factorial);
		Computer computer = new Computer(new LongMemory(1024));
		computer.load(factorial);
		computer.run();
	}
}
