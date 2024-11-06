package oct252024_string;

import javax.security.auth.login.CredentialNotFoundException;

public class lab120_strings_created {
    public static void main(String[] args) {
        String name ="AKASH"; // stored in String constrant pool
        name ="Singh";
        name="last value"; // always print last value

         //String - data type
        //name - ref
        // = - operator
        //akash - Literal (String)

        String name2= new String("SINGH");
        name2 =  "last singh under name 2";// new creates a new area under heap area
        System.out.println(name2);
    }
}
