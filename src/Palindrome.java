public class Palindrome {
    public static void main(String[] args) {
        String str="cake";
        String str1="";
        char[] ch=str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            str1=str1+ch[i];
        }
        if(str.equals(str1)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
