
public class Tree {
	
	public Tree() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Class minLowerBound returns the child node with minimum lower bound
	 * @author Ga Hyung Kim
	 * @param children An array of children nodes with same parent
	 * @return Node[index] Element of an array of children nodes with minimum lower bound
	 */
	public Node minLowerBound(Node[] children) {
		int min = Integer.MAX_VALUE;
		int index = -1;
		for (int i=0; i < children.length; i++) {
			if (Node[i].lowerBound < min) {
				min = Node[i].lowerBound;
				index = i;
			}
		}
		return Node[index];
	}
	
	public int calcLowerBound(Constraint constraint) {
		
	}
	
	/**
	 * createChildren method creates an array of children nodes which come from a parent node
	 * @author Esther Chung
	 * @param parent the parent Node from which the children come
	 */
	public void createChildren(Node parent) {
		// create an array of nodes
		Node[] childrenArray;
		
		// variables needed
		int parentMachine = parent.getMachine(); // get the parent's machine #
		char[] availableTasks = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H']; // the available tasks
		char[] takenTasks = parent.getHistory();  // get the history of the tasks that have been taken so far
		
		// Take out the tasks that are already taken from the availableTasks array
		for (int i = 0; i < parentMachine; i++) {
			for (int j = 0; j < availableTasks.length; j++) {
				if (takenTasks[i] == availableTasks[j]) {
					availableTasks[j] = '';
					break; 
				}
			}
		}
		
		// initialize the children nodes; create nodes for only the available tasks
		for (int i = 0; i < availableTasks.length; i++) {
			if (availableTasks[i] != '') {
				childrenArray[i] = new Node(parent, parentMachine + 1, availableTasks[i]);
			}
		}
		
		// pass the children array to the parent node
		parent.setChildren(childrenArray);
	}
	
}
