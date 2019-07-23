package written_test0723;

import java.util.Scanner;
//骆驼命名法
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {

            String s = in.nextLine();
            String[] str = s.split("_");
            StringBuffer stringBuffer = new StringBuffer();
            for(int i = 0;i<str.length;i++){
                if(i == 0){
                    stringBuffer.append(str[i]);
                }else{
                    String s1 = str[i].substring(0,1).toUpperCase();
                    String s2 = str[i].substring(1);
                    stringBuffer.append(s1+s2);
                }
            }
            System.out.println(stringBuffer.toString());
        }
    }
}