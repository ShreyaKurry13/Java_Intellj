package LinkedList;


public class Linear_Linked_List_class
{
    Node root;
    //linked list is collection of Nodes
    void create_list()
    {
        root=null;//init
    }
    void insert_left(int e)
    {
        Node n=new Node(e);//created
        if(root==null)
            root=n;//1
        else
        {
            n.next=root;//1
            root=n;//2
        }
        System.out.println("\nInserted..");
    }
    void insert_right(int e)
    {
        Node n=new Node(e);//created
        if(root==null)
            root=n;//1
        else
        {
            Node t=root;//1
            while(t.next!=null)//2
                t=t.next;
            t.next=n;//3
        }
        System.out.println("\nInserted..");
    }

    void delete_left()
    {
        if(root==null)
            System.out.println("\nList empty");
        else
        {
            Node t=root;//1
            root=root.next;//2
            System.out.println("\n"+t.data+" Deleted");
        }
    }
    void delete_right()
    {
        if(root==null)
            System.out.println("\nList empty");
        else
        {
            Node t=root;//1
            Node t2=root;//1
            while(t.next!=null)//2 the tail
            {
                t2=t;
                t=t.next;
            }
            if(t==root)//single node
                root=null;//3
            else
                t2.next=null;//3
            System.out.println("\n"+t.data+" Deleted");
        }
    }
    void print_list()
    {
        if(root==null)
            System.out.println("\nList empty");
        else {
            Node t=root;
            System.out.println("\nList has:");
            while(t!=null)
            {
                System.out.print("|"+t.data+"|->");
                t=t.next;
            }
        }
    }
    void sort_list()
    {
        if(root==null)
            System.out.println("\nList empty");

        else
        {
            System.out.println("\nSorting the list....");
            for(Node pass=root;pass.next!=null;pass=pass.next) {
                for (Node t = root, t2 = root.next; t2 != null && t != null; t = t.next, t2 = t2.next) {
                    if (t.data > t2.data) {
                        int temp = t.data;
                        t.data = t2.data;
                        t2.data = temp;
                    }
                }
            }

        }
    }
    void revers_list()
    {
        if(root==null)
            System.out.println("\nList empty");

        else
        {
            System.out.println("\nReversing the list....");
            int index=0;
            int temp[]=new int[length()];
            Node t=root;
            while(t!=null)
            {
                temp[index++]=t.data;
                t=t.next;
            }
            index--;
            t=root;//reset to start
            while(t!=null)
            {
                t.data=temp[index--];
                t=t.next;
            }

        }

    }

    int length()
    {
        if(root==null)
            return 0;
        else {
            int count=0;
            Node t=root;
            while(t!=null)
            {
                count++;
                t=t.next;
            }
            return count;
        }
    }
    void search_list(int key)//key is element to search
    {
        if(root==null)
            System.out.println("\nList empty");
        else {
            Node t=root;
            boolean flag=false;
            while(t!=null)
            {
                if(t.data==key) {
                    flag = true;
                    break;
                }
                t=t.next;
            }
            System.out.println("\n"+key+"found:"+flag);
        }
    }
    void delete_element(int element)//element to search and delete if found
    {
        if(root==null)
            System.out.println("\nList empty");
        else
        {
            Node t=root;
            Node t2=root;
            while(t!=null)
            {
                if(t.data==element)
                {
                    System.out.println("\nFound:");
                    if(t==root)//case 1
                        root=root.next;
                    else if(t.next==null)//case 2
                        t2.next=null;
                    else //case 3
                        t2.next=t.next;
                    System.out.println("\n"+t.data+" Deleted");
                    break;
                }
                t2=t;
                t=t.next;
            }
            if(t==null)
                System.out.println("\n"+element+"not found");

        }
    }
    void insert_after(int ref,int element)//element to search and delete if found
    {
        if(root==null)
            System.out.println("\nList empty");
        else
        {
            Node t=root;
            while(t!=null)
            {
                if(t.data==ref)
                {
                    System.out.println("\nFound:");
                    Node n=new Node(element);
                    n.next=t.next;//3
                    t.next=n;//4
                    System.out.println("\n"+n.data+" inserted..");
                    break;
                }
                t=t.next;
            }
            if(t==null)
                System.out.println("\n"+element+"not found");

        }
    }
}
