# Что сделано

изначально была мысль в таблицу продуктов в БД добавить колонки "foldedToCartPerDay" и "buyedForMounth"
    Но потом увидел в Телеграм и а начале урока 9 (дальше пока не смотрел), что подобное не лучший вариант

Тогда стал пробовать прописать, чтобы при добавлении товара в корзину, увеличивалось на 1 значение этого товара в модуле recommendations-service
        Не удалось решить ошибку в модуле cart-service: "Could not resolve placeholder 'integrations.recommendations-service.url' in value "${integrations.recommendations-service.url}""

