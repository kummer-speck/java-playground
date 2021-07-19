package com.statefarm;

public class Application {

    public static void main(String[] args) {
        if(args.length < 2){
            if(args.length == 0){
                System.out.println("Please specify a name and email");
            } else {
                System.out.println("Please specify an email for " + args[0]);
            }
        } else {
            System.out.println(args[0] + " <" + args[1] + ">");
        }

    }
}
