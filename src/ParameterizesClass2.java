public class ParameterizesClass2 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "privet");
        System.out.println("First value: " + pair.getValue1() + "\n" + "Second value: " + pair.getValue2());

        Pair<Double, Double> pair2 = new Pair<>(1.00, 3.00);
        System.out.println("First value: " + pair2.getValue1() + "\n" + "Second value: " + pair2.getValue2());
    }
}

class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 v1, V2 v2){
        this.value1 = v1;
        this.value2 = v2;
    }

    public V1 getValue1(){
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}
