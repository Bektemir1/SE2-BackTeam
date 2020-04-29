package com.example.demo.Configs;

import java.util.Calendar;
import java.util.Date;

public class GlobalVariables {
    // Gets current year
    public String getYear() {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        int temp_year = cal.get(Calendar.YEAR);
        int term = cal.get(Calendar.MONTH);

        if (term >= 1 && term <= 5)
            term = 2;
        else if (term >= 9 && term <= 12)
            term = 1;

        String year = null;
        if (term == 1)
            year = temp_year + "-" + temp_year + 1;
        else if (term == 2)
            year = temp_year - 1 + "-" + temp_year;

        return year;
    }

    // Gets current term
    public Integer getTerm() {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int term = cal.get(Calendar.MONTH);

        if (term >= 1 && term <= 5)
            term = 2;
        else if (term >= 9 && term <= 12)
            term = 1;

        return term;
    }
}
