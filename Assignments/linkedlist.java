/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;
import java.util.Scanner;
class Node1
{
    int data;
    Node1 next;
    Node1(int data)
    {
	this.data = data;
	this.next = null; 
    }
}

class Ll
{
    Node1 head = null;
	public Node1 add(int data)
	{
		if(head == null)
		{
			head = new Node1(data);
		}
		else
		{
			Node1 temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = new Node1(data);
		}
		return head;
	}
        
        public void Insert( int pos , int data)
        {
            Node1 node = new Node1(data);
            if(head == null)
            {
                return;
            }
            else
            {
                Node1 temp = head;
                for(int i=1  ; i<pos-1 ; i++)
                {
                    temp = temp.next;
                }
                Node1 curr = temp.next;
                node.next = curr;
                temp.next = node;                
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
                Node1 temp = head;
                for(int i=1 ; i<pos-1 ; i++)
                {
                    temp = temp.next;
                }
                Node1 curr = temp.next.next;
                temp.next = curr;
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
			Node1 temp = head;
			while(temp != null)
			{
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}
}

public class linkedlist 
{
    public static void main(String[] args) 
    {
        Ll list = new Ll();
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
        System.out.println("Enter the position to add:");
        int pos = sc.nextInt();
        System.out.println("Enter the  data:");
        data = sc.nextInt();
        list.Insert( pos , data);
        System.out.println("Enter the position to delete:");
        int p = sc.nextInt();
        list.delete(p);
        System.out.println("Linked List is: ");
        list.display();
    } 
}