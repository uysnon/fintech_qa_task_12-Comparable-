/**
 * Класс, опредеяющий понятие продукт.
 *
 * @author Gorkin Alexander
 * @version 0.1 17.03.2019
 */
public class Product {
    /**
     * Название продкута.
     */
    private String name;
    /**
     * Количество продукта.
     */
    private int count;

    /**
     * Конструктор.
     *
     * @param name  название создаваемого продукта.
     * @param count количество создаваемого
     *              продукта.
     */
    public Product(final String name, final int count) {
        this.name = name;
        this.count = count;
    }

    /**
     * Получние названия продукта.
     *
     * @return текущее название продукта.
     */
    public String getName() {
        return name;
    }

    /**
     * Получние количества продукта.
     *
     * @return текущеее количество продукта.
     */
    public int getCount() {
        return count;
    }
}
