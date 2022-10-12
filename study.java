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

    String name = fullName(fName, lName);
    
    printData(name, 25, bmi(height,weight));
    
  }

  public static void printData(String name, int age, double bmi) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("bmiは" + bmi + "です");
  }

  public static String fullName(String firstName,String lastName){
    return firstName + " " + lastName;
  }
  
  public static double bmi(double height,double weight){
    return weight / height / height;
  }
}
