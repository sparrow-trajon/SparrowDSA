package dictionary;

import java.util.ArrayList;
import java.util.List;

import trees.Pair;

public class TrieNodeUtil {
	
	
	public void insert(String word, TrieNode node) {
			
		
		insertWord(word,node,0);
		
	}

	private void insertWord(String word, TrieNode node, int i) {
		
		if(i==word.length()) {
			node.isTerminal=true;
			return;
		}
		
		Pair<Boolean, Integer> pair= checkIfCharachterIsPresent(node, word.charAt(i));
		if(pair.getKey()) {
			
			insertWord(word, node.getNodeList()[word.charAt(i)-'A'],i+1);
		}
		else {
			addNewNode(node,word.charAt(i));
			insertWord(word, node.getNodeList()[word.charAt(i)-'A'], i+1);
		}
		
	}

	private void addNewNode(TrieNode node, char ch) {
		
		TrieNode n= new TrieNode(ch);
		if(node.getNodeList()==null) {
			List<TrieNode> nnodeList= new ArrayList<TrieNode>();
			TrieNode[] nlist= new TrieNode[26];
			nlist[ch-'A']=n;
		
		}
		else {
			
			TrieNode[] nn= node.getNodeList();
			nn[ch-'A']=n;
			
		}
	}

	private Pair<Boolean, Integer> checkIfCharachterIsPresent(TrieNode node, char c) {
		
		TrieNode[] nodes= node.getNodeList();
		
		if(nodes[c-'A']!=null){
			return new Pair<Boolean, Integer>(true, c-'A');
		}
		return new Pair<Boolean, Integer>(false, -1);
	}
	
	public boolean checkIfWordPresent(String word,TrieNode node) {
		
		return check(word,node,0);
	}

	private boolean check(String word, TrieNode node, int i) {
			
		if(i==word.length() ) {
			return node.getIsTerminal();
		}
		
		if(node.getNodeList()[word.charAt(i)-'A']!=null) {
			return check(word, node.getNodeList()[word.charAt(i)-'A'], i+1);
		}
		else {
			return false;
		}
		
		
	}
}
