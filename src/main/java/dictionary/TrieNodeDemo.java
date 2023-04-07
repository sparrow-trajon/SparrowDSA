package dictionary;

public class TrieNodeDemo {
		
	public static void main(String[] args) {
		
		
		
		String word="CAT";
		TrieNodeUtil  nodeUtil= new TrieNodeUtil();
		TrieNode node= new TrieNode();
		nodeUtil.insert(word,node );
		
		nodeUtil.insert("CARE", node);
		nodeUtil.insert("ADD", node);
		nodeUtil.insert("DO", node);
		nodeUtil.insert("CAN", node);
		nodeUtil.insert("CASE", node);
		nodeUtil.insert("CODE", node);
	//	nodeUtil.insert("CAR", node);
		System.out.println(node.toString());
		
		System.out.println("check CAR >>>");
		
		System.out.println(nodeUtil.checkIfWordPresent("CAR", node));
		
	}

}
