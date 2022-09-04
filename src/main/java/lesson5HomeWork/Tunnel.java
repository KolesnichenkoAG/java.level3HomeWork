package lesson5HomeWork;

import java.util.concurrent.Semaphore;
public class Tunnel extends Stage {

    private final Semaphore tunnel = new Semaphore(2);

    public Tunnel() {
        this.length = 80;
        this.description = "������� " + length + " ������";
    }

    @Override
    public void go(Car c) {
        try {
            System.out.println(c.getName() + " ��������� � �����(����): " + description);
            tunnel.acquire();
            System.out.println(c.getName() + " ����� ����: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(c.getName() + " �������� ����: " + description);
            tunnel.release();
        }
    }
}
