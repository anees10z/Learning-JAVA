package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JobSequencing {

    static class Job {
        int id;
        int deadline;
        int profit;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        // {deadline, profit}
        int[][] jobsInfo = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobsInfo.length; i++) {
            int deadline = jobsInfo[i][0];
            int profit = jobsInfo[i][1];
            jobs.add(new Job(i, deadline, profit));
        }

        // Sort jobs by profit descending
        Collections.sort(jobs, (a, b) -> Integer.compare(b.profit, a.profit));

        // Find maximum deadline to know number of slots
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        // slots[t] = jobId scheduled at time slot (t+1), -1 means empty
        int[] slots = new int[maxDeadline];
        Arrays.fill(slots, -1);

        int maxProfit = 0;
        int jobsDone = 0;

        // Greedy: place each job in the latest available slot <= its deadline
        for (Job job : jobs) {
            int slotIdx = job.deadline - 1; // convert to 0-based index

            while (slotIdx >= 0 && slots[slotIdx] != -1) {
                slotIdx--;
            }

            if (slotIdx >= 0) {
                slots[slotIdx] = job.id;
                maxProfit += job.profit;
                jobsDone++;
            }
        }

        System.out.println("Max job performed = " + jobsDone);
        System.out.println("Maximum profit = " + maxProfit);

        System.out.print("Scheduled jobs by time slot: ");
        for (int t = 0; t < slots.length; t++) {
            if (slots[t] != -1) {
                System.out.print("A" + slots[t] + " ");
            }
        }
        System.out.println();
    }
}