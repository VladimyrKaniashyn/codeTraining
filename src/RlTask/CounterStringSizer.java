package RlTask;

public class CounterStringSizer {
    public int counter(String key){

        return key.length();
    }

    public static void main(String[] args) {
        CounterStringSizer counterStringSizer = new CounterStringSizer();
//        counterStringSizer.counter("aleo10ksz5ruwk9kf66am8rdytnjzdpq2p2t3m2z8e0muy2q6jc2q3s9s8rg08f");
//        counterStringSizer.counter("aleo17gfj0r76hj2lgf37gyrmuymqhqff7ydp20nn6ys27436v60dju9smt7aam");
        System.out.println(counterStringSizer.counter("aleo10ksz5ruwk9kf66am8rdytnjzdpq2p2t3m2z8e0muy2q6jc2q3s9s8rg08f"));
        System.out.println(counterStringSizer.counter("aleo17gfj0r76hj2lgf37gyrmuymqhqff7ydp20nn6ys27436v60dju9smt7aam"));
    }
}
