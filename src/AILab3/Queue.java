package AILab3;

import java.util.ArrayList;

public class Queue {
	static int tail = 0;// initial durumda kuyru�un ba�� ve sonu 0 � g�sterir
						// kuyruk bo�tur
	static int head = 0;
	static int Q[]=new int[2];
//	static ArrayList<Integer> Q=new ArrayList<Integer>();

	public static void main(String[] args) {
		System.out.println(Q.length);
		 for (int i = 0; i < 5; i++) {//kuyruk max 2 eleman al�r ama 5 ki�i varsa son gel
		 Enqueue(Q, i);// kuyru�a elamanlar eklenir
		 }
		 for (int i = 0; i < 5; i++) {
		 System.out.println(Dequeue(Q));
		 }

	}

	public static void Enqueue(int[] Q, int x) {// insert

		Q[tail] = x; // tail e x i ekle
	if (tail == Q.length-1) {
		tail = 0;//dairesel kuyruk oldu�u i�in kuyruk doldu�unda ba�� g�ster
		System.out.println("queue is full");
	} else {
			tail = tail + 1;
		}
	}

	public static int Dequeue(int Q[]) {// delete

		int x = Q[head];

		if (head == Q.length-1) {// /head ile length e�itse kuyruk bo�tur
			head = 0;
			System.out.println("queue is empty");
		} else {
			head = head + 1;
		}
		return x;// kuyruktan ��kan eleman� d�nd�r.
	}

}
