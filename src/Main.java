import java.util.Set;
import java.util.TreeSet;

/**
 * Главный класс задания.
 *
 * @author Gorkin Alexander
 * @version 0.1 17.03.2019
 */
public final class Main {
    /**
     * Данные для заполнения объектов Product.
     */
    static final String[][] PRODUCT_NAMES = {
            {"Морковь", "765"},
            {"Яблоко", "426"},
            {"Ананас", "72"},
            {"Манго", "12"},
            {"Груша", "8543"},
            {"Дыня", "1032"},
    };
    /**
     * Продукты.
     */
    private static Set<Product> products;

    /**
     * Закрытый конструктор
     * утилитарного класса.
     */
    private Main() {

    }


    /**
     * Вызывавемый метод приложения.
     */
    public static void main(final String[] args) {
        products = new TreeSet<>(new ProductCountComparator());
        addRecords(products);
        System.out.println("Список в "
                + "порядке количества:");
        for (Product product : products) {
            System.out.println(product.getName()
                    + " "
                    + product.getCount()
            );
        }
        products = new TreeSet<Product>(new ProductNameComparator());
        addRecords(products);
        System.out.println("\nСписок в "
                + "порядке названий:");
        for (Product product : products) {
            System.out.println(product.getName()
                    + " "
                    + product.getCount()
            );
        }
    }

    /**
     * Заполнение коллекции значениями.
     *
     * @param set коллекция для заполнения.
     * @return заполненная коллекция.
     */
    private static Set<Product> addRecords(final Set<Product> set) {
        for (int i = 0; i < PRODUCT_NAMES.length; i++) {
            String name = PRODUCT_NAMES[i][0];
            int count = Integer.valueOf(PRODUCT_NAMES[i][1]);
            set.add(new Product(name, count));
        }
        return set;
    }
}

