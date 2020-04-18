import java.util.Arrays;

public class FourthExercise {

    public static void main(String[] args) {

        /*----Ex 5.1----*/
        //поиск максимума
        int [] mas = {12,43,12,-65,778,123,32,76};
        System.out.println(Arrays.stream(mas).max().getAsInt());
        System.out.print("\n");


        /*----Ex 5.2----*/
        //создание матрицы
        int [][] array = new int[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                array[i][j] = (int)Math.round(Math.random()*10);
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

        //транспонирование
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        
        System.out.print("\n");

        //вывод транспонированной матрицы
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }


    }

}
