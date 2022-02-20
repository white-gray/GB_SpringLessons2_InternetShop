### реализовать не удалось
#### мои мысли:

в **store.js** на **_addToCart_** прописать 
`.then(function successCallback (response) {},
function errorCallback(response) {
if(response.data....){
}
if(response.data....){
}
} `
Про недоступность **product** пока вообще мыслей нет
И не смог придумать как из **CartService_.addToCart_** передать в **store.js** на **_addToCart_** сообщение _"Невозможно добавить продукт в корзину. Продукт не найдет, id: " + productId_

#слимком мало времени выделил этой задаче