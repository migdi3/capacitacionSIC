# capacitacionSIC

Ejercicio de DRL

En este ejercicio, creará un conjunto de reglas que simularán recomendaciones de asientos para una aerolínea según el nivel de lealtad (Oro, Plata, Bronce, Ninguno), la edad del cliente y las restricciones en los asientos en las filas de salida del aeronave.
Tenga en cuenta lo siguiente sobre la disposición de los asientos:
- El avión tiene 38 filas divididas en secciones de primera clase y clase económica.
- Las filas 1 y 2 están reservadas para clientes que reserven billetes de primera clase.
- Las filas 3 a 38 son para clientes de clase económica.
- Las filas 20 y 21 son asientos de la fila de salida, que tienen restricciones adicionales en cuanto a quién puede sentarse en ellos.

Implementarás reglas para los siguientes escenarios:

- Los clientes de nivel Gold pueden elegir un asiento en cualquier lugar de la clase económica, incluidas las filas de salida (cualquier fila excepto las filas 1 y 2, los asientos de primera clase).
- Los clientes de nivel Plata pueden elegir cualquier asiento en clase económica entre las filas 10 a 19 o 22 a 38.
- Los clientes de nivel Bronce pueden elegir cualquier asiento en clase económica entre las filas 24 a 38.
- Los clientes sin nivel de fidelidad pueden elegir cualquier asiento en clase económica entre las filas 26 y 38.
- Para elegir un asiento en la fila de salida (filas 20 y 21), el cliente debe tener al menos 21 años (independientemente del nivel de fidelidad).
- Los clientes de nivel Gold pueden optar por no sentarse en los asientos de la fila de salida.
- Importará un proyecto inicial a Business Central y utilizará los escenarios de prueba proporcionados para verificar la implementación de las reglas.

Para realizar este ejercicio, asegúrese de tener acceso a:
Una instancia configurada y en ejecución de Red Hat Decision Manager.
Acceso a la interfaz web de Business Central.
