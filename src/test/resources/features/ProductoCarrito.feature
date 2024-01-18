#language: es
Característica: Agregar productos al carro de compras
  Yo como usuario de san angel quiero seleccionar varios productos
  para agregarlo al carro de compras

  Escenario: Agregar producto al carro de compras
    Dado que estoy en la pagina de san angel
    Y selecciono los productos y sus cantidades
    Cuando los agrego al carro de compra
    Entonces valido el mensaje de confirmación
