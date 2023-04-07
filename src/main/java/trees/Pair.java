package trees;

public class Pair<T,V> {
	
	T key;
	V value;
	
	public Pair(T t, V v) {
		
		this.key=t;
		this.value=v;
		
	}
	
	public Pair() {
		
	}
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
}
