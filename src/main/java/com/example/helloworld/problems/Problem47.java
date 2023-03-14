package com.example.helloworld.problems;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import com.example.helloworld.Problem;

public class Problem47 implements Problem
{
    public void solution()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss.SSS");
        sdf.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

        System.out.println("\nNow: " + sdf.format(System.currentTimeMillis()));

    }
}
