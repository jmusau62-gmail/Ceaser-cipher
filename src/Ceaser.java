public class Ceaser {
     public static String  encrypt(String plainText,int shift) {
         if (shift > 26) {
             shift = shift % 26;
         } else if (shift < 0) {
             shift = (shift % 26) + 26;
         }
         String cipherText = "";
         int length = plainText.length();
         for (int i = 0; i < length; i++) {
             char ch = plainText.charAt(i);
             if (Character.isLetter(ch)) {
                 if (Character.IsLowerCase(ch)) {
                char c =(char)(ch+shift);
                if(c>'z'){
                    cipherText +=(char)(ch -(26-shift));
                }
                 }
                 else if (Character.IsUpperCase(ch)) {
                 }
             }
             else {
             }
             cipherText += ch;
         }

         return cipherText;
     }

    public static  void main(String[]args){

}
}
