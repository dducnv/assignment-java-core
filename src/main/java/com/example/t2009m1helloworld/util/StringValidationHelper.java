package com.example.t2009m1helloworld.util;

import java.util.regex.Pattern;

public class StringValidationHelper {
    public static final Pattern VALID_EMAIL_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_PHONE_REGEX = Pattern.compile("/([\\+84|84|0]+(3|5|7|8|9|1[2|6|8|9]))+([0-9]{8})\\b/", Pattern.CASE_INSENSITIVE);

    public static boolean isValidEmail(String email){
        return VALID_EMAIL_REGEX.matcher(email).find();
    }

    public static boolean isValidPhone(String phone){
        return VALID_PHONE_REGEX.matcher(phone).find();
    }


}
