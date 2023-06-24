import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner in  = new Scanner(System.in);
        while (in.hasNextLine()){
            String expression = in.nextLine();
            try {
                System.out.println(calc(expression));
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static String calc(String input) throws Exception {
        int x,y;
        String [] expressionSplit = input.split(" ");
        if(expressionSplit.length != 3){
            throw new Exception();
        }
        String operation = expressionSplit[1];
        x = Integer.parseInt(expressionSplit[0]);
        y = Integer.parseInt(expressionSplit[2]);

        if (x < 1 | x > 10 | y < 1 | y > 10){
            throw new Exception();
        }

        switch (operation){
            case "+":
                return String.valueOf(x + y);
            case "-":
                return String.valueOf(x - y);
            case "*":
                return String.valueOf(x * y);
            case "/":
                return String.valueOf(x / y);
            default:
                throw new Exception();
        }
    }
}
