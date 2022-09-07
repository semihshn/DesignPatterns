public class AuthorizationHandler extends BaseHandler {

    Boolean status;

    public AuthorizationHandler(Boolean status){
        this.status = status;
    }

    @Override
    public void handle(Request request) {

        if (this.status){
            System.out.println("Authorization kontrolünden geçti");
            if (super.next != null) {
                super.next.handle(request);
            }
        } else {
            System.out.println("Authorization kontrolünden geçemedi");
        }
    }
}
