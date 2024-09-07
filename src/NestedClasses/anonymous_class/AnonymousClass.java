package NestedClasses.anonymous_class;

import org.w3c.dom.ls.LSOutput;

public class AnonymousClass {

    static int x = 9;

    public static void main(String[] args) {
        Math math = new Math() {
            int c = 100;
            @Override
            public int doOperation(int a, int b) {
                return a + b + AnonymousClass.x;
            }
        };

        System.out.println(math);

        Math2 math2 = new Math2() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };

        System.out.println(math.doOperation(4,6));
        System.out.println(math2.doOperation(4,6));

    }
}

interface Math {
    int doOperation(int a, int b);
}

class Math2 {
    int doOperation(int a, int b){
        return a / b;
    }
}
