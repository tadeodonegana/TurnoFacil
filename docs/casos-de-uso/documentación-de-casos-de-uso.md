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