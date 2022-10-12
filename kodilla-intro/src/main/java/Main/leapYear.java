public class leapYear {
    public static void main(String[] args) {
        int a = 2022;
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0 ) {
        System.out.println("Rok 2022 jest rokiem przystępnym.");
    } else System.out.println("Rok 2022 nie jest rokiem przystępnym.");
}}

