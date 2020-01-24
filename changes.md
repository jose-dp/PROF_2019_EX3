#Cambios realizados en el código fuente
##Apartado 2
- Se ha creado el objeto MyDate, que se utilizará como parámetro en el método de la clase Time para poder calcular la diferencia de tiempo usando un tiempo actual determinado.
- Se ha corregido el método getFutureTime de la clase Time, devolviendo el resultado (formateado) de la función plusSecond.

##Apartado 3
- Se ha añadido el parámetro MyDate al método de la clase MyClass para poder llamar a la función de Time.
- Se ha quitado el modificador static del metodo de la clase Time para que mockito pueda funcionar (un método estático no se puede sobreescribir).
- Como consecuencia a lo anterior, ahora hace falta un objeto de la clase Time para poder usar la función, por lo que se ha añadido a la función de Myclass un nuevo parámetro Time. De esta manera, se evita el uso de new Time() dentro de la función.
- No se ha modificado el método de la clase MyClass para que sea testeable (hacer que devuelva un String), ya que para verificar las llamadas no hace falta que devuelve nada dicho método. Se ha intentado cambiar el código lo menos posible.