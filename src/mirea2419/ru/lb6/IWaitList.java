package mirea2419.ru.lb6;
import java.util.Collection;

public interface IWaitList<E> {
    void add(E element);

    E remove();

    boolean contains(E element);

    boolean containsAll(Collection<E> c);

    boolean isEmpty();
}
