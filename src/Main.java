import interfaces.impls.Collection;
import interfaces.impls.TestCollection;

public class Main {

    public static void main(String[] args) {
        Collection collection = new Collection();
        Collection collection2 = new Collection();
        Collection collection3 = new Collection();
        String[] strings = new String[]{"M", "N", "O", "P"};
        TestCollection testCollection = new TestCollection();

        System.out.println("----------------------");
        System.out.println("Speed Test");
        collection.clear();
        testCollection.clear();
        long start = System.nanoTime();

        for (int i = 0; i < 10000; i++){
            collection.add("test");
        }

        long end = System.nanoTime();

        System.out.println(end - start);

        long start1 = System.nanoTime();

        for (int i = 0; i < 10000; i++){
            testCollection.add("test");
        }

        long end1 = System.nanoTime();

        System.out.println(end1 - start1);

        collection.clear();
        System.out.println("----------------------");

        collection.add("A");
        collection.add("B");
        collection.add("C");
        collection.add("D");
        collection.add("E");
        collection.add("F");
        collection.add("G");
        collection.add("H");
        collection.add("I");
        collection.add("J");
        collection.add("K");
        collection.add("L");
        collection.trim();


        collection2.add("L");
        collection2.add("K");
        collection2.add("J");
        collection2.add("I");
        collection2.add("H");
        collection2.add("G");
        collection2.add("F");
        collection2.add("E");
        collection2.add("D");
        collection2.add("C");

        collection3.add("A");
        collection3.add("B");
        collection3.add("C");
        collection3.add("D");
        collection3.add("E");
        collection3.add("F");
        collection3.add("G");
        collection3.add("H");
        collection3.add("I");
        collection3.add("G");
        collection3.add("K");
        collection3.add("L");
        collection3.add("");


        System.out.println("Testing method .getSize:");
        System.out.println(collection.getSize());
        System.out.println("Testing method .contains:");
        System.out.println(collection.contains("A"));
        System.out.println(collection.contains("M"));
        System.out.println("Testing method .delete:");
        System.out.println("Part 1 (string):");
        System.out.println(collection.delete("A"));
        System.out.println(collection.delete("A"));
        System.out.println(collection.getByIndex(0));
        System.out.println("Part 2 (index):");
        System.out.println(collection.delete(0));
        System.out.println(collection.delete(15));
        System.out.println(collection.getByIndex(0));
        System.out.println("Testing method .getByIndex:");
        System.out.println(collection.getByIndex(2));
        System.out.println(collection.getByIndex(20));
        System.out.println("Testing method .equals:");
        System.out.println(collection.equals(collection2));
        System.out.println(collection.equals(collection3));
        System.out.println("Testing method .indexOf:");
        System.out.println(collection.indexOf("L"));
        System.out.println(collection.indexOf("T"));
        System.out.println("Testing method .addAll:");
        System.out.println("Part 1 (array):");
        System.out.println(collection.getSize());
        System.out.println(collection.addAll(strings));
        System.out.println(collection.getSize());
        System.out.println(collection.getByIndex(12));
        System.out.println(collection.getByIndex(13));
        System.out.println("Part 2 (collection):");
        System.out.println(collection.getSize());
        System.out.println(collection.addAll(collection3));
        System.out.println(collection.getSize());
        System.out.println(collection.getByIndex(16));
        System.out.println(collection.getByIndex(17));
        System.out.println(collection.getByIndex(20));
        System.out.println("Testing method .trim:");
        System.out.println(collection.getArr().length);
        System.out.println(collection.trim());
        System.out.println(collection.getArr().length);
        System.out.println("Testing method .clear:");
        System.out.println(collection.getSize());
        collection.clear();
        System.out.println(collection.getSize());

    }
}
