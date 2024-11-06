package oct252024_string;

public class lab123_String_functions {
    public static void main(String[] args) {
        // Substring example
        String str = "akashsingh";
        String part_of_str = str.substring(2,6);
        System.out.println(part_of_str);

        //concatenation -> adding two string

        String s1 = "Akash";
        String s2 = s1.concat(" singh");
        System.out.println(s2);

        // concatenation (by + )
        String s3 = "add";
        String s4 = " unlimited";
        String s5 = " number of string";
        String result = s3 + s4 + s5;
        System.out.println(result);
// Splitting of the strings

String fruilts = "apple,banana,orange";
String[] split_fruits = fruilts.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        // example 2 based on "-"
        String fruilts1 = "apple-banana-orange";
        String[] split_fruits1 = fruilts1.split("-");
        System.out.println(split_fruits1[0]);
        System.out.println(split_fruits1[1]);
        System.out.println(split_fruits1[2]);

        // ChatAt() -> returns the char value at the specific index

        String S7 = "Akash";
        System.out.println(S7.charAt(0));
       //System.out.println(S7.charAt(10));

        //trimAt() -> removes spaces from start and end of the string

        String s8 = " Singh ";
        System.out.println(s8.trim());

        //indexof -> gives the index value

        String s9 = "Tiket.com";
        System.out.println(s9.indexOf("i"));
        System.out.println(s9.indexOf("."));
        System.out.println(s9.indexOf("m"));

        // contains -> Returns true if and only if this string contains the specified sequence of char values.
        String s10 = "contains value";
        System.out.println(s10.contains("Hi"));
        System.out.println(s10.contains("contains"));

        // lastindexof -> Returns the index of the last occurrence of the specified substring.

        String s11 = "AkashAkash";
        System.out.println(s11.lastIndexOf("h"));

        //replace

        String s12 = "akash";
        System.out.println(s12.replace("a","1"));

        //startwith and endwith -> gives boolean result

        String s13 = "Akash tiket";
        System.out.println(s13.startsWith("Aka"));
        System.out.println(s13.endsWith("tiket"));
        System.out.println(s13.endsWith("ingh"));

        //replace all with regex //d+ removes the int value and //s+ removes string value

        String s14 = "Akash123 hello world123";
        String replaceall = s14.replaceAll("\\d+","");
        System.out.println(replaceall);
        String replaceall2 = s14.replaceAll("Akash","singh");
        System.out.println(replaceall2);
    }
}
