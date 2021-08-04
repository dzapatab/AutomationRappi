#language: es

Característica: API
  Yo, como usuario
  Necesito consumir los recursos de la API
  Para actualizar un registro, buscar un registro, crear un registro

 @ConsumeAPI
 Escenario:  Consume API con el metodo GET
   Dado que el usuario se conecta a la  API
   Cuando  consume el metodo get
   Entonces deberia ver el codigo de respuesta 200
   Entonces verifica que exista el id "8"

  @ConsumeAPI
  Escenario:  Consume API con el metodo POST
    Dado que el usuario se conecta a la  API
    Cuando  consume el metodo post con el nombre "AlejoB"
    Entonces deberia ver el codigo de respuesta 201
    Entonces verifica que exista el nombre "AlejoB"

  @ConsumeAPI
  Escenario:  Consume API con el metodo PUT
    Dado que el usuario se conecta a la  API
    Cuando  consume el metodo put con el nombre "DiegoB"
    Entonces deberia ver el codigo de respuesta 200
    Entonces verifica que se haya cambiado el nombre a "DiegoB"