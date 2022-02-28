### что сделал

#Изначалоне не работает кнопка "Добавить в корзину"
Cart-service выдает: 
`...2022-02-26 02:09:09.310 ERROR 14892 --- [nio-8166-exec-2] o.a.c.c.C.[.[.[.[dispatcherServlet]      : Servlet.service() for servlet [dispatcherServlet] in context with path [/web-market-carts] threw exception [Request processing failed; nested exception is org.springframework.data.redis.serializer.SerializationException: Could not read JSON: Unexpected token (VALUE_NUMBER_INT), expected START_ARRAY: need JSON Array to contain As.WRAPPER_ARRAY type information for class java.math.BigDecimal
at [Source: (byte[])"{"@class":"com.geekbrains.spring.web.cart.models.Cart","items":["java.util.ArrayList",[]],"totalPrice":0}"; line: 1, column: 104] (through reference chain: com.geekbrains.spring.web.cart.models.Cart["totalPrice"]); nested exception is com.fasterxml.jackson.databind.exc.MismatchedInputException: Unexpected token (VALUE_NUMBER_INT), expected START_ARRAY: need JSON Array to contain As.WRAPPER_ARRAY type information for class java.math.BigDecimal
at [Source: (byte[])"{"@class":"com.geekbrains.spring.web.cart.models.Cart","items":["java.util.ArrayList",[]],"totalPrice":0}"; line: 1, column: 104] (through reference chain: com.geekbrains.spring.web.cart.models.Cart["totalPrice"])] with root cause...`
не смог исправить (сам трабл не понял/не нашел. Вроде написано про несоответствие VALUE_NUMBER_INT и java.math.BigDecimal, - не нашел где. Пробовал ставить-убирать слеши в application.yaml , как написано в паре мест по решению подобной ошибки. Повсюду понатыкал _@Autowired_. Безрезультатно.)
Это явно связано с регой Пользователя. 
Из-за этого для показа кнопки "**Оформить заказ**" из параметра **ng-show** убрано _ && cart.items.length > 0"_

При старте проекте крайне долго прихожится ожидать обращение а **paypal**. Поэтому стреница платежей закомменчена

#Что дулал:
Статус заказа прописан в БД. ... Далее переключидся на "конкретный адрес" в платеже, да там и "завис".

Прописка корректного адреса сделана на уровне HTML, и JavaScript (там, похоже, не правильно; да и бессмысленно, если есть проверка на HTML)
    На уровне Bacl-end проверку привильности формата адреса не прописал; 
    но в платеже в классе PayPalService адрес "разобрат на составляющие" и прописан. Только начитал формат адреса при запросе "по-русски", а в итоге подправил "в англицкий формат". 

#В итоге: 
большое спасибо за урок! Отлично и доходчиво показано, рассказано!
Но, судя по результатам, у меня не хватает ни сил, ни времени...ни мозгов ), - вроде каждая операция более-менее ясна; а запустить все вместе, да и просто выполнить задания, никак не удается...
