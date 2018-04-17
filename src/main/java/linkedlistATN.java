// Java program to add two linked lists

public class linkedlistATN {
    node head1, head2, result;
    int carry;

    // Function to print linked list
    void printlist(node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    /* A utility function to push a value to linked list */
    void push(int val, int list) {
        node newnode = new node(val);
        if (list == 1) {
            newnode.next = head1;
            head1 = newnode;
        } else if (list == 2) {
            newnode.next = head2;
            head2 = newnode;
        } else {
            newnode.next = result;
            result = newnode;
        }

    }
    class node {
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }
    }
}