package interfaces;

import interfaces.impls.Collection;

public interface CustomCollection {

    int getSize();

    void add(String string);

    boolean contains(String string);

    boolean delete(int index);

    boolean delete(String string);

    String getByIndex(int index);

    boolean equals(Collection collection);

    int indexOf(String string);

    boolean addAll(String[] strArr);

    boolean addAll(Collection strColl);

    boolean trim();

    void clear();

}
