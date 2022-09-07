public abstract class BaseHandler implements Handler {

    Handler next;

    @Override
    public void setNext(Handler handler){
        this.next = handler;
    }
}
