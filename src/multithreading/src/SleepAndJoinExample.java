public class SleepAndJoinExample implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new SleepAndJoinExample());

        thread1.setName("T1");
        thread2.setName("T2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("End");
    }

    @Override
    public void run() {
        for(int i = 0; i <= 3; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " "+ i);
        }
    }
}

class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i <= 3; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " "+ i);
        }
    }
}



