
public class Node {
	private Node parent;
	private int lowerBound;
	private Node[] children;
	private int machine;
	private char task;
	private char[] history; //all the machine task assignments for penalty sum 
	
	Node(Node parent, int machine, char task){
		this.parent = parent;
		this.machine = machine;
		this.task = task;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public int getPenaltySum() {
		return penaltySum;
	}

	public void setPenaltySum(int penaltySum) {
		this.penaltySum = penaltySum;
	}

	public Node[] getChildren() {
		return children;
	}

	public void setChildren(Node[] children) {
		this.children = children;
	}

	public int getMachine() {
		return machine;
	}

	public void setMachine(int machine) {
		this.machine = machine;
	}

	public char getTask() {
		return task;
	}

	public void setTask(char task) {
		this.task = task;
	}

	public char[] getHistory() {
		return history;
	}

	public void setHistory(char[] history) {
		this.history = history;
	}
	
	
}
