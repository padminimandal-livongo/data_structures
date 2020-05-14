package cs.fundamental.node;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }
    public boolean addNode(int element) {

        if(element <= data) {
            if(leftChild == null) {
                leftChild = new TreeNode(element);
                return true;
            } else{
                return leftChild.addNode(element);
            }
        } else{
            if(rightChild == null) {
                rightChild = new TreeNode(element);
                return true;
            } else {
                return rightChild.addNode(element);
            }
        }
    }

}
