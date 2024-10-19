package C2;

import java.util.Random;

public class Dado {
    private Random random;
    
    public Dado ()
    {
        random = new Random();
    }

    public int lancar () {
        return random.nextInt(11);
    }
}
