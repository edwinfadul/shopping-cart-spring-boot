# shopping-cart-spring-boot
Prueba técnica con spring boot.

## Prerrequisitos.
Java EE 8 o superior

Cambiar el usuario y contraseña de acceso a la base de datos que esta en la ruta:
```properties
shopping-cart-spring-boot\src\main\resources\application.properties
spring.datasource.username=sa
spring.datasource.password=sa
```

## Comando para inciar la aplicación.
```maven
mvnw spring-boot:run
```

## Api rest para crear cliente
http://localhost:8080/api/customer

Método: POST

Objeto json para crear un nuevo cliente.

Para crear el cliente debes enviar el json sin el campo id. Puedes actualizar el cliente enviando el campo id.
```json
{
  "id": "5",
  "documentNumber": "88343777",
  "fullName": "Saito Hajime",
  "creditLimit": "500000.00"
}
```

## Api rest para crear carrito de compras
http://localhost:8080/api/shopping/cart/create

Método: POST

Objeto json para crear carrito de compras con 2 productos.
```json
{
   "shoppingCartHeader":{
      "idCustomer":"5",
      "isCredit":true,
      "active":false
   },
   "shoppingCartItems":[
      {
         "idProduct":1,
         "qty":1
      },
      {
         "idProduct":2,
         "qty":1
      }
   ]
}
```

## Api rest para actualizar item del carrito de compras.
http://localhost:8080/api/shopping/cart/update

Método: PUT

Objeto json para atualizar item.
```json
{
	"id": 27,
	"qty":10
}
```

## Api rest para eliminar item del carrito de compras.
http://localhost:8080/api/shopping/cart/delete/26

Método: DELETE

Recibe el id del item a eliminar por url.



## Api rest para generar la factura.
http://localhost:8080/api/invoice/40

Método: GET

Recibe el ID de la tabla ShoppingCartHeader para generar la factura desde el carrito de compras.
