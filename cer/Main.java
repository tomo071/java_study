import java.util.Scanner;

class Main {  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Car car = new Car();

    String carName = scanner.next();
    String carColor = scanner.next();

    car.setName(carName);
    
    car.setColor(carColor);
    
    Bicycle bicycle = new Bicycle();

    String bicycleName = scanner.next();
    String bicycleNameColor = scanner.next();

    bicycle.setName(bicycleName);
    
    bicycle.setColor(bicycleNameColor);
    
    System.out.println("【車の情報】");
    car.printData();

    System.out.println("=================");
    System.out.println("【自転車の情報】");
    bicycle.printData();
  }
}