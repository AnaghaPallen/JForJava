public class ProblemTwo {
    public static void main(String[] args){

        /*Given a string,
        compress it using the counts of repeated characters, e.g., "aabcccccaaa" becomes "a2b1c5a3"
         */

        String str = "aabcccccaaa";
        int count = 1;
        //String result = "";
        StringBuilder result = new StringBuilder();

        char[] ch = str.toCharArray();

        for(int i=0; i<ch.length; i++){

            if(ch[i] == ch[i-1]){
                count++;
            } else {
                result.append(ch[i-1]).append(count);
                count = 1;
            }
        }
        result.append(ch[ch.length-1]).append(count);
        System.out.print(result.toString());

    }
}
