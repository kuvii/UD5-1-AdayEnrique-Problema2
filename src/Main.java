import Utils.Stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int firstValue;
        int secondValue;
        Stack stack = new Stack();
        System.out.println("Introduzca un numero: ");
        firstValue = scanner.nextInt();
        stack.push(firstValue);
        System.out.println("Introduzca otro numero: ");
        secondValue = scanner.nextInt();
        stack.push(secondValue);

        System.out.println("Elija la operacion a seguir: ");
        System.out.println("""
                + 'Suma'.\s
                - 'Resta'.
                 * 'Multiplicacion'.\s
                / 'Division'.""");


        firstValue = stack.pop();
        System.out.println(firstValue);
        secondValue = stack.pop();
        System.out.println(secondValue);

        String opcion = "'";
        int operation = 0;

        opcion = scanner.next();
        switch (opcion){
            case "+":
                operation = firstValue + secondValue;
                System.out.println(operation);
                break;
            case "-":
                operation = firstValue - secondValue;
                System.out.println(operation);
                break;
            case "*":
                operation = firstValue * secondValue;
                System.out.println(operation);
                break;
            case "/":
                operation = firstValue / secondValue;
                System.out.println(operation);
                break;
            default:
                System.out.println("Operacion Incorrecta");
                break;
        }
    }
}
