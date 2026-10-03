class TestGC {

    TestGC() {
        System.out.println("Object created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }
}

public class Main {
    public static void main(String[] args) {

        TestGC obj1 = new TestGC();
        TestGC obj2 = new TestGC();

        obj1 = null;
        obj2 = null;

        System.gc();

        System.out.println("Garbage collection requested");

    }
}