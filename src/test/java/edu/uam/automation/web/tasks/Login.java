package edu.uam.automation.web.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static edu.uam.automation.web.ui.HomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Login implements Task {

    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_OPTION),
                Enter.theValue(username).into(USERNAME),
                Enter.theValue(password).into(PASSWORD),
                WaitUntil.the(SUBMIT, isClickable())
                        .forNoMoreThan(10)
                        .seconds(),
                    Click.on(SUBMIT)
        );
    }

    public static Login with(String username, String password){
        return new Login(username, password);
    }
}
