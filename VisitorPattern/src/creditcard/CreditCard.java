package creditcard;

import visitor.Visitor;

public interface CreditCard {
    String getName();
    int getBalance();
    void accept(Visitor visitor);
}

