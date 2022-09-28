import java.lang.reflect.Array;

public class EratosthenesPrimeSieve implements PrimeSieve{

    private Boolean[] boo;


    public EratosthenesPrimeSieve(int grenze) {
        boo = new Boolean[grenze + 1];

        for(int i = 2; i<= grenze; i++){
            boo[i] = false;
        }
    }

    @Override
    public boolean isPrime(int prime) {
        if(!boo[prime]){
            int i = prime + prime;
            while(i < boo.length){
                boo[i] = true;
                i = i + prime;
            }
        }
        return false;
    }

    @Override
    public void printPrimes() {
        System.out.println("Liste von Primes");
        for(int i = 2; i < boo.length; i++){
            System.out.println(boo[i]);
        }
    }
}