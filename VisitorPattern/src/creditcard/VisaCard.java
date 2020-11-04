package creditcard;

import visitor.Visitor;

public class VisaCard implements CreditCard {

    public String name;
    public int balance;

    public VisaCard(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitVisaCard(this);
    }

}