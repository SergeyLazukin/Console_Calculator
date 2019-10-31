import java.io.*;

public class Calculator {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String example;
        while (true) {
            try {
                example = reader.readLine();
                if (example.equals("exit"))
                    break;
                String[] str = example.split(" ");
                if(str.length < 3) {
                    throw new NumberFormatException();
                }
                double number1 = Double.parseDouble(str[0]);
                double number2 = Double.parseDouble(str[2]);
                String op = str[1];
                double result;
                switch (op) {
                    case "+":
                        result = number1 + number2;
                        System.out.println(result);
                        break;
                    case "-":
                        result = number1 - number2;
                        System.out.println(result);
                        break;
                    case "*":
                        result = number1 * number2;
                        System.out.println(result);
                        break;
                    case "/":
                        result = number1 / number2;
                        System.out.println(result);
                        break;
                    default:
                        System.out.println("Ввод не соответствует условиям.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Ввод не соответствует условиям.");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}