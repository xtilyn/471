
public class Tree {
	
	public Tree() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
+	 * Class minLowerBound returns the child node with minimum lower bound
+	 * @author Ga Hyung Kim
+	 * @param children An array of children nodes with same parent
+	 * @return Node[index] Element of an array of children nodes with minimum lower bound
+	 */
 	public Node minLowerBound(Node[] children) {
-		
-		return 
+		int min = Integer.MAX_VALUE;
+		int index = -1;
+		for (int i=0; i < children.length; i++) {
+			if (Node[i].lowerBound < min) {
+				min = Node[i].lowerBound;
+				index = i;
+			}
+		}
+		return Node[index];
 	}
	
	public int calcLowerBound(Constraint constraint) {
		
		Node calcNode = Node; //the node that we are calculating lower bound for 
		penalty = constraint.getPenalty(); 
		char tasksTaken = [calcNode.getTask()];
		char history = calcNode.getHistory() //assuming calcNode machine/task in calcNode history
		lowerbound = calcNode.getlowerBound();
		
		//get the sum of the parent nodes machine/task penalty
		Node tempNode = Node;
		for (i = calcNode.getMachine(); i>1; i--) {
			tempNode = tempNode.getParent();
			tempTask = tempNode.getTask();
			tasksTaken = tasksTaken + tempTask // task set in parent nodes no longer available
			lowerbound += penalty[tempNode.getMachine()][tempNode.getTask().convertInt()] //task is char so need to convert to int to get penalty (convert method in Node for task)
			history[i] = tempTask
		}
		
		// get the sum of the rest of machine/task penalty (lowest penalty possible for each machine)
		// note: need to figure out how to check for/implement the constraints (too near, forbidden, forced)
		int tempPenalty = infinity;
		for (i = calcNode.getMachine() + 1;i<=8; i++) {
			for (j = 0;j<=8;i++) {
				if (i,j).forced(){
					break;
				}
				else if j not in tasksTaken && (i,j).hardTooNear() && !(i,j).forbidden(){ //again tasksTaken has char while j is int  
					if tempPenalty >= penalty[i][j] + (i,j).softTooNear(){
						tempPenalty = penalty[i][j]
					}
				}
			lowerbound += penalty[i][j];
			tasksTaken += j.convertChar();
			history[i] = j.convertChar();
			}
		
		calcNode.setLowerBound(lowerbound);
		calcNode.setHistory(history);
		}
			
	}
	
	public void createChildren(Node parent) {
		
	}
	
}
