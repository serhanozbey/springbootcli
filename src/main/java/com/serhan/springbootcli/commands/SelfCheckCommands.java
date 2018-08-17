package com.serhan.springbootcli.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class SelfCheckCommands {

    @ShellMethod("Shows ID")
    public int showId(){
        return 0;
    }
    @ShellMethod(value = "Shows users name")
    public String showName(){
        return "serhan";
    }

}
