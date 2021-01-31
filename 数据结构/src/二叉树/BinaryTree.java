package 二叉树;

import java.util.*;

class BTNode{
    public int val;
    public BTNode right;
    public BTNode left;

    public BTNode(int val) {
        this.val = val;
    }
}
public class BinaryTree {
    /**
     * 前期穷举创建二叉树
     * 后期遍历的方式
     * */
    public BTNode createTree(){
        BTNode A = new BTNode('A');
        BTNode B = new BTNode('B');
        BTNode C = new BTNode('C');
        BTNode D = new BTNode('D');
        BTNode E = new BTNode('E');
        BTNode F = new BTNode('F');
        BTNode G = new BTNode('G');
        BTNode H = new BTNode('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }
    // 前序遍历
    void preOrderTraversal(BTNode root){
        if (root == null){
            return;
        }
        System.out.print(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }
    // 中序遍历
    void inOrderTraversal(BTNode root){
        if(root ==null){
            return;
        }
        inOrderTraversal(root.left);

        System.out.print(root.val);

        inOrderTraversal(root.right);

    }
    // 后序遍历
    void postOrderTraversal(BTNode root){
        if(root ==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val);

    }
    // 遍历思路-求结点个数
    static int size = 0;
    void getSize1(BTNode root){
        if(root ==null){
            return;
        }
        size++;
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);

    }
    // 子问题思路-求结点个数
    int getSize2(BTNode root){
        if(root == null){
            return 0;
        }
        return getSize2(root.left) + getSize2(root.right)+1;
    }
    // 遍历思路-求叶子结点个数
    static int leafSize = 0;
    void getLeafSize1(BTNode root){
        if (root == null){
            return ;
        }
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
        if (root.right==null&&root.left==null){
            leafSize++;
        }

    }
    // 子问题思路-求叶子结点个数
    int getLeafSize2(BTNode root){
        if(root == null){
            return 0;
        }
        if (root.right==null&&root.left==null){
            return 1;
        }
        return getSize2(root.left) + getSize2(root.right);
    }
    // 子问题思路-求第 k 层结点个数
    int getKLevelSize(BTNode root ,int k){
        if (root == null){
            return 0;
        }
        if (k == 1){//终止条件
            return 1;
        }
        return getKLevelSize(root.right,k-1) + getKLevelSize(root.left,k-1);

    }
    // 获取二叉树的高度
    int getHeight(BTNode root){
        if (root == null){
            return 0;
        }
        int rightHeight = getHeight(root.right);
        int liftHeight = getHeight(root.left);
//        return  getHeight(root.left)>getHeight(root.right)?
//                getHeight(root.left)+1:getHeight(root.right)+1;
        return rightHeight>liftHeight?rightHeight:liftHeight;
    }
    // 查找 val 所在结点，没有找到返回 null
// 按照 根 -> 左子树 -> 右子树的顺序进行查找
// 一旦找到，立即返回，不需要继续在其他位置查找
    BTNode find(BTNode root, int val){
        if(root == null){
            return null;
        }
        if (root.val == val){
            return root;
        }
        BTNode ret = find(root.left,val);
        if (ret!=null){
            return ret;
        }

         ret = find(root.right,val);
        if (ret!=null){
            return ret;
        }
        return null;
    }
    //给定两个二叉树，编写一个函数来检验它们是否相同。O(min(m,n))
    //如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
    public boolean isSameTree(BTNode p, BTNode q) {
        if(p==null&&q!=null ||p!=null&&q==null ){
            return false;
        }
        if(p == null&&q == null){
            return true;
        }
        if(p.val!=q.val){
            return false;
        }

        return isSameTree(q.left,p.left)&&isSameTree(q.right,p.right);
    }
    //给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
    // s 的一个子树包括 s 的一个节点和这个节点的所有子孙。
    // s 也可以看做它自身的一棵子树。O（m*n）
    public boolean isSubtree(BTNode s, BTNode t) {
        if(s==null ||t==null) return false;
        if(isSameTree(s,t)) return true;

        if(isSubtree(s.left,t))  return true;
        if(isSubtree(s.right,t)) return true;

        return false;

    }

    /**
     *给定一个二叉树，检查它是否是镜像对称的。  O(n)
     * */
    public boolean isSymmetricChild(BTNode leftTree, BTNode rightTree){
        if((leftTree == null &&rightTree!=null)||(leftTree!=null&&rightTree==null)){
            return false;
        }
        if(leftTree==null&&rightTree==null){
            return true;
        }
        if(leftTree.val!=rightTree.val){
            return false;
        }

        return isSymmetricChild(leftTree.left,rightTree.right) && isSymmetricChild(rightTree.left,leftTree.right);


    }
    public boolean isSymmetric(BTNode root) {
        if(root == null){
            return true;
        }
        return isSymmetricChild(root.left,root.right);
    }

    /**
     * O(n*n)
     * 给定一个二叉树，判断它是否是高度平衡的二叉树。
     *本题中，一棵高度平衡二叉树定义为：
     * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。*/
    public boolean isBalanced(BTNode root) {
        if(root == null) return true;
        int rightHeight = getHeight(root.right);
        int liftHeight = getHeight(root.left);
        return Math.abs(liftHeight-rightHeight)<=1&&isBalanced(root.left)&&isBalanced(root.right);

    }
    /**
     * 平衡的二叉树  优化从下往上
     * */

//    public int high(BTNode root){
//        if (root ==null){
//            return 0;
//        }
//        int rightHeight = getHeight(root.right);
//        int liftHeight = getHeight(root.left);
//        if (Math.abs(rightHeight - liftHeight)<=1){
//            return Math.max(rightHeight,liftHeight)+1;
//        }else {
//            return  -1;
//        }
//
//    }
//    public boolean isBalanced2(BTNode root) {
//        if (high(root)>=0){
//            return true ;
//        }
//        return false;
//
//
//    }
    public int high(BTNode root){
        if (root ==null){
            return 0;
        }
        int rightHeight = getHeight(root.right);
        int liftHeight = getHeight(root.left);
        if (liftHeight ==-1 || rightHeight == -1 || Math.abs(rightHeight - liftHeight)>1){
            return  -1;
        }else {
            return Math.max(rightHeight,liftHeight) + 1;
        }

    }
    public boolean isBalanced2(BTNode root) {
        if (high(root)>=0){
            return true ;
        }
        return false;
    }

    //层序遍历
    void levelOrderTraversal(BTNode root){
        if (root == null){
            return;
        }
        Queue<BTNode> queue = new LinkedList<>();
        queue.offer(root);

        while (queue!=null){
            BTNode cur = queue.poll();
            System.out.println(cur.val);
            if (cur.left!=null){
                queue.offer(cur.left);
            }
            if (cur.right!=null){
                queue.offer(cur.right);
            }
        }
    }
    //层序遍历非递归
    public List<List<Integer>> levelOrder(BTNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if(root == null) return ret;
        Queue<BTNode> queue = new LinkedList<>();
        queue.offer(root) ;
        while(!queue.isEmpty()){
            List<Integer>list = new ArrayList<>();
            int size = queue.size();
            while(size>0){
                BTNode cur = queue.poll();
                list.add(cur.val);
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
                size--;
            }
            ret.add(list);
        }
        return ret;
    }
    //判断是否是完全二叉树
    int msie = 0;
    int maxCode = 0;
    public boolean isCompleteTree(BTNode root) {
        if(root == null){
            return true;
        }
        recursive(root,1);//从根节点开始
        return msie == maxCode;//总数和理想数进行比较
    }

    public void recursive(BTNode root,int index){
        if(root == null){
            return;
        }
        msie++;
        maxCode = Math.max(maxCode,index);
        recursive(root.left,index * 2);//对于每个节点 v，我们将其左节点编号为 2 * v

        recursive(root.right,index * 2 + 1);// 将其右节点编号为 2 * v + 1
    }


}
