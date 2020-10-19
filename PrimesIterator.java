import java.util.Iterator;
import java.util.List;
import java.util.*;

public class PrimesIterator implements Iterator<Integer> {

    private int i = 1;
    private List<Integer> primesCache = new ArrayList<>();

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        do {
            i++;
        } while (!isPrime(i));
        return i;
    }


    public static void main(String[] args) {
        //for (int prime : new PrimesIterable()) {
          //  System.out.println(prime);
        //}
        Iterable<Integer> primes = new PrimesIterable();
        for (int prime : primes) {
            System.out.println(prime);
        }
    }

    private boolean isPrime(int i) {
        int sqroot = (int) Math.sqrt(i);
        for (int j : primesCache) {
            if (j > sqroot ) break;
            if (i % j == 0) {
                return false;
                }
            }
        }
        primesCache.add(i);
        return true;
    }
}
