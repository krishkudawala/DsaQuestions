package Trees;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
    public static List<Integer> copy(List<Integer> arr){
        List<Integer> list=new ArrayList<>();
        for (int ele :arr){
            list.add(ele);
        }
        return list;
    }
    public static void helper (Node root ,int target ,List <Integer> arr,List<List<Integer>>ans){
        if (root==null) return;
        if (root.left==null && root.right==null){
            if(root.val==target){
                arr.add(root.val);
                ans.add(arr);
            }
            return;
        }
        arr.add(root.val);
        List<Integer> arr1=copy(arr);
        List<Integer> arr2=copy(arr);
        helper(root.left,target-root.val,arr1,ans);
        helper(root.right,target-root.val,arr2,ans);
    }
    public static void main(String[] args) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        int targetsum=22;

        Node a=new Node(5);
        Node b=new Node(4);
        Node c=new Node(8);
        Node d=new Node(11);
        Node e=new Node(13);
        Node f=new Node(4);
        Node g=new Node(7);
        Node h=new Node(2);
        Node i=new Node(5);
        Node j=new Node(1);

        a.left=b; a.right=c;
        b.left=d; c.left=e;
        c.right=f; d.left=g;
        d.right=h; f.left=i;
        f.right=j;
        helper(a,targetsum,arr,ans);
        System.out.println(ans);

    }
}
