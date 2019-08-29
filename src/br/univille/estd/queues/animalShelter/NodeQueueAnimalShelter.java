package br.univille.estd.queues.animalShelter;

import br.univille.estd.queues.EmptyQueueException;
import br.univille.estd.queues.node.Node;
import br.univille.estd.queues.node.NodeQueue;

public class NodeQueueAnimalShelter extends NodeQueue<Pet> {
	
	public static int numero = 0;
	private NodeQueueCat nodeQueueCat = new NodeQueueCat();
	private NodeQueueDog nodeQueueDog = new NodeQueueDog();
	
	
	public long size() {
		return nodeQueueCat.size() + nodeQueueDog.size();
	}
	
	public void enqueue(Pet pet) {
		pet.setTempo(numero);
		numero++;
		if(pet instanceof Dog) {
			nodeQueueDog.enqueue(pet);
		}else {nodeQueueCat.enqueue(pet);}
	}
	
	
	public Pet dequeueAny() {
		
		if(nodeQueueCat.front().getTempo() < nodeQueueDog.front().getTempo() ) {
			return nodeQueueCat.dequeue();
		}else {
			return nodeQueueDog.dequeue();
			}
	}
	
	public Pet dequeueCat() {
		return nodeQueueCat.dequeue();
	}
	
	public Pet dequeueDog() {
		return nodeQueueDog.dequeue();
	}
}
