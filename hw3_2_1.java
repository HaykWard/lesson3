package lesson3;

public class hw3_2_1 {

    public static int a = 1;
    public static int I=6;

    public static void main(String[] args){

        if (I>=0) {
            int f = factorial();
            System.out.println("Факсториал числа" + " " + I + " равен" + " " + f);
        }
        else {
            System.out.println("Введите неотрицательное число");
        }
    }

    public static int factorial(){
        for (int i=1; i<=I; i++){
            a*=i;
        }
        return a;
    }
}

