import java.util.*;
public class Assignment_QN3 {
 public static void main(String args[]){
   Scanner sc= new Scanner(System.in);
   System.out.print("Enter the resting Heart Rate :");
   double HR_rest= sc.nextDouble();
   System.out.print("Enter age : ");
   int age= sc.nextInt(); //read age
   while(true){ 
       if(age<=0){ //check negative age
           System.out.println("Invalid age!!!");
           System.out.print("Enter age : ");
           age= sc.nextInt();
       }
       else
           break;//valid age
      
   }
   System.out.print("Enter gender (M/F) :" );
   char gender= sc.next().charAt(0);
   while(true)
   {
       if(gender=='m' || gender=='M' ||gender=='F' || gender=='f')
           break; //valid gender terminate the loop
       else
       {
           //ask again for valid gender
           System.out.println("Invalid gender!!!");
           System.out.print("Enter gender (M/F) :" );
           gender= sc.next().charAt(0);
       }
   }
   int HRmax= 220-age; //calculate HRmax
   double VO2= 15 *(HRmax/HR_rest); //calculate VO2
  
   System.out.print("\nThe type of sport : ");
   if(gender == 'm' || gender == 'M') //for male type of sport will be given
   {  
       if (age>= 18 && age <= 30 && VO2 >= 40 && VO2 <= 60 ){
           System.out.println("BasketBall");
       }
       else if (age>= 18 && age <= 26 && VO2 >= 62 && VO2 <= 74){
           System.out.println("Bicycling");
       }
        
       else if (age>= 18 && age <= 26 && VO2 >= 55 && VO2 <= 67) {
           System.out.println("Canoeing");
       }
        
       else if (age>= 18 && age <= 22 && VO2 >= 52 && VO2 <= 58){
           System.out.println("Gymanstic");
       }
        
       else if (age>= 10 && age <= 25 && VO2 >= 50 && VO2 <= 70){
           System.out.println("Swimming");
       }  
       else{
           System.out.println("Not elligible for sport");
       }
   }
    
   else if(gender == 'f' || gender == 'F') //for female type of sport will be given
   {
       if (age>= 18 && age <=30 && VO2 >= 43 && VO2 <= 60){
           System.out.println("BasketBall");
       }
        
       else if (age>= 18 && age <= 26 && VO2 >= 47 && VO2 <= 57){
           System.out.println("Bicycling");
       }
        
       else if (age>= 18 && age <= 26 && VO2 >= 47 && VO2 <= 67 ){
           System.out.println("Canoeing");
       }
        
       else if (age>= 18 && age <= 22 && VO2 >= 36 && VO2 <= 50){
           System.out.println("Gymanstic");
       }
        
       else if (age>= 10 && age <= 25 && VO2 >= 40 && VO2 <= 60){
           System.out.println("Swimming");
       }
       else{
           System.out.println("Not elligible for sport");
       }
   }  
}
}
