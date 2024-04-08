import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ведите числа ");
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int num = scan.nextInt();
            if (num >= 0)
                numbers.add(num);
                //while (num >=0);

            else
                break;
        }
        System.out.println(numbers);
         numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);

    }}