package abstraction;

import implementation.CollectionImplementation;

public class Set extends CollectionAbstract {

    public Set(CollectionImplementation collectionImplementation) {
        super(collectionImplementation);
    }

    @Override
    public void generateCollection() {
        collectionImplementation.generateSet();
    }
}
