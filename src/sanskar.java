import java.util.*;

public class sanskar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1="apple ";
        String n2="orange";
        System.out.println(findKey(n1,n2));



    }
    public static String findKey(String n1,String n2)
    {
        String a=n1+n2;
        a=a.replaceAll("\\s","");
        char[] strArray = a.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c : strArray)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }
        Arrays.sort(strArray);
        int n=strArray.length;
        for (int i = 0; i < n/ 2; i++)
        {
            char t = strArray[i];
            strArray[i] = strArray[n - i - 1];
            strArray[n - i - 1] = t;
        }

        String ans="";

        for(int i=0;i<strArray.length;i++)
        {
            if(map.containsKey(strArray[i])) {
                if (map.get(strArray[i]) >= 2) {
                    ans = ans + strArray[i];
                    map.remove(strArray[i]);

                } else {
                    ans = ans + strArray[i];
                }
            }

        }


        return ans;


    }

}
