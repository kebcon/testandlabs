import java.util.*;

public class PhoneBook {

    private Map<String, String> phoneRecords = new HashMap();

    public void addRecord(String key, String value){
         this.phoneRecords.put(key, value);
    }

    public String lookup(String name) {
        return this.phoneRecords.get(name);
    }

    public void remove(String key ) {
        this.phoneRecords.remove(key);
    }

    public Set<Map.Entry<String, String>> listAllEntries() {
            return this.phoneRecords.entrySet();
    }

    public String toString(){
        return listAllEntries().toString();
    }

    public String reverseLookUp(String value) {
        for (Map.Entry<String,String> x : phoneRecords.entrySet()) {
             if(x.getValue().equals(value)){
                 return  x.getKey();
             }
        }
        return null;
    }

}
