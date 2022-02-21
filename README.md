### успел:

дать комментарии на МС **core**

пробовал прописать параметры WEB запросов в формате 
            `integrations:
              cart-service:
                url: http://localhost:5555/cart
                timeouts:
                  read: 2000
                    write: 2000
                    connection: 1000`
    но удалось только отдельным, а не вложенным классом.