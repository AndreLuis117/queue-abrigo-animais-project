package br.univille.estd.queues.animalShelter;

import br.univille.estd.queues.EmptyQueueException;
import br.univille.estd.queues.node.NodeQueue;

public class NodeQueueAnimalShelter extends NodeQueue<Pet> {
	
	public void enqueue(Pet pet) {
		super.enqueue(pet);
	}
	
	/*
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
	*/
	
	public Pet dequeueAny() {
		super.dequeue();
	}
	
	public Pet dequeueCat() {
		super.dequeue();
	}
	
	public Pet dequeueDog() {
		super.dequeue();
	}
}
