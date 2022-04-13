import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    static List<String> roman = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XL", "L", "XC", "C");

    public static void main(String[] args)  {

        String s = new Scanner(System.in).nextLine();
        String[] array = s.split(" ");
        try {
            if (array.length < 3) {
                throw new Exception("Строка не является математической операцией");
            }
            if (array.length > 3) {
                throw new Exception("Формат математической операции не удовлетворяет заданию");
            }
            if (Calculator.roman.contains(array[0]) &&
                    Calculator.roman.contains(array[2])){
                array[0] = String.valueOf(RomanConvert.RomToArab(array[0]));
                array[2] = String.valueOf(RomanConvert.RomToArab(array[2]));
                int result =  Operation.operation(array);
                System.out.println(RomanConvert.ArabToRom(result));
            }else {
                int x = Integer.parseInt(array[0]);
                int y = Integer.parseInt(array[2]);
                if (x > 0 && x < 11 && y > 0 && y < 11) {
                    System.out.println(Operation.operation(array));
                } else throw new Exception("Введенные числа не удовлетворяют заданию");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
