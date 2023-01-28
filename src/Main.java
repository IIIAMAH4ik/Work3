public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int sum = 3587;
        int cash = 100;
        System.out.println("Кол-во бонусов " + sum / 100);
        System.out.println("Сумма с учетом бонусов " + (cash + sum + sum / 100));
    }
}
