public class ValidationHandler extends BaseHandler {

    @Override
    public void handle(Request request) {

        if (!request.value.isEmpty()){
            System.out.println("Validation kontrolünden geçti");
            if (super.next != null) {
                super.next.handle(request);
            }
        } else {
            System.out.println("Validation kontrolünden geçemedi");
        }
    }
}
