package ua.com.juja;



public class EggsBread {

    public static String printPurchases(boolean hasEggs, boolean hasBread) {

        if (hasEggs && hasBread) {
            return "eggs,bread";
        }
        else if (!hasEggs && hasBread) {
            return "bread";
        }
        else if (hasEggs && !hasBread) {
            return "eggs";

        }else {
            return "";
        }

    }

    public static void main(String[] arg){


        boolean hasBreadShop = true;
        boolean hasEggShop = false;
        System.out.println("output for [b=true/e=false] is == "+ printPurchases(true, false));

        hasBreadShop = true;
        hasEggShop = true;
        System.out.println("output for [b=true/b=true] is == "+ printPurchases(hasEggShop, hasBreadShop));

        hasBreadShop = false;
        hasEggShop = false;
        System.out.println("output for [b=false/e=false] is == "+ EggsBread.printPurchases(hasEggShop, hasBreadShop));

        hasBreadShop = false;
        hasEggShop = true;
        System.out.println("output for [b=false/e=true] is == "+ EggsBread.printPurchases(hasEggShop, hasBreadShop));

    }




}

