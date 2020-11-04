package visitor;

import creditcard.MasterCard;
import creditcard.VisaCard;

public class HotelOfferVisitor extends OfferVisitor {

    @Override
    public void visitMasterCard(MasterCard card) {
        System.out.println("Hotel offer from Master card to " + card.getName());
    }

    @Override
    public void visitVisaCard(VisaCard card) {
        System.out.println("Hotel offer from Visa card to " + card.getName());
    }
}
