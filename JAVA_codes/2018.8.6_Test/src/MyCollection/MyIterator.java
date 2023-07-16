package MyCollection;

public interface MyIterator {
	int cursor = 0;
	
	public boolean hasNext();
	
	public Object next();
	
	public void remove();

}
