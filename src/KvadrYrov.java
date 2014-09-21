/**
 * Created by Devil Trigger S on 21.09.2014.
 */
public class KvadrYrov{
    public static void main(String[] args) {
        // ax^2 + bx + c = 0

        double a=2;
        double b=4;
        double c=2;

        //Дискриминант
        double d=Math.sqrt(b*b-4*a*c);
        if (d>0) {
            double x1 = (d - b) / (2 * a);
            double x2 = (-d - b) / (2 * a);
            System.out.println("Ответ: x1="+x1+", x2="+x2);
                } else {
                    if (d == 0) {
                double x3 = -b / (2 * a);
                System.out.println("Ответ x="+x3);
                                 } else
                        System.out.println("Вещественных решений нет");
                        }
        }
        }


