package cyclesort;

public class firstmissingpositive {
    public static void swap(int i ,int j ,int[]arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int []nums={3,4,-1,1};
        int n=nums.length;
        int i=0;
        while(i<n){
            int ele=nums[i];
            if(ele<=0 || ele==i+1 || ele>n || ele==nums[ele-1] ) i++;
            else swap(i,ele-1,nums);
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1) return ;
        }
        System.out.println(i+1);
    }
}
