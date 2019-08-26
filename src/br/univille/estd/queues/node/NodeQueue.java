package br.univille.estd.queues.node;

import br.univille.estd.queues.EmptyQueueException;
import br.univille.estd.queues.Queue;

public class NodeQueue<E> implements Queue<E> {
	protected int size; 
	protected Node<E> head;
	protected Node<E> tail; 
	public NodeQueue() {
		head = null;
		tail = null;
		size = 0;
	}

	@Override
	public long size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (head== null);
	}

	@Override
	public void enqueue(E e) {
		Node<E> v = new Node();
		
		if(size() == 0) {
			head = v;
		}else {
			tail.setNext(v);
		}
		tail = v;
		size++;
	}

	@Override
	public E dequeue() {
		E temp;
		if(isEmpty()) {
			throw new EmptyQueueException("A fila está vazia");
		}
		temp = head.getElement();
		head = head.getNext();
		size = size - 1;
		if(isEmpty()) {
			tail = null;
		}
		return temp;
	}

	@Override
	public E front() {
		if(isEmpty()) {
			throw new EmptyQueueException("A fila está vazia");
		}
		return head.getElement();
	}

}
