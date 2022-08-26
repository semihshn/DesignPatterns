import abstraction.CollectionAbstract;
import abstraction.List;
import abstraction.Set;
import implementation.CSharp;
import implementation.CollectionImplementation;
import implementation.Java;

public class Test {

    public static void main(String[] args) {
        CollectionImplementation cSharpImplementation = new CSharp();
        CollectionAbstract cSharpList = new List(cSharpImplementation);
        CollectionAbstract cSharpSet = new Set(cSharpImplementation);

        CollectionImplementation javaImplementation = new Java();
        CollectionAbstract javaList = new List(javaImplementation);
        CollectionAbstract javaSet = new Set(javaImplementation);

        cSharpList.generateCollection();

        cSharpSet.generateCollection();

        javaList.generateCollection();

        javaSet.generateCollection();
    }

}
