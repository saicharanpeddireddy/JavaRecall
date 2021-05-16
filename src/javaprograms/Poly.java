package javaprograms;
public class Poly{
  public static void main(String[] args) {
    Meth obj=new Meth();
    obj.add();//23
    obj.add(2,3);//5
    obj.add(1.2,2.1);//3;

  }
}
// same method with diffence parametere * method overload*
class Meth{
  int a=1;
  int b=2;
  void add() {
    System.out.println(a+b);
  }
  void add(int a1,int b1){
    a=a1;
    b=b1;
    System.out.println(a+b);
  }
  void add(double a2,double b2){
    a=(int)a2;
    b=(int)b2;
    System.out.println(a+b);
  }
}
