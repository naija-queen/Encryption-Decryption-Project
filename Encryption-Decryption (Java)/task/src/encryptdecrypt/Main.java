package encryptdecrypt;

import java.util.Scanner;

public class Main {

    public String choose(String o, String message, int key){
        if(o.equals("enc")){
            return encrypt(message, key);
        } else if(o.equals("dec")) {
            return decrypt(message, key);
        }
        return "Unknown option";
    }

    public String decrypt(String in, int key){
        String out = "";
        int newValue = 0;
        int value = 0;
        for(int i = 0; i < in.length(); i++){
            char c = in.charAt(i);
            value = c;
            newValue = value - key;
            c = (char)newValue;
            out += c;
        }
        return out;
    }

    public String encrypt(String in, int key){
        String out = "";
        int newValue = 0;
        int value = 0;
        for(int i = 0; i < in.length(); i++){
            char c = in.charAt(i);
            value = c;
            newValue = value + key;
            c = (char)newValue;
            out += c;
        }
        return out;
    }

    public static void main(String[] args) {
        Main d = new Main();
        Scanner s = new Scanner(System.in);
        String opt = s.nextLine();
        String in = s.nextLine();
        int key = s.nextInt();

        String o = d.choose(opt, in, key);
        System.out.println(o);
    }

}