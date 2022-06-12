# Criterios de aceptación

## Referencia
Guiandose con el PDF del [User Story Map](./usm.pdf).
- <*numero **User Story***> <*nombre User Task*>
    - Criterio De Aceptacion <*1*>
    - Criterio De Aceptacion <*2*>
    - Criterio De Aceptacion <*n*>

## Paciente
1. Sign Up
    - Solicitar DNI, nombre, apellido, dirección, teléfono, email, obra social, numero de asociado.
2. Log In
    - Solicitar DNI
    - Si no esta registrado pedir que se registre.
3. Sacar Turno
    - Mostrar listado medicos.
    - Filtrar por especialidad y/o obra social.
4. Sacar Turno
    - Al seleccionar un médico, mostrar dias y horarios en los que atiende el medico.
5. Sacar Turno
    - Filtrar por rango de fechas.
    - Filtrar por horario de turno (mañana, tarde).
    - En caso de no haber turno en el rango, consultar si quiere ver para la otra semana.
6. Sacar Turno
    - Alertar por diferencial o si el medico no atiende por la obra social.
7. Sacar Turno
    - Reconfirmar datos personales (menos DNI).
    - El paciente recibe un detalle del turno (también por mail).
    - Dar la opción de imprimir.
8. Ver Turnos
    - Mostrar un listado con mis futuros turnos y sus detalles.
9. Cancelar Turno
    - Dar de baja un turno.
    - Enviar comprobante.
## Secretaria
1. Log In
    - Solicitar nombre de usuario y password.
2. Ver grupos de medicos con los que trabaja
    - ver el detalle de cada médico.
3. Cargar días y horarios que trabajan los médicos
    - Solicitar días y horarios en los que atiende cada médico .
    - Informar pacientes.
4. Acceder a información de los turnos
    - Mostrar los detalles de los turnos.
5. Cargar Turnos
    - Que se pueda definir una franja horaria de un día determinado y la duración de cada uno.
6. Listar turnos venideros
    - Filtrar por médico, turno y rango de días.
7. Listar turnos venideros
    - Guardar configuración.
    - Imprimir diariamente.
8. Reagendar Turnos
    - Se debe poder modificar el horario y la fecha.
9. Cancelar Turnos
    - Eliminar turno.
## Médico
1. Log In
    - Solicitar nombre de usuario y password.
2.  Acceder a información de los turnos
    - Mostrar los detalles de los turnos.
3. Listar turnos venideros
    - Filtrar por turno y rango de días.
## Responsable de Institución Médica
1. Log In
    - Solicitar nombre de usuario y password.
2. Crear usuarios médicos
    - Ingresar DNI, apellido, nombre y especialidad.
    - Ingresar su nombre de usuario y password nuevas.
3. Crear usuarios secretarias
    - Ingresar DNI, apellido y nombre.
    - Ingresar su nombre de usuario y password nuevas.
4. Asignar médicos a secretarias
    - Mostrar todas las secretarias de la institución y sus datos.
5. Asignar médicos a secretarias
    - Mostrar todos los médicos de la institución y sus datos.
6. Asignar médicos a secretarias
    - Asignar médico.
    - Enviar lista de médicos a cada secretaria.
