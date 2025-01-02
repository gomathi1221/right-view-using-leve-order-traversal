class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=1;i<=n;i++){
                TreeNode s=q.poll();
                if(i==n){
                    list.add(s.val);
                }
                    if(s.left!=null){
                        q.add(s.left);
                    }
                    if(s.right!=null){
                        q.add(s.right);
                    }   
                                
            }
        }
        return list;

    }
}