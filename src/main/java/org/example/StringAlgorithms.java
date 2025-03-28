package org.example;

public class StringAlgorithms {

    public static void main(String[] args){
        //System.out.println(isPasswordComplex("abc"));
       // System.out.println(isPasswordComplex("Abc1"));
        //System.out.println(isPasswordComplex("Abcd"));
        //System.out.println(isAtEvenIndex("abcd",'c'));
        //System.out.println(isAtEvenIndex("abcd",'a'));
        //System.out.println(isAtEvenIndex("abcd",'e'));
        //System.out.println(isAtEvenIndex("",'e'));
       // System.out.println(reverse("Hello"));
        System.out.println(reverseSentence(""));
        System.out.println(reverseSentence(null));
        System.out.println(reverseSentence("sally is a great worker"));

    }

    private static boolean isUpperCase(String s){
        return s.chars().allMatch(Character::isUpperCase);
    }


    private static boolean islowerCase(String s){
        return s.chars().allMatch(Character::isLowerCase);
    }

    private static boolean isPasswordComplex(String s){
        return s.chars().anyMatch(Character::isDigit) &&
                s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isLowerCase);

    }
    /*
    return true if the item is at even index in the string
     */
    private static boolean isAtEvenIndex(String s,char item){
        if(s.length() == 0 || s ==null)
            return false;
        for(int i = 0; i<s.length()/2+1;i=i+2){
            if(s.charAt(i) == item )
                return true;
        }
        return false;
    }

    /*
    create a reverse string
     */
    private static String reverse(String s){
        if(s.isEmpty() || s == null){
            return "";
        }
        StringBuilder sb = new StringBuilder(s).reverse();

        return sb.toString();
    }

    private static String reverseSentence(String sentence){
        if(sentence == null || sentence.isEmpty()){
            return "";
        }
        String[] strings = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : strings){

            sb.append(reverse(word));
            sb.append(" ");
        }
        sb.trimToSize();
        return sb.toString();
    }
}
