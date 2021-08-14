package HWs.HW2;

import java.util.ArrayList;
import java.util.List;

public class HW2 {
    public static void main(String[] args) {
       String[][] normal = {
               {"1", "2", "3", "4"},
               {"1", "2", "3", "4"},
               {"1", "2", "3", "4"},
               {"1", "2", "3", "4"}
       };
       String[][] wrong = {
               {"1", "2", "3", "4"},
               {"1", "2", "3", "4"},
               {"1", "2", "3", "4"},
               {"1", "2", "3"}
       };
       String[][] wrong2 = {
               {"1", "2", "3", "4"},
               {"1", "2", "3", "4"},
               {"1", "2", "3", "4"},
               {"1", "2", "3", "A"}
       };

        List<String[][]> inputs = new ArrayList<>(List.of(normal, wrong, wrong2));

       for (String[][] input : inputs) {
           try {
               System.out.printf("Сумма равна %s\n", sumArrayElements(input));
           } catch (MyArraySizeException e) {
               System.out.println("Массив должен иметь вид 4х4");
           } catch (MyArrayDataException e) {
               System.out.printf("Не вижу элемент массива, ищите ошибку в %d x %d", e.i, e.j);
           }
       }
    }

    public static int sumArrayElements(final String[][] inputArr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (inputArr.length !=4) {
            throw new MyArraySizeException ("Массив должен иметь вид 4х4");
        }
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr.length; j++) {
                try {
                    sum += Integer.parseInt(inputArr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, "не вижу элемент массива");
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new MyArraySizeException("Массив должен иметь вид 4х4");
                }
            }
        }
        return sum;
    }
}

