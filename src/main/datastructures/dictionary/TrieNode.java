package dictionary;

import java.util.Arrays;

public class TrieNode {

	private Character ch;
	TrieNode[] nodeList = new TrieNode[26];
	Boolean isTerminal=false;

	public TrieNode(Character ch) {

		this.ch = ch;

		for (int i = 0; i <= 25; i++) {

			nodeList[i]=null;
			
		}
	}

	public TrieNode() {

	}

	public Character getCh() {
		return ch;
	}

	public void setCh(Character ch) {
		this.ch = ch;
	}

	

	public TrieNode[] getNodeList() {
		return nodeList;
	}

	public void setNodeList(TrieNode[] nodeList) {
		this.nodeList = nodeList;
	}

	public Boolean getIsTerminal() {
		return isTerminal;
	}

	public void setIsTerminal(Boolean isTerminal) {
		this.isTerminal = isTerminal;
	}

	@Override
	public String toString() {
		return "TrieNode [ch=" + ch + ", nodeList=" + Arrays.toString(nodeList) + ", isTerminal=" + isTerminal + "]";
	}



}
