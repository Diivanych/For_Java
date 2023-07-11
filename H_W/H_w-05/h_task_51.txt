/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class h_task_51 
{
    public static void main(String[] args) throws NumberFormatException
    {
        HashMap<String, ArrayList<Integer>> phoneNumber = new HashMap<>();
        HashMap<String, Integer> tempMap = new HashMap<>();
        
        ArrayList<String> nameArrayList = new ArrayList<>() 
        {{
            add("Климов"); add("Иванов"); add("Петров"); add("Сидоров"); add("Иванов"); 
            add("Баширов"); add("Иванов"); add("Сидоров"); add("Баширов"); add("Иванов");
        }};
        
        ArrayList<Integer> numbArrayList = new ArrayList<>() 
        {{  
            add(123321); add(123456); add(234567); add(345678); add(456789);
            add(567891); add(678912); add(789123); add(891234); add(912345);
        }};

        String key;
        int value;
        
        for (int i = 0; i < numbArrayList.size(); i ++) 
        {
            
            key = nameArrayList.get(i);
            value = numbArrayList.get(i);

            if (phoneNumber.containsKey(key)) 
            {   
                phoneNumber.get(key).add(value);
            } 
            else 
            {
            ArrayList<Integer> arrayList = new ArrayList<Integer>(1);
            arrayList.add(value);
            phoneNumber.put(key, arrayList);
            }
        
        }
        System.out.println(phoneNumber);
        
        System.out.println(phoneNumber.get("Иванов"));

        ArrayList<Integer> tempList = new ArrayList<>();

        tempList = phoneNumber.get("Иванов");

//        tempList = phoneNumber.keySet();

        System.out.println(tempList.size());

        System.out.println(phoneNumber.keySet() + " " + tempList.size());
        System.out.println(phoneNumber.values());


//        HashMap<String, ArrayList<Integer>> phoneNumber = new HashMap<String, ArrayList<Integer>>();
//        for (Map.Entry<String, Integer> entry : map.entrySet())

//        HashMap<String, ArrayList<Integer>> phoneNumber = new HashMap<String, ArrayList<Integer>>();
// HashMap<String, Integer> tempMap = new HashMap<>();
        phoneNumber.forEach((k, v) -> 
        {
            tempMap.put(k, v.size());
        });
        System.out.print(tempMap);

    }
}


*/