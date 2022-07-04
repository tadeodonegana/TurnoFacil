# Documento de casos de testing | Sprint 2

## Descripcion:
        Se va a documentar el testing de la User Story  "Como Secretaria  quiero cargar los  turnos de los  médicos para así los  pacientes puedan  reservarlo"

# Casos de Test:

## Caso N°1: La Secretaria quiere agregar un turno a un médico en una jornada existente

| Item  |  Datos del Sistema | Datos de Entrada  |  Salida Esperada | Salida Obtenida | Comentario(Opcional) |
|:-:|:-:|:-:|:-:|:-:|:-:|
| 1 | Médicos asignados a la Secretaria sec: Medico1, Medico2, Medico3 y Medico4. Y Jornada asignada al Médico2 (Martes de 12:00 a 17:00)| Se va a agregar un turno al médico Medico2, el dia 05-07-2022 a las 13hs que entra en la jornada asignada, con una duracion de 30 minutos y un costo de $200 | Cuando se termine el agregado, para la impresión de los turno agregados tiene que figurar únicamente un turno, que debe ser el martes 05-07-2022 a las 13hs, con una duración de 30 minutos y un costo de $200| Al terminar de agregar el turno figura unicamente el turno que asignamos en el dia y la hora pautada | El testeo indica que funciona el cargar un turno en una jornada valida |

## Caso N°2: La secretaria quiere agregar un turno a un médico en una jornada inexistente

| Item  |  Datos del Sistema | Datos de Entrada  |  Salida Esperada | Salida Obtenida | Comentario(Opcional) |
|:-:|:-:|:-:|:-:|:-:|:-:|
| 1 | Médicos asignados a la Secretaria sec: Medico1, Medico2, Medico3 y Medico4. | Se va a agregar un turno al médico Medico2, el dia 05-07-2022 con una duracion de 30 minutos y un costo de $200 | Cuando se termine el agregado, para la impresión de los turno agregados No tendria que figurar ningun turno | Al terminar de agregar el turno no figura ninguno cargado | El testeo indica que funciona correctamente en el caso que el medico no tenga una jornada cargada |

## Caso N°3: La secretaria quiere agregar un turno a un médico en una jornada existente pero se sale de la misma

| Item  |  Datos del Sistema | Datos de Entrada  |  Salida Esperada | Salida Obtenida | Comentario(Opcional) |
|:-:|:-:|:-:|:-:|:-:|:-:|
| 1 | Médicos asignados a la Secretaria sec: Medico1, Medico2, Medico3 y Medico4. Y Jornada asignada al Médico2 (Martes de 12:00 a 17:00) | Se va a agregar un turno al médico Medico2, el dia 05-07-2022 a las 16:30hs que el inicio es dentro de la jornada asignada, pero con la duracion se va de rango (40 minutos) y un costo de $200 | Cuando se termine el agregado, para la impresión de los turnos agregados, no tendria que figurar ninguno | Al terminar de agregar el turno no figura ninguno cargado | El testeo indica que funciona correctamente en el caso que el turno cargado se pase de la hora fin de la jornada |

## Caso N°4: La Secretaria quiere agregar un turno a un médico en una jornada existente, pero se solapa con otro ya cargado

| Item  |  Datos del Sistema | Datos de Entrada  |  Salida Esperada | Salida Obtenida | Comentario(Opcional) |
|:-:|:-:|:-:|:-:|:-:|:-:|
| 1 | Médicos asignados a la Secretaria sec: Medico1, Medico2, Medico3 y Medico4. Jornada asignada al Médico2 (Martes de 12:00 a 17:00) y turno cargado al mismo médico el dia 05-07-2022 a las 13:00hs hasta las 13:30hs| Se va a agregar un turno al médico Medico2, el dia 05-07-2022 a las 13:10hs que entra en la jornada asignada, con una duracion de 30 minutos y un costo de $200 | Cuando se termine el agregado, para la impresión de los turno agregados tiene que figurar únicamente un turno, que debe ser el cargado ya previamente| Al terminar de agregar el turno figura unicamente el turno ya cargado previamente | El testeo indica que funciona correctamente en el caso que se desea cargar un turno y se solape con otro |

## Comentarios Generales:
        Se llevó a cabo el testing del cargado de los turnos por las secretarias, y de acuerdo a las instancias de las mismas que se decidió agregar a los médicos, el testeo indica que la funcionalidad descripta no posee errores.