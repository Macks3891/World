import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
/*
    У клиента есть выбор из трёх категорий блюд: завтрак, обед и ужин.
Клиент указывает, голоден ли он сейчас или просто хочет что-то лёгкое.

    Если клиент голоден и выбрал:
Завтрак: предложить омлет с тостами.
Обед: предложить стейк с картофелем.
Ужин: предложить пасту с соусом.

    Если клиент не голоден и выбрал:
Завтрак: предложить йогурт с фруктами.
Обед: предложить салат с курицей.
Ужин: предложить суп-пюре.

    Дополнительно, программа должна предложить напиток:
Если клиент выбрал завтрак, предложить кофе.
Если обед или ужин — предложить сок.
*/
        Scanner scanner = new Scanner(System.in);

// Ввод данных
        // Выбор категории блюд
        System.out.println("Выберите категорию блюд:");
        System.out.println("1 - Завтрак");
        System.out.println("2 - Обед");
        System.out.println("3 - Ужин");
        int category = scanner.nextInt();

        // Проверка на голод
        System.out.println("Вы голодны сейчас? (да/нет)");
        String isHungry = scanner.next();

        // Рекомендация блюд
        if (isHungry.equalsIgnoreCase("да")) {
            // Клиент голоден
            if (category == 1) {
                System.out.println("Рекомендуем: Омлет с овощами и тостами.");
            } else if (category == 2) {
                System.out.println("Рекомендуем: Борщ с курицей и гречкой.");
            } else if (category == 3) {
                System.out.println("Рекомендуем: Стейк с картофелем и салатом.");
            } else {
                System.out.println("Некорректный выбор категории.");
            }
        } else if (isHungry.equalsIgnoreCase("нет")) {
            // Клиент не голоден, но хочет что-то легкое
            if (category == 1) {
                System.out.println("Рекомендуем: Фруктовый салат и йогурт.");
            } else if (category == 2) {
                System.out.println("Рекомендуем: Суп-пюре и свежие хлебцы.");
            } else if (category == 3) {
                System.out.println("Рекомендуем: Греческий салат и свежие фрукты.");
            } else {
                System.out.println("Некорректный выбор категории.");
            }
        } else {
            System.out.println("Некорректный ответ о голоде.");
        }

        scanner.close();
    }
}
