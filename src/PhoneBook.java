import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    PhoneBook(){}
    private static HashMap<String, String> pb = new HashMap<String, String>();

    public void add(String phone, String name) {
        pb.put(phone, name);
    }
//    private static void add(String name, String phone) {
//        pb.put(phone, name);
//    }


    //FindNumberPhone - производит поиск списка номеров по фамилии заданой в качестве аргумента
    //возвращает массив строк
    public String[] get(String name){
        List <String> result = new ArrayList<String>();
        for (Map.Entry entry : pb.entrySet()) {
            if (name.equalsIgnoreCase((String)entry.getValue())){
                result.add((String)entry.getKey());
            }
        }
        if (result.size() == 0) result.add("абонент с такой фамилией не найден");
        return result.toArray(new String[0]);
    }

    public void info(){
        for (Map.Entry entry : pb.entrySet()) {
            System.out.println(entry.getValue() + " - " + entry.getKey());
        }
    }


}