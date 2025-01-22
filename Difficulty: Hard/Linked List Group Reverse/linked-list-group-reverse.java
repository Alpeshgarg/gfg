//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class ReverseInSize {
    static Node head;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());

        while (t-- > 0) {

            String s[] = in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < s.length; i++) {
                int a = Integer.parseInt(s[i]);
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail = tail.next;
            }

            int k = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            Node res = ob.reverseKGroup(head, k);
            printList(res, out);
            out.println();

            out.println("~");
        }
        out.close();
    }

    public static void printList(Node node, PrintWriter out) {
        while (node != null) {
            out.print(node.data + " ");
            node = node.next;
        }
    }
}

// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.data);
            head = head.next;
        }
        int len = list.size();
        int mod= len%k;
       
        int time =  (len/k);
        Node dummy = new Node(-1);
        Node temp = dummy;
        int group = 0;
        while(group<time){
        for(int i=(group*k)+k-1; i>=group*k; i--){
            temp.next = new Node (list.get(i));
            temp = temp.next;
        }
         group++;
        }
     
        if(mod!= 0){
            for(int i=len-1; i>=len-mod; i--){
            temp.next = new Node (list.get(i));
            temp = temp.next;   
            }
        }
        
        return dummy.next;
    }
}