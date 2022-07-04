# Documento de casos de testing | Sprint Nro

## Descripcion:
        Descripción de la user story "Como Secretaria quiero borrar un turno para dar de baja el mismo"

# Casos de Test:

## Caso N°1: La secretaria desea borrar un turno en específico para un médico determinado. Dicho turno no fue reservado por ningún paciente.

| Item  |  Datos del Sistema | Datos de Entrada  |  Salida Esperada | Salida Obtenida | Comentario(Opcional) |
|:-:|:-:|:-:|:-:|:-:|:-:|
|1|Turno cargado:Fecha y Hora= 2022-07-04T08:30, Medico= Nombre:Hector - Apellido: Salamanca - Especialidad: Traumatologia, Costo= 100.0, Duracion= 1|Se quiere borrar el turno del 04/07/2022, reservado para las 08:30 hs, que fue asignado al médico Hector Salamanca|Cuando se efectúe la eliminación del turno se espera un mensaje de confirmación que indique que no pertenecía a ningún paciente|Se obtuvo el mensaje "El turno eliminado no habia sido reservado por ningun paciente"

## Caso N°2: La secretaria desea borrar un turno en específico para un médico determinado. Dicho turno fue reservado previamente por un paciente.
| Item  |  Datos del Sistema | Datos de Entrada  |  Salida Esperada | Salida Obtenida | Comentario(Opcional) |
|:-:|:-:|:-:|:-:|:-:|:-:|
|1|Turno cargado:Fecha y Hora= 2022-07-04T08:30, Medico= Nombre:Hector - Apellido: Salamanca - Especialidad: Traumatologia, Costo= 100.0, Duracion= 1|Se quiere borrar el turno del 04/07/2022, reservado para las 08:30 hs, que fue asignado al médico Hector Salamanca|Cuando se concrete el borrado del turno se espera un mensaje de confirmación que indique a quién pertenecía el turno cancelado|Se obtuvo el mensaje "Se ha cancelado el turno de: Pepe Rodriguez - DNI: 123"|Para poder testear este caso se hardcodeó el turno (ya que la secretaria no puede asignarle el turno al paciente)

## Caso N°3: La secretaria desea borrar un turno para un médico determinado pero este no posee turnos.
| Item  |  Datos del Sistema | Datos de Entrada  |  Salida Esperada | Salida Obtenida | Comentario(Opcional) |
|:-:|:-:|:-:|:-:|:-:|:-:|
|1|Médicos asignados a la Secretaria sec (todos sin turnos): Medico1, Medico2, Medico3 y Medico4|Se quiere eliminar un turno para el Médico1|Un mensaje que informe a la secretaria que el médico no tiene turnos asignados|Se obtuvo el mensaje "El medico elegido no posee turnos asociados"

## Caso N°4: La secretaria desea borrar un turno pero no posee médicos asignados.
| Item  |  Datos del Sistema | Datos de Entrada  |  Salida Esperada | Salida Obtenida | Comentario(Opcional) |
|:-:|:-:|:-:|:-:|:-:|:-:|
|1|La secretaria no posee ningún médico asignado|Se desea eliminar un turno|Un mensaje que avise a la secretaria que no se le fue asignado ningún médico|Se obtuvo el mensaje "Usted no posee medicos asignados"

## Comentarios Generales:
        Se llevó a cabo el testeo de la funcionalidad de borrado de turnos para las secretarias. En base a las instancias detalladas en el testeo, se puede concluir que dicha funcionalidad no presenta errores.