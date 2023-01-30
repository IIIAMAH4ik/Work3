public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int sum = 3967;
        int cash = 100;
        int bonus = 0;
        if (sum > 1000) {
            bonus = sum / 100;
        }
        System.out.println("Кол-во бонусов " + bonus);
        System.out.println("Сумма с учетом бонусов " + (cash + sum + bonus));
    }
}
