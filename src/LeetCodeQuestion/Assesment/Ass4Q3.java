package LeetCodeQuestion.Assesment;

public class Ass4Q3 {
    public static void main(String[] args) {
        int [] h={1,2,1};
        System.out.println(maxArea(h));

    }
    public static int maxArea(int[] height) {
        if(height.length==2)
        {
            if(height[0]>=height[1])
            {
                return height[1]*height[1];
            }
            else
                return height[0]*height[0];
        }
        int s=0;
        int end=0;

        for(int i=0;i<height.length;i++)
        {
            if(height[i]>height[i+1]){
                s=i;
                break;
            }
        }

        for(int j=height.length-1;j>0;j--)
        {

            if(height[j]>height[j-1]) {
                end = j;
                break;
            }
        }
        if(s==end)
            return height[s];

        if(height[s]>=height[end])
        {
            return height[end]*height[end];
        }
        else
            return height[s]*height[s];

    }
}
