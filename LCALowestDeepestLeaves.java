public class LCALowestDeepestLeaves {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Result {
        TreeNode node;
        int depth;

        Result(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    public static TreeNode lcaDeepestLeaves(TreeNode root) {
        return helper(root).node;
    }

    private static Result helper(TreeNode root) {
        if (root == null) {
            return new Result(null, 0);
        }

        Result left = helper(root.left);
        Result right = helper(root.right);

        if (left.depth > right.depth) {
            return new Result(left.node, left.depth + 1);
        } else if (right.depth > left.depth) {
            return new Result(right.node, right.depth + 1);
        } else {
            return new Result(root, left.depth + 1);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);

        TreeNode lca = lcaDeepestLeaves(root);
        System.out.println("Lowest Common Ancestor of Deepest Leaves: " + lca.val);
    }
}
