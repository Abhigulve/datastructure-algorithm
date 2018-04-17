/**
 * @author Abhijeet Gulve
 */
public class AddTwoLinkedListTest {

    public static void main(String args[])
    {
        linkedlistATN list = new linkedlistATN();
        list.head1 = null;
        list.head2 = null;
        list.result = null;
        list.carry = 0;
        int arr1[] = { 9, 9, 9 };
        int arr2[] = { 1, 8 };

        // Create first list as 9->9->9
        for (int i = arr1.length - 1; i >= 0; --i)
            list.push(arr1[i], 1);

        // Create second list as 1->8
        for (int i = arr2.length - 1; i >= 0; --i)
            list.push(arr2[i], 2);
        //list.addlists();
        list.printlist(list.result);
    }
}
