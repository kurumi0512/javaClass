public class TestTruth {
    public static void main(String[] args) {
        
        System.out.println(253&134);
		//253:1111 1101
		//134:1000 0110  -> 1000 0100
        System.out.println(253|134);
		//253:1111 1101
		//134:1000 0110  -> 1111 1111
        System.out.println(253^134);
		//253:1111 1101
		//134:1000 0110  ->0111 1011
    }
}