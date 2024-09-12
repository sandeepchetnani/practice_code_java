import java.util.*;
class sTRING2{
    public static void main(String[] args) {
        String str="hi.sandeep.ssss.ssss";
        String[] arr=str.split("\\.");
        //int i=0;
        //int j=0;
        //int m =0;
       /*  List<String> list =  new ArrayList<>();
        while(i<str.length()){
            j=i;
            while (j<str.length() && str.charAt(j)!='.') {
                j++;
            }
            String temp = str.substring(i, j);
            list.add(temp);
            i = j+1;
        }*/
        for (String strings : arr) {
            System.out.println(strings+" ");
        }
    }
}