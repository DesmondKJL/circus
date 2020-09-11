package circus.animal;

import circus.Asset;

import java.util.Comparator;

public abstract class Animal implements Asset {

    public static Comparator<Animal> AnimalNameComparator = new Comparator<Animal>() {
        @Override
        public int compare(Animal a1, Animal a2) {
            return a1.name.toLowerCase().compareTo(a2.name.toLowerCase());
        }
    };

    public String name;
//=======
//    public String name;
//
//>>>>>>> 7fb5a484b871da7e18a8242ba36fd0741e63ea7c
    public abstract String speak();
}
