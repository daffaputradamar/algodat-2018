package Kuis2;

public class BinaryTree {

    NodeBST root;

    public BinaryTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(int data) {
        if (isEmpty()) {
            root = new NodeBST(data);
        } else {
            NodeBST current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new NodeBST(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new NodeBST(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public void addRecursive(int data, NodeBST current) {
        if (isEmpty()) {
            root = new NodeBST(data);
        } else {
            if (data < current.data) {
                if (current.left != null) {
                    addRecursive(data, current.left);
                } else {
                    current.left = new NodeBST(data);
                }
            } else if (data > current.data ) {
                if (current.right != null) {
                    addRecursive(data, current.right);
                } else {
                    current.right = new NodeBST(data);
                }
            }
        }
    }

    public void findSmallest(NodeBST current) {
        if (current.left != null) {
            findSmallest(current.left);
        } else {
            System.out.println("Data terkecil: " + current.data);
        }
    }

    public void findLargest(NodeBST current) {
        if (current.right != null) {
            findLargest(current.right);
        } else {
            System.out.println("Data terbesar: " + current.data);
        }
    }

    public boolean find(int data) {
        boolean hasil = false;
        NodeBST current = root;
        while (current != null) {
            if (current.data == data) {
                hasil = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }

    public void traversePreOrder(NodeBST node) {
        if (node != null) {
            System.out.print(node.data + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(NodeBST node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public void traverseInOrder(NodeBST node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }
    
    public void printLeaf(NodeBST node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
            printLeaf(node.left);
            printLeaf(node.right);
        }
    }
    
    public int jumlahLeaf(NodeBST node) {
        if (node == null) {
            return 0;
        } else if (node.left == null && node.right == null) {
            return  1;
        } else {
            return jumlahLeaf(node.left) + jumlahLeaf(node.right);
        }
    }

    public NodeBST getSuccessor(NodeBST del) {
        NodeBST successor = del.right;
        NodeBST successorParent = del;
        while (successor.left != null) {
            successorParent = successor;

            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree kosong!");
            return;
        }
        NodeBST parent = root;
        NodeBST current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                NodeBST successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
    
    DoubleLinkedList dll = new DoubleLinkedList();
    
    public void isiDLL(NodeBST node) {
        if (node != null) {
            traversePreOrder(node.left);
            dll.addLast(node.data);
            traversePreOrder(node.right);
        }
    }
    
}
