package week2;

import java.util.Collections;
import java.util.PriorityQueue;

public class 프로세스 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int priority : priorities) {
            priorityQueue.add(priority);
        }

        while(!priorityQueue.isEmpty()) {
            for(int i = 0; i < priorities.length; i++)  {
                if(priorityQueue.peek() == priorities[i]) {
                    if(i == location) {
                        return answer;
                    }
                    priorityQueue.poll();
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        프로세스 p = new 프로세스();
        int[] priorities = {1, 1, 1, 1, 3};
        int location = 2;
        p.solution(priorities,location);
    }

}
