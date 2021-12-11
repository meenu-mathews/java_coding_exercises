package com.techreturners.exercise003;
import java.util.HashMap;
import java.util.Map.Entry;
public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
//        throw new UnsupportedOperationException(("You can delete this statement and add your code here."));
        HashMap<String, Integer > icecreamMap = new HashMap<String, Integer >();

        /*Adding elements to HashMap*/
        icecreamMap.put("Pistachio",  0);
        icecreamMap.put("Raspberry Ripple", 1);
        icecreamMap.put("Vanilla", 2);
        icecreamMap.put("Mint Chocolate Chip",3);
        icecreamMap.put("Chocolate", 4);
        icecreamMap.put("Mango Sorbet", 5);

//        for (String key : icecreamMap.keySet()) {
//            if(key == iceCreamFlavour) {
//                System.out.println("*************\n\n\nvalue for key " + iceCreamFlavour + " is " + icecreamMap.get(iceCreamFlavour) + "\n\n\n*************");
//                //return icecreamMap.get(iceCreamFlavour);
//            }
//
//        }

        return icecreamMap.get(iceCreamFlavour);
    }

    String[] iceCreamFlavours() {
//        throw new UnsupportedOperationException(("You can delete this statement and add your code here."));
        String[] flavours = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
        //System.out.println("*************\n\n\n"+flavours[1].toString());
        return flavours;
    }

}
