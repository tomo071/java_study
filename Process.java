class Process {

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
