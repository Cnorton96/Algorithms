package random;

import java.util.List;

public class fruitList {
    public boolean matchSecretLists(List<List<String>> secretFruitList, List<String> customerPurchasedList) {
        if (secretFruitList == null || secretFruitList.size() == 0) {
            return true;
        }
        if (customerPurchasedList == null || customerPurchasedList.size() == 0) {
            return false;
        }

        int i = 0;
        int j = 0;

        while (i < secretFruitList.size() && j + secretFruitList.get(i).size() <= customerPurchasedList.size()) {
            boolean match = true;
            for (int k = 0; k < secretFruitList.get(i).size(); k++) {
                if (!secretFruitList.get(i).get(k).equals("anything") && !customerPurchasedList.get(j + k).equals(secretFruitList.get(i).get(k))) {
                    match = false;
                    break;
                }
            }
            if (match) {
                j += secretFruitList.get(i).size();
                i++;
            } else {
                j++;
            }
        }
        return i == secretFruitList.size();
    }
}
