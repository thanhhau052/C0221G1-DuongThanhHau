package case_study_furama_resort.views;


import case_study_furama_resort.modol.Customer;

import java.util.Comparator;

public class NameComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer s1, Customer s2) {
        String[] arr1 = s1.getBirthday().split("/");
        int birthdayYear1 = Integer.parseInt(arr1[2]);

        String[] arr2 = s2.getBirthday().split("/");
        int birthdayYear2 = Integer.parseInt(arr2[2]);

        if(s1.getName().compareTo(s2.getName()) == 0) {
            int i = birthdayYear1 - birthdayYear2;
            return i;
        }
        return s1.getName().compareTo(s2.getName());
    }
}