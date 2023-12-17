package school.ch1.together.study.ch16_abstractandinterface.homework.controller;

import school.ch1.together.study.ch16_abstractandinterface.homework.GalaxyNote9;
import school.ch1.together.study.ch16_abstractandinterface.homework.Phone;
import school.ch1.together.study.ch16_abstractandinterface.homework.V40;

public class PhoneController {


    private String[] result = new String[2];

    public String[] method() {
        Phone[] arr = new Phone[2];

        arr[0] = new GalaxyNote9();
        arr[1] = new V40();


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof GalaxyNote9) {
                result[i] = ((GalaxyNote9)arr[i]).printInformation() ;
            }else {
                result[i] = ((V40)arr[i]).printInformation();
            }
        }
        return result;
    }
}
