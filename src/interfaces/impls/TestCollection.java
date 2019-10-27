package interfaces.impls;

import interfaces.CustomCollection;

public class TestCollection implements CustomCollection {

    private String[] arr;
    private int count = 0;

    public String[] getArr() {
        return arr;
    }

    public TestCollection() {
        arr = new String[10];
    }

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public boolean add(String string) {
        String[] arrNew;
        if (count < arr.length) {
            arr[count] = string;
        } else {
            arrNew = new String[(arr.length + 1)];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            arrNew[count] = string;
            arr = arrNew;
        }
        count++;
        return true;
    }

    @Override
    public boolean contains(String string) {
        return indexOf(string) >= 0;
    }

    @Override
    public boolean delete(int index) {
        if (index > count - 1) {
            return false;
        } else {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            count--;
        }
        return true;
    }

    @Override
    public boolean delete(String string) {
        if (contains(string)) {
            for (int i = indexOf(string); i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            count--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getByIndex(int index) {
        if (index > count - 1) {
            return null;
        } else {
            return arr[index];
        }
    }

    @Override
    public boolean equals(Collection collection) {
        if (this.count != collection.getSize()) {
            return false;
        }
        for (int i = 0; i < collection.getSize(); i++) {
            if (!this.contains(collection.getByIndex(i))) return false;
        }
        return true;
    }

    @Override
    public int indexOf(String string) {
        for (int i = 0; i < count; i++) {
            if (string.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean addAll(String[] strArr) {
        for (String s : strArr) {
            add(s);
        }
        return true;
    }

    @Override
    public boolean addAll(Collection strColl) {
        for (int i = 0; i < strColl.getSize(); i++) {
            add(strColl.getArr()[i]);
        }
        return true;
    }

    @Override
    public boolean trim() {
        String[] arrNew;
        if (arr.length <= count) {
            return false;
        } else {
            arrNew = new String[count];
            for (int i = 0; i < count; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
        }
        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i < count; i++) {
            arr[i] = null;
        }
        count = 0;
    }
}

