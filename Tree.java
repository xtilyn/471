
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
	
	public void createChildren(Node parent) {
		
	}
	
}
