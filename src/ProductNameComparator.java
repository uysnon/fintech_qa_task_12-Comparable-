import java.util.Comparator;

/**
 * Релизация интерфейса Comparator
 * для сравнения объектов типа
 * Product по наименованию.
 */
public class ProductNameComparator implements Comparator<Product> {
    /**
     * Реализация метода compare
     * интерфейса Comparator.
     *
     * @param o1 Продукт 1.
     * @param o2 Продукт 2.
     * @return сравнение наименований продуктов.
     */
    @Override
    public int compare(final Product o1, final Product o2) {
        return (o1.getName().compareTo(o2.getName()));
    }
}
