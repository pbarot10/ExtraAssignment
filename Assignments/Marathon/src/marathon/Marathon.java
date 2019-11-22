package marathon;
public class Marathon {
    public static void main(String[] args) {
        
        String [] names={
            "Elena","Thomas " ,"Hamilton","Suzie",
            "Phil" ,"Matt" ,"Alex" ,"Emma" ,"John" ,
            "James" ,"Jane" ,"Emily" ,"Daniel" ,
            "Neda" ,"Aaron" ,"Kate"};
        int [] times = {
            341,273,278,329,445,
            402,388,275,243,334,412,
            393,299,343,317,265
        };
        
        int first = BestRunner(times);
        int second = secondFastestIndex(times);
        System.out.printf("The Best Runner is: %s (%d Minutes)%n", names[first], times[first]);
        System.out.printf("The Second Best Runner is: %s (%d Minutes)%n", names[second], times[second]);
    }
     public static int BestRunner(int[] times) 
    {

        int LowestIndex = 0;

        for (int i = 0; i < times.length; i++)
        {

            if (times[i] < times[LowestIndex]) 
            {
                LowestIndex = i;
            }
        }

        return LowestIndex;

    }
      public static int secondFastestIndex(int[] times)
    {
        int LowestIndx = BestRunner(times);
        int secondLowestIndx = 0;

        for (int i = 0; i < times.length; i++)
        {
            if (times[i] < times[secondLowestIndx] && i != LowestIndx) 
            {
                secondLowestIndx = i;
            }
        }

        return secondLowestIndx;
    }
    
}
