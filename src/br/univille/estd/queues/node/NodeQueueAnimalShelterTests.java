package br.univille.estd.queues.node;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import br.univille.estd.queues.EmptyQueueException;
import br.univille.estd.queues.Queue;
import br.univille.estd.queues.animalShelter.Cat;
import br.univille.estd.queues.animalShelter.Dog;
import br.univille.estd.queues.animalShelter.NodeQueueAnimalShelter;
import br.univille.estd.queues.animalShelter.Pet;

public class NodeQueueAnimalShelterTests {
	
	@Test
	public void enqueue() {
		NodeQueueAnimalShelter abrigo = new NodeQueueAnimalShelter();
		Pet cao = new Dog();
		Pet gato = new Cat();
		abrigo.enqueue(cao);
		assertEquals("Fila deve conter um elemento",1,abrigo.size());
	}
	
	@Test
	public void dequeueAny() {
		NodeQueueAnimalShelter abrigo = new NodeQueueAnimalShelter();
		Pet cao = new Dog();
		Pet gato = new Cat();
		abrigo.enqueue(cao);
		abrigo.enqueue(gato);
		assertEquals("Front deve retornar o elemento cao",cao,(Dog)abrigo.dequeueAny());
	}
	
	@Test
	public void dequeueDog() {
		NodeQueueAnimalShelter abrigo = new NodeQueueAnimalShelter();
		Pet cao = new Dog();
		Pet gato = new Cat();
		abrigo.enqueue(cao);
		abrigo.enqueue(gato);
		assertEquals("Front deve retornar o elemento cao",cao,(Dog)abrigo.dequeueDog());
	}
	
	@Test
	public void dequeueCat() {
		NodeQueueAnimalShelter abrigo = new NodeQueueAnimalShelter();
		Pet cao = new Dog();
		Pet gato = new Cat();
		abrigo.enqueue(cao);
		abrigo.enqueue(gato);
		assertEquals("Front deve retornar o elemento cao",gato,(Cat)abrigo.dequeueCat());
	}

}
