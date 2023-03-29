package com.example;

public class Task implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for (int index = 0; index < 10; index++) {
            sum += index;
            System.out.println(sum);
        }
        System.out.println( Thread.currentThread() + "최종 합 : " + sum);
    }

}
//Thread 클래스로부터 직접 생성
//new를 통해 Thread 클래스 객체를 생성 후 start 메서드를 통해 다른 스레드에서 할 작업을 할당하는 방법.
//Thread객체를 생성할 때는 Runnable 인터페이스를 구현한 클래스 객체를 매개변수로 받는다.