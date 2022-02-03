//@name [KUSH GILITWALA]
//@date and version [30.01.2022 1.0]
//CS245 Lab 1: Find the Missing Number
import java.util.Arrays;
class Lab01
{
    //method to find the missing number in unsorted array
    //@param int array of given numbers
    //@returns int missing number
    public int findMissingNum(int[] nums)
    {
        int i,f=0,sum=0,total=0;
        int n=nums.length; // array length
        for(i=0;i<n;i++)
        {
            if(nums[i]==0)
                f=1;
            sum=sum+nums[i];
        }
        if(f==0)
            return 0; // missing number 0
       
        total=(n*(n+1))/2;
        if((total-sum)>nums.length)
            return -1;
        else
            return total-sum;
    }
    
  
    public static void main(String[] args){
        int[] test1 = {2,5,7,6,1,3,0}; //returns 4  n=7
        int[] test2 = {0,1}; //returns   2   n=2
        int[] test3 = {5,3,4,2,1}; //returns 0 n=5
        int[] test4= {3,0,1}; //2 n=3
        int[] test5= {4,6,2,3,1,5}; //0  n=6
        int[] test6={4,6,2,3,1,5,0}; //   7    n=7
        int[] test7 = {1,0,5,3,4,2}; //n=6
        Lab01 obj = new Lab01();  // create object of class Lab01
        System.out.println(obj.findMissingNum(test1));
        System.out.println(obj.findMissingNum(test2));
        System.out.println(obj.findMissingNum(test3));
        System.out.println(obj.findMissingNum(test4));
        System.out.println(obj.findMissingNum(test5));
        System.out.println(obj.findMissingNum(test6));
        System.out.println(obj.findMissingNum(test7));
          
    }
    
}
