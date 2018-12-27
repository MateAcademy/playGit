public class Temp {
    public static void main(String[] args) {
        if (1 == 1 && 2 == 2) {
            System.out.println("!!!");
        }

        if (1!=1 || 2!=3) {
            System.out.println("!!!");


            System.out.println("изменения в ветке 2");
        }
    }


    public void commit() {
        System.out.println("branch 1");
    }


}
