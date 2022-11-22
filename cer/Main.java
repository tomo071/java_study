import java.util.Scanner;

class Main {  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Car car = new Car();

    String carName = scanner.next();
    String carColor = scanner.next();

    car.setName(carName);
    
    car.setColor(carColor);

    System.out.println("ガソリン量：" + car.getFuel() + "L");
    
    System.out.println("-----------------");
    System.out.print("給油する量を入力してください：");
    int litre = scanner.nextInt();
    
    car.charge(litre);
    car.mileage(litre, litre);
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