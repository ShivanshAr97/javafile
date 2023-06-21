import java.util.StringTokenizer;
public class Main{
    static void tokenize(String s){
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
    public static void main(String[] args){
        String s = "I love to code in Java";
        tokenize(s);
        System.out.println("Char at index 3: "+s.charAt(3));
        System.out.println("Length: "+s.length());
        System.out.println("Comparision: "+s.compareTo("in Java"));
        System.out.println("Concatenation: "+s.concat("Script"));

        StringBuffer sb = new StringBuffer(s);
        sb.append("Script");
        System.out.println("Append: "+sb);
        System.out.println("Substring from Index 0-5: "+sb.substring(0,5));
    }
}