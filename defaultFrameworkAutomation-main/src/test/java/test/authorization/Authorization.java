package test.authorization;

import org.testng.annotations.Test;
import pages.authorization.AuthorizationPage;
import services.authorization.AuthorizationService;


// Создаём публичный клаас Авторизация (Authorization)
public class Authorization {

// Создаём два новых неизменяемых объекта импортированных классов
  private final AuthorizationService authorizationService = new AuthorizationService();
  private final AuthorizationPage authorizationPage = new AuthorizationPage();


//Создаём метод для проверки регистрации с заданными параметрами емейла и пароля.
  @Test
  public void checkAuthorization() {
    String email = "alex20-03sh@mail.ru";
    String password = "022093Aa";

    // Используем в данном методе методы классов authorizationService и authorizationPage,
    // которые входят на страницу авторизации, вводят емейл с паролем и проверяют все возможные действия.

    authorizationService.openAutorizationPage();
    authorizationPage.setEmail(email);
    authorizationPage.setPassword(password);
    authorizationPage.getEnterButton().click();

  }
}