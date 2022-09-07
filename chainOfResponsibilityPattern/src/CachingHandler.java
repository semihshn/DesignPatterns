public class CachingHandler extends BaseHandler {

    Request cacheRequest;

    public CachingHandler() {
        cacheRequest = new Request();
    }

    @Override
    public void handle(Request request) {

        if (!cacheRequest.equals(request)) {
            System.out.println("Caching kontrolünden geçti");
            if (super.next != null) {
                super.next.handle(request);
            }
        } else {
            System.out.println("Caching kontrolünden geçemedi");
        }
        cacheRequest = request;
    }
}
