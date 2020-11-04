package visitor;

import creditcard.MasterCard;
import creditcard.VisaCard;

public class PayHereVisitor extends PaymentVisitor {

    @Override
    public void visitMasterCard(MasterCard card) {
        System.out.println("PayHere use Master card of " + card.getName());
    }

    @Override
    public void visitVisaCard(VisaCard card) {
        System.out.println("PayHere use Visa card of " + card.getName());
    }
}
