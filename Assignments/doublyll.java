/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;


import java.util.Scanner;

class Node
{
    Node prev;
    Node next;
    int data;
    Node(int data)
    {
        this.next = null;
        this.prev = null;
        this.data = data;
    }
}
class doublylist 
{
    Node head = null;
    Node tail = null; 
    public Node add(int data)
    {
        Node node= new Node(data);
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
            tail = node;
        }
        return head;
    }
    public void insertatPosition( int pos , int data)
        {
            Node new_node = new Node(data);
            if(head== null)
            {
                return;
            }
            else
            {
                Node temp = head;
                for(int i=1  ; i<pos-1 ; i++)
                {
                    temp = temp.next;
                }
                Node curr = temp.next;
                new_node.next = curr;
                curr.prev = new_node;
                temp.next = new_node;  
                new_node.prev = temp;
            }
        }
    public void delete( int pos)
    {
        if(head == null)
        {
            return;
        }
        else
        {
        Node temp = head;
        for(int i=1 ; i<pos-1 ; i++)
        {
        temp = temp.next;
        }
         Node curr = temp.next.next;
                temp.next = curr;
                curr.prev = temp;
            }
        }
    
    public void display()
    {
        if(head== null)
        {
            return;
        }
        else
        {
            Node temp = head;
            System.out.println("Linked  list: ");
            while(temp != null)
	    {
		System.out.print(temp.data + " ");                             
		temp = temp.next;
            }
            System.out.println("\n reverse: ");
            Node temp2 = tail;
            while(temp2 != null)
	    {
	        System.out.print(temp2.data + " ");                             
		temp2 = temp2.prev;
            }
        }
    }
}

public class doublyll 
{
    public static void main(String[] args)
    {
        doublylist list = new doublylist();
        Scanner sc = new Scanner(System.in);
		int data;
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0 ; i<n ; i++)
		{
			data = sc.nextInt();
			list.add(data);
		}
                System.out.println("LinkedList is: ");
                list.display();
                System.out.println("\n Enter the position to Add");
                int pos = sc.nextInt();
                System.out.println("Enter value");
                data = sc.nextInt();
                list.insertatPosition( pos , data);
                System.out.println("LinkedList after adding is: ");
                list.display();
                System.out.println("\n Enter the position to delete:");
                int p = sc.nextInt();
                list.delete(p);
                System.out.println("LinkedList after deleting is: ");
                list.display();
    }
}
