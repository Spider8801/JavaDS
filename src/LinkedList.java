/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1605509
 */
public class LinkedList {
    Node head;
    public void insert(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }
    public void show()
    {
        Node no=head;
        while(no.next!=null)
        {
        System.out.println(no.data);
        no=no.next;
        }
        System.out.println(no.data);
    }
    public void insertatstart(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(head==null)
        {
        head=node;
        }
        else
        {
            head.next=node;
            node.next=head.next.next;
        }
    }
}
