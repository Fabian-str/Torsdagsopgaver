import java.util.*;

public class Robot {

    private int min = 5;
    private int max = 25;
    private int sandsynlighedForKun1Vare = 70;
    private int maxStyk = 5;

    public Robot() {
    }

    /**
     * I had problems with this method, so I used AI to help figure out the problem.
     */
    public Collection<Product> fyldIKurv(Collection<Product> alleVarer) {

        if (alleVarer == null || alleVarer.isEmpty()) {
            throw new IllegalArgumentException("Allevarer is empty - can not fill a basket without products.");
        }

        Random random = new Random();

        List<Product> listOfProducts = new ArrayList<>(alleVarer);
        List<Product> kurv = new ArrayList<>();

        if (max < min) {
            int temp = max;
            max = min;
            min = temp;
        }

        int interval = max - min + 1;
        int numberOfProducts = random.nextInt(interval) + min;

        for (int i = 0; i < numberOfProducts; i++) {
            int stk = 1;

            if (maxStyk > 1 && random.nextInt(100) > sandsynlighedForKun1Vare) {
                int bound = maxStyk - 1;
                stk = random.nextInt(bound) + 2;
            }

            int size = listOfProducts.size(); // nu > 0
            Product product = listOfProducts.get(random.nextInt(size));

            while (stk > 0) {
                kurv.add(product);
                stk--;
            }
        }

        Collections.shuffle(kurv);
        return kurv;
    }
}
