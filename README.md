# использовал Study 6, а на нем тесты из Study 7
Честно пися, не было времени глубоко вникнуть в сами тесты. Некоторые удалены, остальные "модифицированы под текущий проект"; но далеко не все до конца...


**Результаты:**

***UserServiceTest.java***  - Error creating bean with name 'com.geekbrains.spring.web.UserServiceTest': Unsatisfied dependency expressed through field 'userService';

***SpyTest.java***  - Tests passed

***SpringWebApplicationTests.java***  - Tests passed

***SecurityTest.java*** - Tests ignored. Прописано @SpringBootTest(classes = SpringWebApplication.class) , но  Unable to find a @SpringBootConfiguration, you need to use @ContextConfiguration or @SpringBootTest(classes=...) with your test

***RepositoriesTest.java*** - Tests failed. Configuration error: found multiple declarations of @BootstrapWith for test class [com.geekbrains.spring.web.RepositoriesTest]:...

***ProductStoreApplicationTests.java***  - Tests passed

***JsonTests.java***  - Tests ignored. Error: found multiple declarations of @BootstrapWith for test...

***FullServerRunTest.java***  - failed Error creating bean with name 'com.geekbrains.spring.web.FullServerRunTest': Unsatisfied dependency expressed through field 'restTemplate';....

***CartTest.java*** - failed java.lang.IllegalStateException: Failed to load ApplicationContext
