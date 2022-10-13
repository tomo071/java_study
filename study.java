import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("苗字：");
    String fName = scanner.next();
    System.out.print("名前：");
    String lName = scanner.next();
    System.out.print("身長：");
    double height = scanner.nextDouble();
    System.out.print("体重：");
    double weight = scanner.nextDouble();
    System.out.print("年齢：");
    int age = scanner.nextInt();

    String name = Process.fullName(fName, lName);
    
    Process.printData(name,age, Process.bmi(height, weight));
  }

}
