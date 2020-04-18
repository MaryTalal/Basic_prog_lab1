public class ThirdExercise {

    public static void main(String[] args) {

        for(char j = 'a';j<='z';j++){
            System.out.println(j);
        }

        long begin = new java.util.Date().getTime();

        int i = 0;
        for (; i < 100000000; i++){}
        //System.out.println(i);
        long end = new java.util.Date().getTime();
        System.out.println(end-begin);


        long i2 = 0;
        for (; i2 < 100000000; i2++){}
        //System.out.println(i);
        long end2 = new java.util.Date().getTime();
        System.out.println(end2-begin);

    }
}
