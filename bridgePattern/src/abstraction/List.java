package abstraction;

import implementation.CollectionImplementation;

public class List extends CollectionAbstract {

    public List(CollectionImplementation collectionImplementation) {
        super(collectionImplementation);
    }

    @Override
    public void generateCollection() {
        collectionImplementation.generateList();
    }
}
