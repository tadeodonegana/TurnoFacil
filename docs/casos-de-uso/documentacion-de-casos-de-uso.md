# Documentación de casos de uso

## Nombre: Buscar Médico

## Descripción
Esta funcionalidad del sistema consiste en buscar un médico, por medio de un mecanismo de filtrado de acuerdo a especialidad y/o obra social del mismo.

## Actor primario
Paciente

## Actores secundarios
No posee

## Trigger
El caso de uso comienza cuando el paciente quiere buscar un médico.

## Caso de uso curso básico
1. El caso de uso comienza cuando el paciente quiere buscar un médico.
2. El sistema pide seleccionar los criterios de filtrado (especialidad y/o obra social).
3. El paciente selecciona los criterios de filtrado (especialidad y/o obra social).
4. El sistema muestra los médicos que cumplen con los criterios de filtrado seleccionados.

## Suposiciones
1. Se supone que el paciente se encuentra logueado.
2. Se supone que la lista de médicos está actualizada.

## Nombre: Seleccionar Médico

## Descripción
Esta funcionalidad del sistema permite seleccionar un médico.

## Actor primario
Paciente

## Actores secundarios
No posee

## Trigger
El caso de uso comienza cuando el paciente quiere seleccionar un médico.

## Caso de uso curso básico
1. El caso de uso comienza cuando el paciente quiere seleccionar un médico.
2. El paciente selecciona un médico.
3. El sistema muestra los días y horarios en los que atiende el médico.

## Suposiciones
1. Se supone que el paciente se encuentra logueado.
2. Se supone que la lista de médicos está actualizada.
3. Se supone que los días y horarios en los que atiende el médico están actualizados.

## Nombre: Buscar Turno

## Descripci�n
Esta funcionalidad del sistema consiste en buscar un turno, por medio de un mecanismo de filtrado de acuerdo a rango de fechas y horario de turno (ma�ana y/o tarde).

## Actor primario
Paciente

## Actores secundarios
No posee

## Trigger
El caso de uso comienza cuando el paciente quiere buscar un turno.

## Caso de uso curso b�sico
1. El caso de uso comienza cuando el paciente quiere buscar un turno.
2. El sistema pide seleccionar los criterios de filtrado (rango de fechas y horario de turno, pudiendo ser ma�ana y/o tarde).
3. El paciente selecciona los criterios de filtrado (rango de fechas y horario de turno, pudiendo ser ma�ana y/o tarde).
4. El sistema muestra los turnos que cumplen con los criterios de filtrado seleccionados.
5. El sistema verifica que hay turnos disponibles de acuerdo a los criterios de filtrado seleccionados.

## Casos de uso curso alternativo
5 El sistema verifica que hay turnos disponibles de acuerdo a los criterios de filtrado seleccionados.
- 5.1 El sistema informa que no hay turnos disponibles de acuerdo a los criterios de filtrado seleccionados.
- 5.2 El sistema consulta si el paciente quiere ver los turnos disponibles para la otra semana de acuerdo a los criterios de filtrado seleccionados.
- 5.3 En caso de que se quieran ver los turnos disponibles para la siguiente semana de acuerdo a los criterios de filtrado seleccionados, el sistema muestra los mismos.
- 5.4 Fin caso de uso.

## Suposiciones
1. Se supone que el paciente se encuentra logueado.
2. Se supone que la lista de turnos disponibles est� actualizada.

## Nombre: Seleccionar Turno

## Descripci�n
Esta funcionalidad del sistema permite seleccionar un turno disponible.

## Actor primario
Paciente

## Actores secundarios
No posee

## Trigger
El caso de uso comienza cuando el paciente quiere seleccionar un turno.

## Caso de uso curso b�sico
1. El caso de uso comienza cuando el paciente quiere seleccionar un turno.
2. El paciente selecciona un turno disponible.
3. El sistema verifica que el m�dico atiende por la obra social del paciente y si hay diferencial.

## Casos de uso curso alternativo
3 El sistema verifica que el m�dico atiende por la obra social del paciente y si hay diferencial.
- 3.1 El sistema alerta que el m�dico no atiende por la obra social del paciente o que existe un diferencial.
- 3.2 Fin caso de uso.

## Suposiciones
1. Se supone que el paciente se encuentra logueado.
2. Se supone que la lista de turnos disponibles est� actualizada.