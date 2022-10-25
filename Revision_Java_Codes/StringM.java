public class StringM{
    public static void main(String [] args){
        String  s1 = new String("Computer");
        String s2;
        int i;
        System.out.println("S1 is a String  : " + s1);
        s2 = s1.toUpperCase();
        System.out.println("After using toUpperCase() S1 has became : " + s2);
        s2 = s1.toLowerCase();
        System.out.println("After using toLowerCase() s1 has became : " + s2);
        i = s1.indexOf('m');
        System.out.println("M is at " + i + " index in string \"Computer\" .");
        i = s1.indexOf('m', 3);
        System.out.println("M is at " + i + " index in string \"Computer\" .");
        i = s1.indexOf("uter");
        System.out.println("Substring \"uter\" is at " + i + " index in string \"Computer\" .");
    }
}
