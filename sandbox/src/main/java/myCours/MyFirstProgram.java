package myCours;
public class MyFirstProgram {

    public static void main(String[] args) {

        hello(" world");
        hello(" User");
        hello(" Andrey");

        double len = 5;
        System.out.println("Площадь квадрата со сторонами " + len + "="+ area(len));

        double a = 4;
        double b = 6;

        System.out.println("Площадь прямоугольника со сторонами " + a +" и " + b + "=" + area(a, b));
    }
    public static void hello(String sombody){ //Создание функции

        System.out.println("Hello" + sombody + "!");
    }

    public static double area(double l){ //Функция вычисления площади квадрата
       return l * l;
    }

    public static double area(double a, double b){//Функция вычисления площади прямоугольника
        return a*b;
    }
}