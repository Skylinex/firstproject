package ru.stqa.pft.sandbox;

public class HelloWorld {

  public static void main(String[] args) {
    hello("chlen");
    hello("cawqa");
    hello("sashqa");

    Square s = new Square(5);
    System.out.println("Пл кв со ст " + s.l + "=" + s.area());

    Rectangle r = new Rectangle(2,3);
    System.out.println("sosi triugol " + r.area());

  }

  public static void hello(String somebody) {
    String sosi = "world";
    System.out.println("ну что погнали " + somebody + sosi );
  }



}