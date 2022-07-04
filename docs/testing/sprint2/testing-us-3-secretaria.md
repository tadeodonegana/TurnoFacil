# Documento de casos de testing | Sprint 2

## Descripcion:
        Descripción de la user story "Como Secretaria  quiero poder cargar días y horarios que trabajan los médicos para así poder cargar sus turnos"

# Casos de Test:

## Caso N°1: La secretaria elige agregar una jornada a un médico que no tiene otras jornadas cuyos horarios se crucen con la nueva

| Item  |  Datos del Sistema | Datos de Entrada  |  Salida Esperada | Salida Obtenida | Comentario(Opcional) |
|:-:|:-:|:-:|:-:|:-:|:-:|
|1|Médicos asignados a la Secretaria sec: Medico1, Medico2, Medico3 y Medico4|Se quiere agregar una jornada los jueves de 16:00 a 18:00 a Medico2 que no posee jornadas|Cuando se termine el agregado, para la impresión de las jornadas de Medico2 tiene que figurar únicamente una jornada, que debe ser los jueves de 16:00 a 18:00|Al terminar el agregado, para Medico2 figura únicamente una jornada, que es los jueves de 16:00 a 18:00|El testeo indica que funciona el agregado de jornadas a un médico|


## Caso N°2: La secretaria elige agregar una jornada a un médico que tiene al menos una jornada cuyo horario se cruza con la nueva
| Item  |  Datos del Sistema | Datos de Entrada  |  Salida Esperada | Salida Obtenida | Comentario(Opcional) |
|:-:|:-:|:-:|:-:|:-:|:-:|
|1|Médicos asignados a la Secretaria sec: Medico1, Medico2, Medico3 y Medico4|Se quiere agregar una jornada los jueves de 16:00 a 18:00 a Medico1 que posee solo una jornada, particularmente de 17:30 a 19:30 y para el mismo día|Cuando se termine el agregado, para la impresión de las jornadas de Medico1 tiene que figurar únicamente una jornada, que debe ser los jueves de 17:30 a 19:30 (se queda solo con la jornada anterior porque se cruza con la que se pretendía agregar)|Al terminar el agregado, para Medico1 figura únicamente una jornada, que es los jueves de 17:30 a 19:30|El testeo indica que el sistema no agrega una jornada a un médico cuando este posee al menos una jornada que se cruce con la misma, lo cual es correcto|

## Comentarios Generales:
        Conclusión:

    Se llevó a cabo el testing del agregado de jornadas realizado por las secretarias, y de acuerdo a las instancias de las mismas que se decidió agregar a los médicos, el testeo indica que la funcionalidad descripta no posee errores. 