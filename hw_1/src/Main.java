public class Main {
    public static void main(String[] args) {
        findInteger(new int[] { 1, 2, 3, 4, 5 }, 3);
        System.out.println(sumInteger(1, 2));
        System.out.println(new Main().sumAllIntegers(1, 2, 3, 4, 5));
        Product product = new Product(1, "Laptop", 5000, "16 GB Ram", 10);

        product.setName("Laptop_changed");
        System.out.println(product.getName());


        ProductManager productManager = new ProductManager();
        productManager.add(product);

        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new TarimKrediManager());
        krediUI.krediHesapla(new OgretmenKrediManager());

    }

    public static void findInteger(int[] arr, int n) {
        //video 24
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                giveMessage("Found " + n);
                return;
            }
        }
        giveMessage("Not found " + n);
    }

    public static void giveMessage(String message) {
        //video 24
        System.out.println(message);
    }

    public static int sumInteger(int a, int b) {
        //video 25
        return a + b;
    }

    public int sumAllIntegers(int... values) {
        //video 26 variable arguments
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

}