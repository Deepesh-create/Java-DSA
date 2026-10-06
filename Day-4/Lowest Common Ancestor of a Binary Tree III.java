// Day-4 (Q-14)https://neetcode.io/problems/lowest-common-ancestor-of-a-binary-tree-iii/

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/
// Bruteforce
class Solution {
    public Node lowestCommonAncestor(Node p, Node q){
        Set<Node> set = new HashSet<>();

        while(p != null){
            set.add(p); p = p.parent;
        }

        while(q != null){
            if(set.contains(q)){
                return q;
            }
            q = q.parent;
        }
        return null;
    }
}

//optimize
class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        Node p1 = p;
        Node q1 = q;

        while(p1 != q1){
            p1 = (p1 == null) ? q: p1.parent;
            q1 = (q1 == null) ? p: q1.parent;

        }
        return p1;
    }
}
