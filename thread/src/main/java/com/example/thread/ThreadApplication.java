package com.example.thread;

import com.example.Task;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThreadApplication {

	public static void main(String args[]){
		Runnable task = new Task();
		Thread subTread1 = new Thread(task);
		Thread subTread2 = new Thread(task);
		subTread1.start();
		subTread2.start();

//		public static void main(String args[]){
//			Runnable task = new Runnable() {
//				public void run() {
//					int sum = 0;
//					for (int index = 0; index < 10; index++) {
//						sum += index;
//						System.out.println(sum);
//					}
//					System.out.println( Thread.currentThread() + "최종 합 : " + sum);
//				}
//			};
//			Thread subTread1 = new Thread(task);
//			Thread subTread2 = new Thread(task);
//			subTread1.start();
//			subTread2.start();
//		}
		//꼭 Runable을 구현한 객체를 파일로 만들지 않고 익명 구현 객체로 만들어 간단하게 실행 가능하다.

//		public static void main(String args[]){
//			Runnable task = ()-> {
//				int sum = 0;
//				for (int index = 0; index < 10; index++) {
//					sum += index;
//					System.out.println(sum);
//				}
//				System.out.println( Thread.currentThread() + "최종 합 : " + sum);
//			};
//
//			Thread subTread1 = new Thread(task);
//			Thread subTread2 = new Thread(task);
//			subTread1.start();
//			subTread2.start();
//		} 람다식을 통한 구현
}
}

