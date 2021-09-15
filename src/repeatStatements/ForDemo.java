package repeatStatements;

public class ForDemo {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.print(i + ",");
        }
        int i = 1;
        System.out.println();
        for (; i < 11; i++) {
            System.out.print(i + ",");
        }

        int j = 1;
        System.out.println();
        for (; j < 11; ) {
            System.out.print(j + ",");
            j++;
        }
        /*
        CE
        for(){

        }*/
        /*for (; ; ) {
            System.out.println(1);
        }*/
        /*
        CE
        for(;false;) {
            System.out.println("false");
        }*/

       /* for (int z= 0;isEven() ; z++) {

        }*/
        int m = 1;
        for (m++; m < 10; m++) {
            System.out.print(m + ",");
        }
    }

    private static boolean isEven() {
        return true;
    }
}
