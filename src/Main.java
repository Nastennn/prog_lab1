import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        // Создать одномерный массив z типа int. Заполнить его числами от 5 до 19 включительно в порядке убывания.
        int N = 19 - 5 + 1;
        int num = 19;
        int[] z = new int[N];
        for (int i = 0; i < N; i++) {
            z[i] = num;
            num--;
            System.out.println("z[i]= " + z[i]);
        }
        // Создать одномерный массив x типа double. Заполнить его 12-ю случайными числами в диапазоне от -11.0 до 9.0.
        double[] x = new double[12];
        for (int i = 0; i < 12; i++) {
            x[i] = Math.random() * (-2) - 9;
            System.out.println("x[i]= " + x[i]);
        }
        double[][] r = new double[15][12];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 12; j++) {
                switch (z[i]) {
                    case (14):
                        r[i][j] = Math.atan(
                                Math.pow(
                                        Math.E,
                                        (Math.pow(
                                                -Math.sqrt(Math.abs(x[j])),
                                                (1.0 / 3)
                                        )))
                        );
                        break;
                    case (5):
                    case (6):
                    case (8):
                    case (9):
                    case (11):
                    case (13):
                    case (16):
                        r[i][j] = Math.atan(
                                Math.pow(
                                        Math.pow(
                                                Math.E,
                                                (-Math.abs(x[j]))),
                                        2));
                        break;
                    default:
                        r[i][j] = Math.pow(
                                Math.E,
                                Math.pow(
                                        (Math.log(Math.acos((x[j] - 1) * Math.E / 2 + 1)) / 2),
                                        2));
                        break;
                }
                System.out.printf("%.5f", r[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

}
