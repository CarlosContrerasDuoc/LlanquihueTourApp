# Llanquihue Tour

Proyecto Java para representar los servicios turísticos de la agencia Llanquihue Tour mediante una jerarquía de clases con herencia simple.

## Funcionalidades

- Define una clase base con el nombre y la duración de cada servicio.
- Modela rutas gastronómicas, paseos lacustres y excursiones culturales como subclases.
- Muestra dos ejemplos de cada tipo de servicio en la consola.
- Sobrescribe `toString()` en cada subclase para mostrar sus datos.

## Estructura del proyecto

- `src/ui`: contiene `Main`, punto de entrada del programa.
- `src/model`: contiene `ServicioTuristico` y las subclases `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural`.
- `src/data`: contiene `GestorServicios`, que crea y muestra los servicios de prueba.

## Servicios de prueba

Se crean dos instancias de cada tipo:

- `RutaGastronomica`: incluye el número de paradas.
- `PaseoLacustre`: incluye el tipo de embarcación.
- `ExcursionCultural`: incluye el lugar histórico.

## Cómo ejecutar

1. Abre el proyecto en Apache NetBeans.
2. Ejecuta la clase `ui.Main`.
3. Revisa los servicios turísticos mostrados en la consola.
