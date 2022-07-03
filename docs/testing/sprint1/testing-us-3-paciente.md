# Documento de casos de testing | Sprint Nro 1

## Descricion:
    Descripción de la user story "Como Paciente  quiero buscar un  médico para  encontrar al que  necesito"

# Casos de Test:

## Caso N°1: El paciente elige un filtro para la búsqueda de médicos

| Item  |  Datos del Sistema | Datos de Entrada  |  Salida Esperada | Salida Obtenida | Comentario(Opcional) |
|:-:|:-:|:-:|:-:|:-:|:-:|
| 1 | Médicos: Medico1, Medico2, Medico3| Se pide filtrar médicos por nombre y apellido (se elige "Juan Fernandez"), en este caso coincidentes con el de Medico1 y Medico3 | Impresión de los datos de medico1 y medico3 como resultado de imprimir la lista de médicos que cumplieron con el criterio | Impresión de los datos de medico1 y medico3 como resultado de imprimir la lista de médicos que cumplieron con el criterio| El testeo indica que funciona el filtrado de médicos por nombre y apellido|
|2| Médicos: Medico1, Medico2, Medico3 | Se pide filtrar médicos por especialidad (se elige "Traumatología"), en este caso coincidentes con el de Medico2 y Medico3 | Impresión de los datos de medico2 y medico3 como resultado de imprimir la lista de médicos que cumplieron con el criterio | Impresión de los datos de medico2 y medico3 como resultado de imprimir la lista de médicos que cumplieron con el criterio | El testeo indica que funciona el filtrado de médicos por especialidad|
|3| Médicos: Medico1, Medico2, Medico3 | Se pide filtrar médicos por una cierta obra social por la que atiende (se elige "o1"), siendo que en este caso todos los médicos atienden por la misma | Impresión de los datos de medico1, medico2 y medico3 como resultado de imprimir la lista de médicos que cumplieron con el criterio | Impresión de los datos de medico1, medico2 y medico3 como resultado de imprimir la lista de médicos que cumplieron con el criterio | El testeo indica que funciona el filtrado de médicos por obra social | 


## Caso N°2: El paciente no elige un filtro para la búsqueda de médicos
| Item  |  Datos del Sistema | Datos de Entrada  |  Salida Esperada | Salida Obtenida | Comentario(Opcional) |
|:-:|:-:|:-:|:-:|:-:|:-:| 
| 1 | Médicos: Medico1, Medico2, Medico3 | Se elige no filtrar los médicos por algún criterio en específico para la búsqueda | Impresión de los datos de medico1, medico2 y medico3 como resultado de imprimir la lista de médicos sin aplicar ningún criterio de filtrado | Impresión de los datos de medico1, medico2 y medico3 como resultado de imprimir la lista de médicos sin aplicar ningún criterio de filtrado | El testeo indica que funciona la búsqueda sin aplicar ningún filtro |

## Comentarios Generales:

Los datos relevantes para este testeo de los médicos fueron:

Medico1: Nombre: Juan - Apellido: Fernandez - Especialidad: Cirugía - Entre las obras sociales por las que atiende se encuentra o1

Medico2: Nombre: Carlos - Apellido: Gonzalez - Especialidad: Traumatología - Entre las obras sociales por las que atiende se encuentra o1

Medico3: Nombre: Juan - Apellido: Fernandez - Especialidad: Traumatología - Entre las obras sociales por las que atiende se encuentra o1

Conclusión:

    Se llevó a cabo el testing de las posibles formas de búsqueda (con cada posible criterio de filtrado y sin aplicar un filtro) eligiendo determinadas instancias de criterios y de médicos, y todas indican que la funcionalidad descripta no posee errores.