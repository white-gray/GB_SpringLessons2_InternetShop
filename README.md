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
нашел https://javascopes.com/rest-api-error-handling-best-practices-e10dddb9/, но надо разбираться...