# Llanquihue Tour

Sistema de administración de guías turísticos para la agencia Llanquihue Tour. La aplicación carga los registros desde un archivo de texto, los muestra en consola y permite filtrarlos por especialidad o ciudad.

## Funcionalidades

- Carga guías desde `src/resources/guias.txt`.
- Muestra el catálogo completo de guías.
- Filtra guías por especialidad.
- Filtra guías por ciudad.

## Estructura del proyecto

- `app`: contiene `Main`, punto de entrada del programa.
- `model`: contiene `GuiaTuristico` y `Direccion`. Cada guía tiene una dirección asociada.
- `service`: contiene `GestorGuias`, que administra la lista y realiza las búsquedas.
- `util`: contiene `LectorArchivo`, que lee y procesa el archivo de datos.
- `resources`: contiene `guias.txt`, con los registros de guías.

## Formato de los datos

Cada línea de `guias.txt` contiene ocho datos separados por punto y coma:

`RUT;Nombre;Teléfono;Especialidad;Años de experiencia;Calle;Número;Ciudad`

Ejemplo:

`17654321-0;Valentina Ruiz;934567890;Tours Culturales;9;Colon;215;Puerto Varas`

## Cómo ejecutar

1. Abre el proyecto en Apache NetBeans.
2. Ejecuta la clase `app.Main`.
3. Revisa los resultados en la consola.

El programa espera encontrar `guias.txt` en `src/resources/guias.txt`, relativo a la carpeta principal del proyecto.
