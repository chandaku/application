package com.assignment.weatherservice.producer.consumer;

import java.util.Queue;

import static java.lang.String.valueOf;

public class Producer implements Runnable {

    Queue<String> queue;

    public Producer(Queue<String> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {

        while(true){
            if(!queue.isEmpty()) {
                synchronized (queue) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            for(int i=0; i<20; i++){
                queue.add(valueOf(i));
            }

            synchronized (queue) {
                queue.notifyAll();
            }

        }
    }


}
