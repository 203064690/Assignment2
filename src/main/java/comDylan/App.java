package comDylan;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // write your code here
        String s1 = JOptionPane.showInputDialog("Please enter 1st Number: ");
        String s2 = JOptionPane.showInputDialog("Please enter 2nd Number: ");
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        int sum = addition(num1, num2);

        JOptionPane.showMessageDialog(null,"The answer is :"+sum,"Results", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int addition(int number, int number2)
    {
        return number +number2;

    }

    public static int div(int number, int number2)
    {
        return number /number2;

    }

    public static String CompareString(String name1, String name2){
        return name1 +" "+ name2;
    }

}
