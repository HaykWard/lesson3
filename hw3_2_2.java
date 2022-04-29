package lesson3;

public class hw3_2_2 {

    public static double z=1;

    public static void main(String[] args){

        double X = SQRT(2,3);
        System.out.println(X);

    }

        public static double SQRT(double x, double y){

            for (int i=0; i<y; i++){
                z *=x;
            }
            return z;


        }
}
