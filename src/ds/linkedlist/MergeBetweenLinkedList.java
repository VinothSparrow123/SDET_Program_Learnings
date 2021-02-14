package ds.linkedlist;

import org.junit.Test;

import com.sun.org.apache.bcel.internal.classfile.Node;

public class MergeBetweenLinkedList {
//Leetcode number 1669
	/*
	 * 1669. Merge In Between Linked Lists

You are given two linked lists: list1 and list2 of sizes n and m respectively.

Remove list1's nodes from the ath node to the bth node, and put list2 in their place.

The blue edges and nodes in the following figure incidate the result:


Build the result list and return its head.

 

Example 1:


Input: list1 = [0,1,2,3,4,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
Output: [0,1,2,1000000,1000001,1000002,5]
Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result.
	 */
	
	@Test
	public void data1() {
		
	}
	
	public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = list1;
        ListNode fast = dummy;
        ListNode slow = dummy;

        while(a-- > 0) slow = slow.next;
        while(b-- >= 0) fast = fast.next;

        ListNode p = list2;
        while(p.next != null) p = p.next;

        slow.next = list2;
        p.next = fast.next;
        fast.next = null;
        return dummy.next;

    }
 
}
