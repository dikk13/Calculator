import java.util.Collections;
import java.util.List;

public class RomanConvert {

    public static int RomToArab(String romNum){

        return Calculator.roman.indexOf(romNum) + 1;
    }

    public static String ArabToRom(int arabNum) throws Exception {
        int[] arab = {100,90,50,40,10,9,8,7,6,5,4,3,2,1};
        if (arabNum < 0)  {
            throw new Exception("В римской системе нет отрицательных чисел");
        }
        if (arabNum == 0) {
            throw new Exception("null");
        }
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < arab.length; i ++) {
            int currentNum = arabNum / arab[i];
            if (currentNum==0) {
                continue;
            }
            for (int j = 0; j < currentNum; j++) {
                result.append(Calculator.roman.get(13 - i));
            }
            arabNum = arabNum % arab[i];
        }
        return result.toString();
    }
}
