package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {

        Task07Main task = new Task07Main();
        //task.processor = new Processor();
        System.out.println(task.getExceptionType());
    }

    public Processor processor;

    public String getExceptionType() {
        try {
            processor.process(); //todo вы можете заменить реализацию этого метода для ручного дебага
            return NONE;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            return CHECKED;
        }
    }

}
