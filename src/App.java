import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double kmL = 12.0;
        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();
        sc.close();

        double calculo = (tempo * velocidade) / kmL;
        DecimalFormat decimal = new DecimalFormat("0.000");
        System.out.println(decimal.format(calculo));
    }
}
