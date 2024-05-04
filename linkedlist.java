public class linkedlist {
    public static void main(String[] args) {
        bst newLinkedList = new bst();
        newLinkedList.addNewNode(60);
        newLinkedList.addNewNode(20);
        newLinkedList.addNewNode(30);
        newLinkedList.addNewNode(40);
        newLinkedList.inorder();
    }
}

class bst {
    private node root;

    bst() {
        root = null;
    }

    public void addNewNode(int data) {
        root = addNewNode(data, root);
    }

    public node addNewNode(int data, node root) {
        if (root == null) {
            root = new node(data);
            return root;
        }
        if (root.data < data) {
            root.right = addNewNode(data, root.right);
        } else if (root.data > data) {
            root.left = addNewNode(data, root.left);
        } else {
            System.out.println("Same data found");
        }
        return root;
    }

    public void inorder() {
        inorder(root);
        System.out.println();
    }

    public void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

}

class node {
    public int data;
    public node left;
    public node right;

    public node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// class LL {
// private node start;
// private node end;

// public LL() {
// start = null;
// end = null;
// }

// void addNewNode(int data) {
// node newNode = new node(data);

// if (start == null) {
// start = newNode;
// end = newNode;
// } else {
// end.next = newNode;
// end = newNode;
// }

// }

// void printAll() {
// node temp = start;
// while (temp != null) {
// System.out.println(temp.data);
// temp = temp.next;
// }
// }
// }

// class node {
// int data;
// node next;

// public node(int data) {
// this.data = data;
// this.next = null;
// }

// }