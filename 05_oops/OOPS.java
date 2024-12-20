
public class OOPS {
  public static void main(String[] args) {
    Pen p1 = new Pen(); // created a pen Object p1
    p1.setColor("Blue");
    System.out.println(p1.getColor());
    p1.setTip(5);
    System.out.println(p1.getTip());
    p1.name = "rahul";
    System.out.println(p1.name);

    BankAccount myAcc = new BankAccount();
    myAcc.username = "rahulsingh";
    System.out.println(myAcc.username);

    myAcc.setPassword("xcbhscbehwcbhe");
    System.out.println(myAcc.getPassword());

  }
}

class BankAccount {
  public String username;
  private String password;

  public void setPassword(String pwd) {
    password = pwd;
  }

  public String getPassword() {
    return password;
  }
}

class Pen {
  private String color;
  private int tip;
  String name;

  void setColor(String color) {
    this.color = color;
  }

  String getColor() {
    return this.color;
  }

  void setTip(int tip) {
    this.tip = tip;
  }

  int getTip() {
    return this.tip;
  }
}

class Student {
  String name;
  int age;
  float percentage;

  void calPercentage(int phy, int chem, int math) {
    percentage = (phy + chem + math) / 3;
  }
}