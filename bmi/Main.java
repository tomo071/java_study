import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
      System.out.print("名前：");
      String firstName = scanner.next();
      System.out.print("名字：");
      String lastName = scanner.next();
      System.out.print("年齢：");
      int age = scanner.nextInt();
      System.out.print("身長(m)：");
      double height = scanner.nextDouble();
      System.out.print("体重(kg)：");
      double weight = scanner.nextDouble();

      
      Past past = new Past(firstName, lastName, age, height, weight);
      past.setname("名無し");
      past.Fullname();
      past.Bmi();
      System.out.println("年齢："+past.getAge());
    
  }
}