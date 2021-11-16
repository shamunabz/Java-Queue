package com.ss;

import java.util.LinkedList;
import java.util.Queue;
public class Queuedemo {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);   // it helps to add an element (offer)
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek()); // it telss which elemnt is next to comeout or pop out

    }


	}


