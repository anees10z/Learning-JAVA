package PROBLEMSOLVING.PlacementPracticeProblems;

// Problem Description :
// There are n people in a line queuing to buy tickets, where the 0th person is at the front of the line and the (n - 1)th person is at the back of the line.
// You are given a 0-indexed integer array tickets of length n where the number of tickets that the ith person would like to buy is tickets[i].
// Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket at a time and has to go back to the end of the line (which happens instantaneously) in order to buy more tickets. If a person does not have any tickets left to buy, the person will leave the line.
// Return the time taken for the person initially at position k (0-indexed) to finish buying tickets.

// Example 1:
// Input: tickets = [2,3,2], k = 2
// Output: 6
// Explanation:
// The queue starts as [2,3,2], where the kth person is underlined.
// After the person at the front has bought a ticket, the queue becomes [3,2,1] at 1 second.
// Continuing this process, the queue becomes [2,1,2] at 2 seconds.
// Continuing this process, the queue becomes [1,2,1] at 3 seconds.
// Continuing this process, the queue becomes [2,1] at 4 seconds. Note: the person at the front left the queue.
// Continuing this process, the queue becomes [1,1] at 5 seconds.
// Continuing this process, the queue becomes [1] at 6 seconds. The kth person has bought all their tickets, so return 6.
// Example 2:
// Input: tickets = [5,1,1,1], k = 0
// Output: 8
// Explanation:
// The queue starts as [5,1,1,1], where the kth person is underlined.
// After the person at the front has bought a ticket, the queue becomes [1,1,1,4] at 1 second.
// Continuing this process for 3 seconds, the queue becomes [4] at 4 seconds.
// Continuing this process for 4 seconds, the queue becomes [] at 8 seconds. The kth person has bought all their tickets, so return 8.

public class TimeNeededToBuyTickets {
    public static int timeRequiredToBuyI(int[] tickets, int k) {
        int len = tickets.length;
        int count = 0;
        // left part
        for (int i = k - 1; i >= 0; i--)
            count += Math.min(tickets[i], tickets[k]);
        count += tickets[k];
        tickets[k]--; // because if tickets[k]==0 then right part have 1 less chance
        // right part
        for (int i = k + 1; i < len; i++)
            count += Math.min(tickets[i], tickets[k]);
        return count;
    }

    public static int timeRequiredToBuyII(int[] tickets, int k) {
        int len = tickets.length;
        int count = 0;
        int idx = 0;
        while (tickets[k] != 0) {
            if (tickets[idx] != 0) {
                tickets[idx]--;
                count++;
            }
            idx++;
            if (idx == len)
                idx = 0;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] tickets = { 1, 3, 2 };
        int k = 2;
        int ans = timeRequiredToBuyI(tickets, k);
        // int ans = timeRequiredToBuyII(tickets,k);
        System.out.println("Time: " + ans);
    }
}
