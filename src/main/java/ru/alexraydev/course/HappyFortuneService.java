package ru.alexraydev.course;

/**
 * Created by Administrator on 20.08.2017.
 */
public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
