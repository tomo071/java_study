class Process {

  public String firstName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  Process(String firstName,String lastName,int age,double height,double weight){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public void Fullname(){
    System.out.println("こんにちは"+this.firstName+" "+this.lastName+"さん");
  }

  public void Bmi(){
    double bmi = this.weight/(this.height*2);
    double health = this.height*2*22;
    double terget = this.weight - health;
    System.out.println("あなたのBMIは"+bmi+"です");
    System.out.println("適正体重は"+health+"です");
    if (terget>0){
      System.out.println("適正体重より高いです");
    }else{
      System.out.println("適正体重より高いです");
    }
    System.out.println("適正体重より"+terget);
  }

}
