import java.util.Comparator;

/**
 * Реализация интерфеса Comparator для
 * сравнения объектов типа
 * Product по колчиеству.
 */

public class ProductCountComparator implements Comparator<Product> {
    /**
     * Реализация метода
     * compare интерфейса Comparator.
     *
     * @param o1 Продукт 1.
     * @param o2 Продукт 2.
     * @return разнница количества продуктов.
     */
    @Override
    public int compare(final Product o1, final Product o2) {
        return (o1.getCount() - o2.getCount());
    }
}
