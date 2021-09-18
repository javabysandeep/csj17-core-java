package arrayDemos;

public class LinearSearch {
    public static void main(String[] args) {
        int[] givenArray = {67, 88, 97, 12, 567};
        int key = 197;
        boolean flag = false;
        for (int element : givenArray) {
            if (key == element) {
                flag = true;
                break;
            }
        }
        System.out.println((flag)?"present":"not present");
    }
}
