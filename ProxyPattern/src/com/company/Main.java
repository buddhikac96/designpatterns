package com.company;

import proxy.DBHandlerProxy;

public class Main {

    public static void main(String[] args) {
        DBHandlerProxy proxy = new DBHandlerProxy("admin");
        proxy.delete();
        proxy.add();
    }
}