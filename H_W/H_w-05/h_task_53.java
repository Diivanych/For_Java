import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class h_task_53 {
    public class TelSpr 
    {
 
    private static HashMap<String, String> ts = new HashMap<>();
    private static void addTS(String phone, String name) {
        ts.put(phone, name);
        for(Map.Entry<String,String> k: ts.entrySet()){
            System.out.println(k.getValue()+": "+ k.getKey());
        }
    }
    
    private static void delTS(String phone) {
        ts.remove(phone);
        for(Map.Entry<String,String> k: ts.entrySet()){
            System.out.println(k.getValue()+": "+ k.getKey());
        }
    }
 
    private static void saveTS() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("phone.txt")));
        for(Map.Entry<String,String> k: ts.entrySet()){
            writer.write(k.getKey() + " " + k.getValue()+System.lineSeparator());
        }
        writer.close();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("phone.txt")));
        String act;
        while ((act=reader.readLine())!=null) {  
            String[] dat = act.split(" ");
            ts.put(dat[0], dat[1]);
        }
        reader.close();
        for(Map.Entry<String,String> k: ts.entrySet()){
            System.out.println(k.getValue()+": "+ k.getKey());
        }
        System.out.println("выбор действия: (add)добавить данные, (del)удалить данные, (save)сохранить, (exit)выход");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        act = bf.readLine();
        while(!act.equals("exit")){
            if(act.equals("add")){
                System.out.println("Введите имя:");
                String name = bf.readLine();
                System.out.println("Введите телефон:");
                String phone = bf.readLine();
                addTS(phone,name);
            }else{
                if(act.equals("del")){
                    System.out.println("Введите телефон:");
                    String phone = bf.readLine();
                    delTS(phone);
                }else{
                   if(act.equals("save")){
                       saveTS();                       
                   }
                }
            }
            System.out.println("выбор действия: (add)добавить данные, (del)удалить данные, (save)сохранить, (exit)выход");
            act=bf.readLine();
        }
    }
}
}
