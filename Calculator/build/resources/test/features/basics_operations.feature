#language: es

Característica: Operaciones basicas
  Yo, como usuario
  Necesito realizar suma, resta, multiplicacion y division en la calculadora
  Para ver que las operaciones se realicen correctamente

  @Suma
  Escenario:  Suma
    Dado que el usuario usuario abre la calculadora
    Cuando  le realiza la operacion suma entre "2" y "6"
    Entonces deberia ver el resultado "8"

  @Resta
  Escenario:  Resta
    Cuando  le realiza la operacion resta entre "6" y "2"
    Entonces deberia ver el resultado "4" en la resta

  @Multiplicaciion
  Escenario:  Suma
    Cuando  le realiza la operacion multiplicacion entre "2" y "6"
    Entonces deberia ver el resultado "12" en la multiplicacion

  @Division
  Escenario:  Division
    Cuando  le realiza la operacion division entre "8" y "2"
    Entonces deberia ver el resultado "4" en la division