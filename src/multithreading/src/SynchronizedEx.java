//ключевое слово Synchronized нужно для того, чтобы к одному ресурсу
//был доступ одновременно только у одного потока
//при этом, если использовать его без volatile на переменной
//то результат будет верным, но в процессе значения могут повторяться
//поэтому synchronized + volatile для решения проблемы гонки потоков

public class SynchronizedEx extends Thread {

    volatile static int counter = 0;

    public synchronized static void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());
        Thread thread3 = new Thread(new R());


        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Counter = " + counter);

    }


}



class R implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println(SynchronizedEx.counter);
            SynchronizedEx.increment();
        }
    }
}
