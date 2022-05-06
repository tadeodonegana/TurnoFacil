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

## Descripción
Esta funcionalidad del sistema consiste en buscar un turno, por medio de un mecanismo de filtrado de acuerdo a rango de fechas y horario de turno (mañana y/o tarde).

## Actor primario
Paciente

## Actores secundarios
No posee

## Trigger
El caso de uso comienza cuando el paciente quiere buscar un turno.

## Caso de uso curso básico
1. El caso de uso comienza cuando el paciente quiere buscar un turno.
2. El sistema pide seleccionar los criterios de filtrado (rango de fechas y horario de turno, pudiendo ser mañana y/o tarde).
3. El paciente selecciona los criterios de filtrado (rango de fechas y horario de turno, pudiendo ser mañana y/o tarde).
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
2. Se supone que la lista de turnos disponibles está actualizada.

## Nombre: Seleccionar Turno

## Descripción
Esta funcionalidad del sistema permite seleccionar un turno disponible.

## Actor primario
Paciente

## Actores secundarios
No posee

## Trigger
El caso de uso comienza cuando el paciente quiere seleccionar un turno.

## Caso de uso curso básico
1. El caso de uso comienza cuando el paciente quiere seleccionar un turno.
2. El paciente selecciona un turno disponible.
3. El sistema verifica que el médico atiende por la obra social del paciente y si hay diferencial.

## Casos de uso curso alternativo
3 El sistema verifica que el médico atiende por la obra social del paciente y si hay diferencial.
- 3.1 El sistema alerta que el médico no atiende por la obra social del paciente o que existe un diferencial.
- 3.2 Fin caso de uso.

## Suposiciones
1. Se supone que el paciente se encuentra logueado.
2. Se supone que la lista de turnos disponibles está actualizada.

## Nombre: Confirmar Turno

## Descripción
Esta funcionalidad del sistema permite confirmar un turno y ser notificado de ello.

## Actor primario
Paciente

## Actores secundarios
No posee

## Trigger
El caso de uso comienza cuando el paciente quiere confirmar un turno y ser notificado de ello.

## Caso de uso curso básico
1. El caso de uso comienza cuando el paciente quiere confirmar un turno y ser notificado de ello.
2. El sistema pide reconfirmar nombre, apellido, dirección, teléfono, email, obra social y número de asociado.
3. El paciente reconfirma nombre, apellido, dirección, teléfono, email, obra social y número de asociado.
4. El sistema verifica que el nombre, apellido, dirección, teléfono, email, obra social y número de asociado coincidan con el DNI del paciente. 
5. El paciente confirma el turno.
6. El sistema envía un mail notificando la confirmación del turno.
7. El sistema pregunta si el paciente quiere imprimir un archivo con los detalles de la confirmación del turno.
8. El paciente confirma si quiere imprimir un archivo con los detalles de la confirmación del turno.

## Casos de uso curso alternativo

4 El sistema verifica que el nombre, apellido, dirección, teléfono, email, obra social y número de asociado coincidan con el DNI del paciente. 
- 4.1 El sistema informa que existe algún dato correspondiente al nombre, apellido, dirección, teléfono, email, obra social y/o número de asociado reingresado que no coincide con el DNI del paciente.
- 4.2 El sistema pide nuevamente reconfirmar nombre, apellido, dirección, teléfono, email, obra social y número de asociado.
- 4.3 El paciente reconfirma nombre, apellido, dirección, teléfono, email, obra social y número de asociado.
- 4.4 Ir paso 4.

8 El paciente confirma si quiere imprimir un archivo con los detalles de la confirmación del turno.
- 8.1 El sistema imprime un archivo con los detalles de la confirmación del turno si el paciente eligió imprimirlo.
- 8.2 Fin caso de uso.

## Suposiciones
1. Se supone que el paciente se encuentra logueado.