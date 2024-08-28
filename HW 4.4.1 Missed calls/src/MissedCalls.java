import java.awt.*;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    private Map<LocalDateTime, String> map = new TreeMap<>();
    public Map<LocalDateTime, String> getMissMap(){
        return map;
    }
    protected void addMissCall(String phone) {
        getMissMap().put(LocalDateTime.now(), phone);
    }

    protected void clearMissCalls() {
        getMissMap().clear();
    }

    protected void showMissCalls(Map<String, Contact> map2) {
        for (LocalDateTime list : getMissMap().keySet()) {
            System.out.println(list);
            if (Contact.findContact(getMissMap().get(list))){
                map2.get(getMissMap().get(list)).toString();
            }
            System.out.println(getMissMap().get(list));
        }
    }
}

