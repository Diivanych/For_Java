import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
public class h_task_11 
{
    public static void main(String[] args) throws IOException
    {
        System.out.print("\033[H\033[2J");
        FileWriter fileWriter = new FileWriter("sortLog.txt");
        int[] nums = {0, 9, 5, 3, 2, 1, 4, 3, 3, 0, 0, 9, 2, 3, 3};
        String stringArr = Arrays.toString(nums);
        fileWriter.write(stringArr + "\n");
        int max;
        int l = 1;
        for (int i = 0; i < nums.length; i++) 
        {
            for (int j = 0; j < nums.length - 1; j++) 
            {
                if (nums[j] > nums[j + 1]) 
                {
                    max = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = max;
                    stringArr = Arrays.toString(nums);
                    fileWriter.append(stringArr + "\n");
                }
            }
        }
        fileWriter.close();
        System.out.println(stringArr);
    } 
}