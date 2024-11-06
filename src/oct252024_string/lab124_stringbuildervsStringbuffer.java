package oct252024_string;

public class lab124_stringbuildervsStringbuffer {
    public static void main(String[] args) {

        //buffer
        StringBuffer buffer = new StringBuffer("akash");
       buffer.append("singh");
        System.out.println(buffer);

        // builder
        StringBuilder builder = new StringBuilder("avi");
        builder.append("singhvats");
        //builder.reverse(); // reverse the string
       System.out.println(builder);



    }
}
