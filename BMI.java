import java.util.*;
public class Assignment_QN1
{

    public static void main(String[] args)throws Exception {
          calculateBMI();
    }
        private static void calculateBMI() throws Exception {
        System.out.print("Please enter your weight in kg: ");
        Scanner s = new Scanner(System.in);
        float weight = s.nextFloat();
        if(weight<0)
            
            {
                System.out.println("Error: Negative weight");
                return;
            }
        System.out.print("Please enter your height in m: ");
        
        float height = s.nextFloat();
        if(height<0)
        {
            System.out.println("Error: Negative height");
            return;
        }
         
        // multiplication by 100*100 for cm to m conversion
        float bmi = (weight)/(height*height);
         
        System.out.println("Your BMI is: "+bmi);
        printBMICategory(bmi);
         
    }
     
    // Prints BMI category
    private static void printBMICategory(float bmi) {
        if(bmi <= 24) {
            System.out.println("You are Underweight");
        }else if (bmi>24&&bmi <= 29) {
            System.out.println("You are Healthy");
        }else if (bmi>29&&bmi <= 34) {
            System.out.println("You are overweight");
        }else {
            System.out.println("You are obese");
        }
    }
}