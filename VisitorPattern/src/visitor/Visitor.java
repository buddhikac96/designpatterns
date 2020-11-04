package visitor;

import creditcard.MasterCard;
import creditcard.VisaCard;

public interface Visitor {
    void visitMasterCard(MasterCard card);
    void visitVisaCard(VisaCard card);
}
