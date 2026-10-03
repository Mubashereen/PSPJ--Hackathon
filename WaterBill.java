import java.util.Scanner;
class WaterBill{
    public static void main(String[]args){
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter water consumption in litres: ");
        double waterConsumption = sc.nextDouble();
        int bill;

        System.out.println("Water Consumption: " + waterConsumption + " litres");
        if (waterConsumption <= 500) {
            System.out.println("Water Bill: Rs.100");
        } else {
            System.out.println("Water Bill: Rs.200");
        }
  
    }
}