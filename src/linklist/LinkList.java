package linklist;

/**
 * User: shoubhik Date: 21/12/12 Time: 4:42 PM
 */
public class LinkList {

    public static class LinkListNode{

        public int data;
        public LinkListNode next;

        public LinkListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private LinkListNode head;

    public LinkList(int data){
        this.head = new LinkListNode(data);
    }

    public LinkList(int arr[]){
        addLast(arr);
    }

    public LinkListNode getHead() {
        return head;
    }

    public void addLast(int data){
        if(this.head == null){
            this.head = new LinkListNode(data);
            return;
        }
        LinkListNode temp = this.head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = new LinkListNode(data);
    }

    public void addLast(int arr[]){
        for(int data : arr)
            addLast(data);
    }

    public int getLength(){
        LinkListNode temp = this.head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    public void print(){
        LinkListNode temp = getHead();
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        while(temp != null) {
            sb.append(temp.data);
            if(temp.next != null)
                sb.append(" ,");
            temp=temp.next;
        }
        sb.append(" ]");
        System.out.print(sb.toString());
    }
}
