# Documento de casos de testing | Sprint 1

## Descripcion:
     Se va a documentar el testing de la User Story "Como Paciente quiero confirmar mi turno para así asegurar mi cita con el médico", la cual es la número 7 en el USM.

# Casos de Test:

## Caso N°1 - El paciente ingresa bien sus datos

| Item  |  Datos del Sistema | Datos de Entrada  |  Salida Esperada | Salida Obtenida | Comentario(Opcional) |
|:-:|:-:|:-:|:-:|:-:|:-:|
|1|Paciente Activo(Datos del paciente)|Sin datos de entrada|True|True|El sistema le pide al usuario que reconfirme sus datos al ser afirmativo, se realiza el envio por mail y la impresion del turno.|


## Caso N°2 - El paciente ingresa con algun error sus datos
| Item  |  Datos del Sistema | Datos de Entrada  |  Salida Esperada | Salida Obtenida | Comentario(Opcional) |
|:-:|:-:|:-:|:-:|:-:|:-:|
|1|Paciente Activo(Datos del paciente)|Sin datos de entrada|False|False|El sistema le pide al usuario que reconfirme sus datos, ocurre un error al autenticar y se informa que los datos son incorrectos.|

## Comentarios Generales: