package com.assignment.weatherservice.producer.consumer;

import java.util.Queue;

public class Consumer implements Runnable{

    Queue<String> queue;

    public Consumer(Queue<String> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        while(true){
            if(queue.isEmpty()) {
                synchronized (queue) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(queue.poll());
            synchronized (queue) {
                queue.notifyAll();
            }
        }

    }
}
