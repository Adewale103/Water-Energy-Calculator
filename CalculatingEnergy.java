import java.util.Scanner;
public class CalculatingEnergy{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
     System.out.println("Enter the amount of water in kilograms: ");
     double waterAmount = input.nextDouble();

     System.out.println("Enter the initial temperature: ");
     double initialTemp = input.nextDouble();

     System.out.println("Enter the final temperature: ");
     double finalTemp = input.nextDouble();

     double energy = waterAmount * (finalTemp - initialTemp) * 4184;

     System.out.printf("The energy needed is : %.1f ",energy);
    }
}
