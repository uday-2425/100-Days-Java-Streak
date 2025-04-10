import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

public class RightViewBinaryTree {

    public static TreeNode buildTreeFromLevelOrder(Scanner sc, int n) {
        if (n == 0) return null;

        System.out.println("Enter values in level order (-1 for null):");
        int val = sc.nextInt();
        TreeNode root = new TreeNode(val);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 1;

        while (!queue.isEmpty() && count < n) {
            TreeNode current = queue.poll();

            int leftVal = sc.nextInt();
            count++;
            if (leftVal != -1) {
                current.left = new TreeNode(leftVal);
                queue.add(current.left);
            }

            if (count >= n) break;

            int rightVal = sc.nextInt();
            count++;
            if (rightVal != -1) {
                current.right = new TreeNode(rightVal);
                queue.add(current.right);
            }
        }

        return root;
    }

    public static void rightView(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 1; i <= levelSize; i++) {
                TreeNode current = queue.poll();

                if (i == levelSize) {
                    System.out.print(current.data + " ");
                }

                if (current.left != null)
                    queue.add(current.left);

                if (current.right != null)
                    queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        TreeNode root = buildTreeFromLevelOrder(sc, n);

        System.out.print("Right View of the Tree: ");
        rightView(root);
    }
}
