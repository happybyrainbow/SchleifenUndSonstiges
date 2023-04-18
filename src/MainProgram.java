import java.sql.SQLOutput;

public class MainProgram {

    public static void main(String[] args) {

        System.out.println(sumUp(1,7));

    }

    public static void methode() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wert von i: "+i);
            if (i == 3) {
                System.out.println("Holdriho !");
            }
        }
    }

    public static void printSomeNumbers(){
        for(int i = 6; i <= 23; i++) {
            System.out.println(i);
        }
    }

    public static void printNumbers(int start, int end){
        for(int i = start; i <= end; i++){
            System.out.println(i);
        }
    }

    public static int sumUp(int start, int end) {
        int a = 0;
        for (int i = start; i <= end; i++) {
            a += i;
        }
        return a;
    }
}

