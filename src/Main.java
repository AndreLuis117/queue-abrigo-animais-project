import br.univille.estd.queues.animalShelter.Cat;
import br.univille.estd.queues.animalShelter.Dog;
import br.univille.estd.queues.animalShelter.NodeQueueAnimalShelter;
import br.univille.estd.queues.animalShelter.Pet;

public class Main {

	public static void main(String[] args) {
		NodeQueueAnimalShelter abrigo = new NodeQueueAnimalShelter();
		Pet cao = new Dog();
		cao.setName("Cachorooooooo");
		Pet gato = new Cat();
		abrigo.enqueue(cao);
		abrigo.enqueue(gato);
		
		System.out.println(abrigo.dequeueAny().getName());
	}

}
