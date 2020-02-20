package day22;

public class FindUnique {

//    Find Unique characters in a String :
//    aaaabbbbbcccaabbcd --->> abcd
//    One Logic :
//    create a String variable called uniques to store the unique characters ,
//    assign empty value go through each and every character and
//    check whether the current character is already in
//    uniques variable (uniques.contains(currentChar) )
//    if not concatenate it to unique variable
//    get out of the loop when you are done with last character

    public static void main(String[] args) {

        String txt = "aaaabbbbbcccaabbcd";
        String unique = "";

        for (int i = 0; i < txt.length(); i++) {
            if(!unique.contains(txt.substring(i,i+1))) {
                unique += txt.charAt(i);
            }
        }

        System.out.println("Unique letters are: " + unique);

    }

}
