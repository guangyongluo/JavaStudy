package thinking.in.java.chapter10;

interface ReverseSelector{
	boolean first();
	Object current();
	void previous();
}

public class Sequence22 {
	private Object[] items;
	private int next = 0;
	public Sequence22(int size) { items = new Object[size]; }
	public void add(Object x) {
		if(next < items.length)
			items[next++] = x;
	}
	private class SequenceSelector implements Selector {
		private int i = 0;
		public boolean end() { return i == items.length; }
		public Object current() { return items[i]; }
		public void next() { if(i < items.length) i++; } 
	}
	private class SequenceReverseSelector implements ReverseSelector{
		private int i = items.length - 1;
		public boolean first() { return i < 0; }
		public Object current() { return items[i]; }
		public void previous() { if(i >= 0 ) i--; }
	}
	public Selector selector() {
		return new SequenceSelector();
	}
	public SequenceReverseSelector reverseSelector(){
		return new SequenceReverseSelector();
	}
	public static void main(String[] args) {
		Sequence22 sequence = new Sequence22(10);
		for(int i = 0; i < 10; i++)
			sequence.add(new Word(Integer.toString(i)));
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
		SequenceReverseSelector reverseSelector = sequence.reverseSelector();
		System.out.println();
		while(!reverseSelector.first()){
			System.out.print(reverseSelector.current() + " ");
			reverseSelector.previous();
		}
	}
}
