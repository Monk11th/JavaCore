package HWs.HW4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNo {
    private static final Map<String, List<String>> phoneNo = new HashMap<>();

    public static void add(String name, String... phonesAdd) {
        if (phoneNo.get(name) != null) {
            List<String> phones = new ArrayList<>(phoneNo.get(name));
            phones.addAll(List.of(phonesAdd));
            phoneNo.put(name, phones);
        } else {
            phoneNo.put(name, List.of(phonesAdd));
        }
    }
    public static void get(String name) {
        System.out.printf("%s: %s\n", name, phoneNo.get(name));
    }
}
