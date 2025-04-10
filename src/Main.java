import java.util.*;

public class Main {

    static class Node {
        char key;
        Node left, right;

        Node(char key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    static class BST {
        Node root;

        public void insert(char key) {
            root = insertRecursive(root, key);
        }

        private Node insertRecursive(Node current, char key) {
            if (current == null) return new Node(key);
            if (key < current.key) current.left = insertRecursive(current.left, key);
            else if (key > current.key) current.right = insertRecursive(current.right, key);
            return current;
        }

        public boolean search(char key) {
            return searchRecursive(root, key);
        }

        private boolean searchRecursive(Node current, char key) {
            if (current == null) return false;
            if (key == current.key) return true;
            return key < current.key
                    ? searchRecursive(current.left, key)
                    : searchRecursive(current.right, key);
        }

        public void printInOrder() {
            List<Character> result = new ArrayList<>();
            inOrder(root, result);
            System.out.println(String.join(" ", toStringList(result)));
        }

        public void printPreOrder() {
            List<Character> result = new ArrayList<>();
            preOrder(root, result);
            System.out.println(String.join(" ", toStringList(result)));
        }

        public void printPostOrder() {
            List<Character> result = new ArrayList<>();
            postOrder(root, result);
            System.out.println(String.join(" ", toStringList(result)));
        }

        private void inOrder(Node node, List<Character> result) {
            if (node != null) {
                inOrder(node.left, result);
                result.add(node.key);
                inOrder(node.right, result);
            }
        }

        private void preOrder(Node node, List<Character> result) {
            if (node != null) {
                result.add(node.key);
                preOrder(node.left, result);
                preOrder(node.right, result);
            }
        }

        private void postOrder(Node node, List<Character> result) {
            if (node != null) {
                postOrder(node.left, result);
                postOrder(node.right, result);
                result.add(node.key);
            }
        }

        private List<String> toStringList(List<Character> list) {
            List<String> strList = new ArrayList<>();
            for (char c : list) strList.add(String.valueOf(c));
            return strList;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split(" ");
            String command = parts[0];

            switch (command) {
                case "I":
                    char toInsert = parts[1].charAt(0);
                    tree.insert(toInsert);
                    break;

                case "P":
                    char toSearch = parts[1].charAt(0);
                    if (tree.search(toSearch)) {
                        System.out.println(toSearch + " existe");
                    } else {
                        System.out.println(toSearch + " nao existe");
                    }
                    break;

                case "INFIXA":
                    tree.printInOrder();
                    break;

                case "PREFIXA":
                    tree.printPreOrder();
                    break;

                case "POSFIXA":
                    tree.printPostOrder();
                    break;

                default:
                    // Ignora comandos inválidos
            }
        }

        sc.close();
    }
}