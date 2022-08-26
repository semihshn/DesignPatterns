package abstraction;

import implementation.CollectionImplementation;

public abstract class CollectionAbstract {

    protected CollectionImplementation collectionImplementation;

    public CollectionAbstract(CollectionImplementation collectionImplementation) {
        this.collectionImplementation = collectionImplementation;
    }

    public abstract void generateCollection();

}
