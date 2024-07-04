VERSION 1.0.0

--Practica Implementacion de Estructura no Lineal Grafo

En esta practica se creo un pequeño programa que simula una aplicacion basica de una red social. Por medio de grafos se pudo simular una red de amigos de cada usuario creado y ademas se creo un algoritmo que recomienda posibles amigos.
-Clase User
Es el usuario registrado que ademas contiene sus intereses.

-Clase NodeGraph
Representa el Nodo del usuario con sus conexiones de amigos, que ademas no debe tener duplicacion de amigos.

-Clase Graph
Es la clase principal de la red, en esta clase se agregan los usuarios y sus conexiones con amigos creando asi la red. Esta clase no debe tener duplicacion de usuarios por medio del uso de la coleccion SETs representamos todos los nodos, debido a que los SETs no permiten la duplicacion de Valores. 

-Clase RecommendationEngine
Esta clase se encarga de recomendar a algun usuario posibles amigos, esta clase evalua los gustos de la persona con los gustos de todos los nodos que tiene la Red. Para saber el grado de Simulitud se calcula un promedio entre el numero de gustos similares con el numero de gustos totales entre la persona. Devolviendo asi un numero que depende de el grado de similutud colocado para recomendar o no agrega a una lista de posibles amigos.
