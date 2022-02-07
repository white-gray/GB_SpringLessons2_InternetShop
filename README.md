# Что сделано

* в таблицу **_Product_** добавлены колонки _foldedToCartPerDay_ и _buyedForMounth_
* в модуле **_core-servuce_** в класс **repositories/ProductRepository** добавлены методы
       _@Query("SELECT p FROM Product p ORDER BY p.buyedForMounth LIMIT 5")
           List<Product> findBuyedForMounth();_
       _@Query("SELECT p FROM Product p ORDER BY p.foldedToCartPerDay LIMIT 5")
           List<Product> findFoldedToCartPerDay();_
   

