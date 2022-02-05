import java.util.*;
public class Assignment_QN2{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); //scanner 
		while(true) //keep looping 
		{
		    int sum=0,i=0,c=1;
		    double avg=0;
		    int min=999,max=-999; //assigning min and max 
		    for(i=0;;i++){ //always loop 
		        System.out.print("\nPlease enter rainfall value: ");
		        int rainfall=s.nextInt(); //read rainfall from user 
		        if(rainfall==0) //if user enter rainfall level is 0 then terminate 
		        {
		            break; //terminate 
		        }
		        if(min>rainfall)
		        {
		            min=rainfall; //update min rainfall 
		        }
		        if(max<rainfall)
		        {
		            max=rainfall; //update max rainfall 
		        }
		        sum+=rainfall;
		        avg=sum/c++;
		        System.out.println("Min rainfall :  "+min);
		        System.out.println("Max rainfall : "+max);
		        System.out.println("Average rainfall : "+avg);
		    }
	
		    
		    System.out.print("(Enter negative value to terminate the program) : ");
		    int choice=s.nextInt(); //read user choice 
		    if(choice<0) //negative value is entered 
		    {
		        //display details 
		        
		        break;
		    }
		  }
        }
}