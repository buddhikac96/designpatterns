package visitor;

import creditcard.MasterCard;
import creditcard.VisaCard;

public class AliPayVisitor extends PaymentVisitor{

    @Override
    public void visitMasterCard(MasterCard card) {
        System.out.println("AliPay use Master card of " + card.getName());
    }

    @Override
    public void visitVisaCard(VisaCard card) {
        System.out.println("AliPay use Visa card of " + card.getName());
    }
}
