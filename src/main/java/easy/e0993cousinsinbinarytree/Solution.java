package easy.e0993cousinsinbinarytree;

import common.TreeNode;

public class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {

        int parentX=-1;
        int depthX=0;
        int parentY=-1;
        int depthY=0;


        parent=root.val;
        found=false;
        depthX=getParent(root,x,0);
        parentX=parent;


        if(!found){
            return false;
        }

        parent=root.val;
        found=false;
        depthY=getParent(root,y,0);
        parentY=parent;

        if(!found){
            return false;
        }

        if(depthX==depthY&&parentX!=parentY){
            return true;
        }


        return false;
    }

    int parent;
    boolean found;

    private int getParent(TreeNode node, int x,int depth){
        if(node==null){
            found=false;
            return -1;
        }
        if((node.left!=null&&node.left.val==x)||(node.right!=null&&node.right.val==x)){
            parent=node.val;
            found=true;
            return depth+1;
        }


        int d=-1;
        if(node.left!=null){
            d=getParent(node.left,x,depth+1);
            if(found){
                return d;
            }
        }


        d=-1;
        if(node.right!=null){
            d=getParent(node.right,x,depth+1);
            if(found){
                return d;
            }
        }

        return -1;



    }





}
