public class Hanson1DoWhile {
    public static void main(String[] args) {
        String[] buah = {"Apel", "Pisang", "Mangga", "Jeruk"};
        int i = 0;
        do {
            System.out.println(buah[i]);
            i++;
        }while (i < buah.length);
    }
}
