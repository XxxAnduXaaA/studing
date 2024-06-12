import java.lang.invoke.VarHandle;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<Integer> i1 = new Info<>(2);
        System.out.println(i1);
        int v1 = i1.getValue();

        //Info<String> i2 = new Info<>("qq");
        Info<Double> i2 = new Info<>(143.14);
        //System.out.println(new Info<String>("qq"));
        //String v2 = i2.getValue();
        System.out.println(new Info<Double>(143.14));
        Double v2 = i2.getValue();
    }
}

class Info<T extends Number> {
    private T value;

    public Info(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public T getValue(){
        return value;
    }
}