import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.awt.*;

public class Temperature {

    public static void main(String[] args) {
        String answer = JOptionPane.showInputDialog(null, "Enter 1 or 2:\n1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit","Temperature Converter",JOptionPane.PLAIN_MESSAGE);
        if  (answer.equals("1")) {
            double far = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your temperature in Fahrenheit","Fahrenheit to Celsius",JOptionPane.PLAIN_MESSAGE));
            double cel = FartoCel(far);
            JOptionPane.showMessageDialog(null, "Temperature in Celsius is: " + cel);
        }
        else if (answer.equals("2")) {
            double cel = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your temperature in Celsius","Celsius to Fahrenheit",JOptionPane.PLAIN_MESSAGE));
            double Far  = CeltoFar(cel);
            JOptionPane.showMessageDialog(null, "Temperature in Fahrenheit is: " + Far);
        }
        else{
            JOptionPane.showMessageDialog(null, "You have entered incorrect output. Try again!");

        }

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your temperature in Celsius: ");
//        double Cel = sc.nextDouble();
//        double Far1  = CeltoFar(Cel);
//        System.out.println("Your temperature in Fahrenheit is "+ Far1);


    }

    public static double FartoCel(double Far){
        return (Far - 32) * 5 / 9;
    }

    public static double CeltoFar(double Cel){
        return (Cel * 9/5) + 32 ;

    }
}
