public class Main {
    public static void main(String[] args) {
        int price = 26789; // Цена билета
        int mile = 20; // Количество рублей для одной бонусной мили
        int bonus = price / mile; // Рассчёт количества бонусных миль
        System.out.println("Количество бонусных миль: " + bonus);
    }
}