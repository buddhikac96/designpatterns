package visitor;

import creditcard.MasterCard;
import creditcard.VisaCard;

public class GasOfferVisitor extends OfferVisitor {

    @Override
    public void visitMasterCard(MasterCard card) {
        System.out.println("Gas offer from Master card to " + card.getName());
    }

    @Override
    public void visitVisaCard(VisaCard card) {
        System.out.println("Gas offer from Visa card to " + card.getName());
    }
}


