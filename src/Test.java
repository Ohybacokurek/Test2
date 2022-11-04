import java.util.Scanner;

public class Test {
// Naskenoval bych string
// Vytvořil bych metodu, co bude generovat náhodné čísla
// Pro každý znak načteného stringu bych aplikoval posun
    public static int ran (int a, int x){
        char word[] = {'A','H','O','J'};

        return a + 13 * x % 27;
    }

    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);
        String num = stringScanner.next();
        System.out.println(ran(345,26));


    }


    /*public static void code (char array[]){
        for (int i = 0; i < array.length; i++) {

            int x = 26;

            if (array[i] >= 97 && array[i] <=122) {
                array[i] = (char) (array[i] + 1);
                if  (array[i] > 122) {
                    array[i] = (char) (array[i] - x);
                }

                System.out.println(array[i]);
            }
            if (array[i] <= 90 && array[i] >= 65) {
                array[i] = (char) (array[i] + 1);

                if (array[i] > 90) {
                    array[i] = (char) (array[i] - x);
                }
                System.out.println(array[i]);
            }


        }

    }

    public static void main(String[] args) {
        char array[] = {'A','g','R','z','Z'};
        Test.code(array);
        char u = 'h';
        System.out.println((char)(u+1));
    }*/
}

