//� ������ �� ������� ����� ���� ���� ������ ����������
//������ �� main memory, ������� �������� � cpu cache
//�������������� ��� ��� ������ ���������� ��� ������� ������
//��� ��������� � ������ �������� ����������
//����� ������ ����� ���� ����� ����������,
//�� ���� �� ���������� �� � cpu cache
//����� ������������ �������� ����� volatile
//����� ���������� ������� � ��������� ������ ��/� main memory


public class VolatileExample extends Thread{

   volatile boolean b = true;

    @Override
    public void run(){
        long counter = 0;
        while(b){
            counter++;
        }
        System.out.println("Loop is finished, counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample thread = new VolatileExample();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds result");
        thread.b = false;
        thread.join();
        System.out.println("End of program");
    }
}