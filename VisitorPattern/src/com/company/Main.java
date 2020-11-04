package com.company;

import creditcard.MasterCard;
import creditcard.VisaCard;
import visitor.GasOfferVisitor;
import visitor.HotelOfferVisitor;

public class Main {

    public static void main(String[] args) {
        MasterCard masterCard = new MasterCard("buddhika", 10000);
        VisaCard visaCard = new VisaCard("chathuranga", 50000);

        HotelOfferVisitor hotelOfferVisitor = new HotelOfferVisitor();

        GasOfferVisitor gasOfferVisitor = new GasOfferVisitor();

        masterCard.accept(hotelOfferVisitor);
        visaCard.accept(gasOfferVisitor);
    }
}
