public class h_task_11 
{
    public static void main(String[] args) 
    {
        int[] nums = {5, 3, 2, 1, 4, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 9, 2, 3, 3};
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) 
        {
            for (int j = 1; j < nums.length; j++) 
            {
                if (max < nums[j]) 
                {
                    nums[j - 1] = max;
                    max = nums[j];                    
                }
            }
        }
        for (int i = 0; i < nums.length; i++) 
        {
            System.out.print(nums[i] + " "); 
        } 
    } 
}