package myCours;
public class MyFirstProgram {

    public static void main(String[] args) {

        hello(" world");
        hello(" User");
        hello(" Andrey");

        Square s = new Square(5);

        System.out.println("Площадь квадрата со сторонами " + s.l + "="+ area(s));

        Rectsngle r = new Rectsngle(4, 6);


        System.out.println("Площадь прямоугольника со сторонами " + r.a +" и " + r.b + "=" + area(r));
    }
    public static void hello(String sombody){ //Создание функции

        System.out.println("Hello" + sombody + "!");
    }

    public static double area(Square s){ //Функция вычисления площади квадрата
       return s.l * s.l;
    }

    public static double area(Rectsngle r){//Функция вычисления площади прямоугольника

        return r.a * r.b;
    }
}