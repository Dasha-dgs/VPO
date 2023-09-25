import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        int flag = 1;
        Scanner sc = new Scanner(System.in);
        while (flag != 0) {
            System.out.println("Enter the currency rate");
            double currency = sc.nextDouble();
            System.out.println("Enter amout of money");
            int hryvna = sc.nextInt();
            int amount = convert(currency, hryvna);
            double change = getChange(currency, hryvna);
            print(amount, change);
            System.out.println("Do you want to continue (0 - exit)");
            flag = sc.nextInt();
            }
            }
            static int convert(double currency, int hryvna) {
                return ((int) (hryvna / currency));
                }
                static double getChange(double currency, int hryvna) {
                    return hryvna - convert(currency, hryvna) * currency;
                    }
                    static void print(int amount, double change) {
                        System.out.println("You can byu " + amount);
                        if (change != 0) {
                            System.out.printf("You rest of money is %.2f", change);
                            System.out.println();
                }
        }
}

