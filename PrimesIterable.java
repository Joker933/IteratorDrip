//import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class PrimesIterable implements Iterable<Integer> {

    //@NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new PrimesIterator();
    }
}
