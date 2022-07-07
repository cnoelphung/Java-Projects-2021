import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class conversionprogram {

    public static void main(String[] args) {



        String choose; 
        double meter ;      
        int choice;       

        String input1 = JOptionPane.showInputDialog(null, " Enter the distance in meters :");
        meter = Double.parseDouble(input1); 
        do {
            menu();
            choose = JOptionPane.showInputDialog(null, " Choose one of the following ");
            choice = Integer.parseInt(choose);
            switch (choice) {
                case 1:
                    showKilometer(meter);

                    break;
                case 2:
                    showInches(meter);
                    ;

                    break;

                case 3:
                    showFeet(meter);

                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Bye!");
                    break;

                default:

                    JOptionPane.showMessageDialog(null, " invalid option ");
            }
        } while (choice == 1 || choice == 2 || choice == 3 || choice != 4);

    }


    public static void showKilometer(double meter) {
        DecimalFormat formatter = new DecimalFormat("#00.00");
        double kilo1 = (meter * .001);
        JOptionPane.showMessageDialog(null, meter + " meter is " + formatter.format(kilo1) + " kilometer. ");

    }

    private static void showInches(double meter) {
        DecimalFormat formatter = new DecimalFormat("#00.00");
        double inches = (meter * 39.37);
        JOptionPane.showMessageDialog(null, meter + " meter is " + formatter.format(inches) + " inches. ");
    }

    private static void showFeet(double meter) {
        DecimalFormat formatter = new DecimalFormat("#00.00");
        double feet = (meter * 3.281);
        JOptionPane.showMessageDialog(null, meter + " meter is " + formatter.format(feet) + " feet. ");
    }

    private static void menu() {
        JOptionPane.showMessageDialog(null,
                " 1. Convert to kilometer :" + "\n\n"
                + " 2. Convert to inches :" + "\n\n"
                + " 3. Convert to feet :" + "\n\n"
                + " 4. Quit the program :" + "\n\n");
    }

}