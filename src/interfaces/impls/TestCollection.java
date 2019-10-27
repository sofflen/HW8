package interfaces.impls;
public class TestCollection {

    private String[] arr;
    private int count = 0;

    public TestCollection() {
        arr = new String[10];
    }

    public int getSize() {
        return count;
    }

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
}