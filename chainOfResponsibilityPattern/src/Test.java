public class Test {
    public static void main(String[] args) {

        Request request = new Request();
        request.value = "test";

        //request.value = "test"; => Validation kontrolünden geçememesi için

        Handler authorizationHandler = new AuthorizationHandler(true);
        //Handler authorizationHandler = new AuthorizationHandler(false); => authorization kontrolünden geçememesi için
        Handler cachingHandler = new CachingHandler();
        Handler validationHandler = new ValidationHandler();

        authorizationHandler.setNext(validationHandler);
        validationHandler.setNext(cachingHandler);

        authorizationHandler.handle(request);

        //authorizationHandler.handle(request); => caching kontrolünden geçmemesi için

    }
}
