# Curso de Java SE Orientado a Objetos

## 📚 Módulo 1. Entender la Programación orientada a objetos

- ### Programación orientada a objetos en Java

  La POO surge a partir de la necesidad de resolver problemas con código, la POO permite resolver dichos problemas de una forma concisa, escalable y fácil de mantener.

  #### Orientación a Objetos

  Es un paradigma de programación. Parte de observar los problemas en forma de objetos.

  **Paradigma: **es una teoría que suministra la base y modelo para resolver problemas.

  El paradigma de Programación Orientada a Objetos se compone de 4 elementos principales:

  - **Clases**
  - **Propiedades**
  - **Métodos**
  - **Objetos**

  Además la POO tiene los siguientes pilares o conceptos fundamentales:

  - **Encapsulamiento**
  - **Abstracción**
  - **Herencia**
  - **Polimorfismo**

  #### UML (Unified Modeling Language)

  En Español *Lenguaje de Modelado Unificado*, permite graficar los atributos, métodos, herencia, etc de las diferentes Clases que componen un proyecto.

- ### ¿Qué es un Objeto?

  Son todas aquellas cosas que tienen propiedades y comportamientos; los objetos pueden ser físicos o conceptuales. Un objeto *físico* puede ser por ejemplo un usuario, y un ejemplo de objeto *conceptual* puede ser una sesión.

  #### Propiedades o atributos

  Son propiedades que pertenecen a un objeto. Siempre serán sustantivos. **Por ejemplo:** nombre, tamaño, forma, estado.

  #### Comportamientos

  También conocidos como **métodos**. Son las operaciones que realiza el objeto. Pueden ser verbos o sustantivo y verbo. **Por ejemplo:** ``login()``, ``logout()``, ``makeReport()``.

- ### Abstracción: ¿Qué es una Clase?

  Son el modelo sobre el cuál se construirá un objeto. Se puede decir que de cierta forma una Clase es un especie de molde que se usa para construir Objetos.

  #### Abstracción

  Es un concepto en el que se analiza un Objeto para extraer sus composición y en base a eso crear una Clase. En resumidas cuentas, la abstracción es ese proceso de analizar los  objetos para identificar sus atributos y métodos comunes para en base a  eso crear un molde llamando Clase.

  > "Cuando se detectan características y comportamientos iguales se debe realizar una abstracción."

  El flujo de trabajo con POO es el siguiente:

  1. Analizar el problema y extraer los Objetos que lo componen.
  2. Abstraer dichos Objetos en Clases.
  3. Gráficar las Clases en UML
  4. Implementar con código el diagrama UML.

  #### Graficar Clases en UML

  ![Clases en UML](https://i.imgur.com/Li7Ndkf.png)

- ### Modularidad

  Es un concepto proveniente del diseño industrial y la arquitectura. Consiste en dividir un sistema en varios módulos independientes que unidos conforman todo el sistema completo.

  **Ventajas de la modularidad:**

  - Reutilizar código.
  - Se evitan colapsos.
  - Código más mantenible.
  - Mejor legibilidad en el código
  - Rápida resolución de problemas

  Mientras en las programación estructurada se tiene un sólo archivo muy  grande en el que esta toda la lógica del sistema y en el que un error  puede detener la ejecución de todo el programa, en la programación  orientada a objetos las diferentes funciones de un sistema se dividen en módulos independientes, por lo que a la hora de solucionar bugs sólo  hay que ubicar el módulo que esta fallando y repararlo sin tener que  afectar al resto del código; y si se quieren añadir más funcionalidades  al proyecto solo hay que crear nuevos módulos e integrarlos dentro del  sistema.

  #### Las Clases dentro de la modularidad

  Las Clases juegan un papel fundamental dentro de la modularidad, pues permiten dividir el software en diferentes partes o módulos/Clases y a su vez separar dichas Clases en archivos diferentes.

## 📚 Módulo 2. Definir Clases y sus componentes

- ### Creando nuestra primera Clase

  #### Crear una Clase en Java

  ````java
  public class Doctor { // Doctor → Nombre de la Clase
      // Atributos
      int id;
      String name;
      String speciality;
  
      // Métodos
      public void showName() {
          System.out.println(name);
      }
  }
  ````

#### Instanciar un Objeto en Java

``Doctor`` → Tipo de Objeto ``myDoctor`` → Nombre de la instancia del Objeto ``new Doctor();`` → Crea la instancia del Objeto

````java
Doctor myDoctor = new Doctor();
myDoctor.name = "Alejandro López"; // Asignar un valor a un atributo
myDoctor.showname(); // Llamar a un método
````

- ### Método constructor

  ````java
  Doctor myDoctor = new Doctor(); // Doctor() → Método constructor
  ````

  El método constructor se llama igual que la Clase a la que pertenece. Cuando no se define explícitamente, el compilador de Java crea internamente uno por default.

  El método constructor es el que se encarga de crear nuevas instancias de una Clase. Se invoca con la palabra reservada ``new``. Puede tener cero o más parámetros y **No retorna un valor**.

- ### Static: Variables y Métodos Estáticos

  Hay otra forma de llamar a Clases y a sus respectivos métodos/atributos sin tener que crear una instancia con ``new``. Ese es caso de las **Clases estáticas** como ``Math``.

  ````java
  Math.random();
  Math.PI;
  ````

  ####  Métodos static

  Se definen con la palabra reservada ``static``. Los métodos static pueden ser accedidos usando **el nombre de la Clase**, **la notación de punto** y  el nombre del método.

  **Ejemplo:**

  ````java
  public class Calculadora() {
      public static final double PI = 3.1415926;
      public static int valor = 0;
      public static int suma(int a, inst b) {
          return a + b;
      }
  }
  
  // Llamar al método
  Calculadora.suma(5, 2);
  // Llamar a los atributos
  Calculadora.PI;
  Calculadora.valor;
  ````

   Los atributos/métodos estáticos tienen un scope global, por lo que pueden ser accedidos y modificados por cualquier Clase dentro del programa.

  #### Miembros static

  Son otra forma de llamar a atributos/métodos estáticos.

  ````java
  import static com.blooping.operaciones.Calculadora.*;
  import static java.lang.Math.*;
  
  // Llamar a estos atributos
  
  public class Principal {
  	public static void main(String[] args) {
       	System.out.println(suma(3, 5));
          System.out.println(PI);
      }
  }
  ````

  

- ### Creando elementos estáticos

  Los métodos estáticos son muy útiles cuando se quiere llamar a un método pero sin tener que instanciar una Clase, pues hace eso no quedaría bien a nivel de lógica, pues se instanciaría una Clase que sólo muestra elementos en pantalla pero que no tiene atributos ni nada más, lo cuál sería totalmente incensario.

  En esos casos se puede crear  un método statico y así mantener el código lo más limpio posible. Para empezar se puede crear un *package* y en su interior crear la Clase que muestra el menú.

  ````java
  package UI; // Relaciona la Clase con el package UI
  
  import java.util.Scanner; // Importa Scanner una Clase que permite ingresar datos desde la terminal
  
  public class UIMenu {
      // Métodos
          // Mostrar menú
          public static void showMenu() {
              // Código qu emuestra el ménú
          }   
  }
  ````

  Luego para usar ese método hay que importar el método estático para poder usarlo.

  ````java
  import static UI.UIMenu.*;
  
  public class Main {
  
      public static void main(String[] args) {        
          // Mostar menú de la UI
          showMenu();
      }
  }
  ````

  **Nota:** sobre el uso de los wildcards(*) al hacer un import lo ideal es importar el método especifico que se requiera. No es una buena buena práctica importar todo el módulo usando * pues esto al trabajar con módulos grandes esto ocupa mucho espacio en la memoria y hace más lento el proceso de indexación en el IDE a la hora de buscar el método.

- ### Final: Variables Constantes

  #### Declarar una constante en Java

  ````java
  public static final double PI = 3.1415926;
  ````

- ### Variable vs. Objeto: Un vistazo a la memoria

  Las variables de tipo primitivo en Java y los objetos se almacenan de forma diferente en la memoria.

  #### Stack

  Es una memoria con una estructura de "pila". En el caso de las **variables primitivos** en el stack se almacena  directamente su valor.

  Por el contrario en el caso de los **objetos** en el stack no se almacena el objeto como tal, sino una referencia al lugar en memoria donde se almacena el objeto (memoria heap).

  #### Heap

   Es una memoria con una estructura de "árbol". Aquí los datos pueden crecer o decrecer. En esta memoria se  almacenan los objetos como tal, con sus respectivos atributos.

  ![Stack y Heap](https://i.imgur.com/Whf16AX.png)

  Por esta razón, al hacer una reasignación a una variable, cuando esta es primitiva se reasigna el valor de la variable, pero en el caso de los objetos lo que se reasigna es la dirección en memoria.

  Por ejemplo si se tiene:

  ````java
  int a = 1;
  int b = 2;
  b = a; // b pasará a valer 0
  ````

  Pero cuando se trata de objetos:

  ````java
  Doctor doctor1 = new Doctor("Andrés");
  Doctor doctor2 = new Doctor("Felipe");
  
  doctor1.showName();
  doctor2.showName();
  
  /* 
  RESULTADO: 
  El nombre del Doctor asignado es Andrés
  El nombre del Doctor asignado es Felipe
  */
  
  System.out.println("\n");
  
  doctor2 = doctor1;
  doctor1.showName();
  doctor2.showName();
  
  /* 
  RESULTADO: 
  El nombre del Doctor asignado es Andrés
  El nombre del Doctor asignado es Andrés
  */
  
  ````

  Esto se debe a que se reasigna la dirección en memoria del objeto. Ahora ``doctor2`` apunta al lugar en memoria donde esta guardado ``doctor1`` de hecho cualquier cambio que se realice en ``doctor1`` se verá en ``doctor2``.

  

- ### Sobrecarga de métodos y constructores

  Consiste en hacer que dos o más métodos tengan el mismo nombre pero con argumentos diferentes. 

  #### Ejemplo de sobrecarga

  ````java
  public class Calculadora {
      public int suma (int a, int b) {
          return a + b;
      }
      public float suma (float a, float b) {
          return a + b;
      }
      public float suma (int a, float b) {
          return a + b;
      }
  }
  ````

  No sólo pueden variar el tipo de dato de los argumentos como en el ejemplo anterior, también puede variar la cantidad de argumentos.

  La sobrecarga también se puede aplicar a los *métodos constructores*.

  ````java
  Doctor() {
      System.out.println("Construyendo el Objeto Doctor");
  }
  
  Doctor(String name, String speciality) {
      id++;
      this.name = name;
      this.speciality = speciality;
  }
  ````

- ### Encapsulamiento: Modificadores de acceso

  Permite restringir el nivel de acceso a los datos del programa y validar dichos datos. Esto se hace mediante modificadores de acceso. En Java existen los siguientes:

  ![Modificadores de acceso en Java](https://i.imgur.com/4pYTpU7.png)

- ### Getters y Setters

  Permiten leer y escribir específicamente los valores de las variables miembro.

  **Gettter:** obtiene el valor de la variable.

  **Setter: ** asigna/modifica el valor de la variable.

  En IntelliJ Idea se pueden generar los getters y setters de forma más automatizada usando: *Alt + Insert*  → *Getter and Setter*

- ### Variable vs. Objeto

  Las **variables** son entidades elementales (muy sencillas). Sólo pueden almacenar un valor que puede ser:

  - Un número.
  - Un caractér.
  - Un valor verdadero o falso.

  Los **objetos** por el contrario, son entidades más complejas que pueden estar formadas por la agrupación de muchas variables y métodos.

  Los **arreglos** son agrupaciones de una cantidad fija de elementos de un mismo tipo de dato.  Pueden almacenar tipos de datos primitivos y objetos. Los arreglos además, son objetos, con la diferencia de que sólo almacenan valores de un sólo tipo de datos.

  #### Clases Wrapper / Objeto primitivo

  Son clases que por decirlo de cierta forma, "envuelven" a un primitivo para dotarlo de características de un Objeto, para por ejemplo tener métodos para manipular a ese tipo primitivo. En Java existen las siguientes Clases Wrapper:

  - Byte
  - Short
  - Integer
  - Long
  - Float
  - Double
  - Character
  - Boolean
  - String

  #### Parseo

  Es cuando se cambia el tipo de dato de un objeto.

  #### Casting

  Cuando se cambia el tipo de dato entre variables.

  

- ### Clases Anidadas

  Son una Clase que vive dentro de otra. Son Clases Helper que están agrupadas dentro de la lógica, además también pueden tener encapsulación.

  ````java
  class ClaseExterior {
      class ClaseAnidada {
          ...
      }
  }
  ````

  #### Tipos de Clases anidadas

  - ##### Clases Internas

    - ###### Clases Locales a un método

      Clases declaradas dentro de un método. No es muy común encontrarse con este tipo

    - ###### Clases Internas anónimas

      Están relacionadas con la programación funcional y las funciones lambdas

  - ##### Clases estáticas anidadas

    Son Clases anidadas pero de tipo estático.

    ````java
    class ClaseExterior {
    	static class ClaseEstaticaAnidada {
            ...
        }
    }
    
    ````

    En las Clases estáticas anidadas no es necesario crear instancias para poder llamarlas. Se llaman usando con ``ClaseExterior.ClaseEstaticaAnidada``. Para poder llamar a un método de un Clase estática anidada, dicho método también debe ser estático.
    **Ejemplo de Clase estática:** 

      ````java
        public class Enclosing {
            private static int x = 1;

            public static class StaticNested {
                private void run() {
                    // Implementación
                }
            }
        }
      ````
  
    Para llamar a una Clases estática anidada sólo hay que instanciar a la Clase exterior:
  
    ````java
    public class Main {
        public static void main(String[] args) {
            Enclosing.StaticNested nested = new Enclosing.StaticNested();
            
            nested.run();
        }
    }
    ````
  
  #### Colecciones
  
  Una colección es una especie de array de tamaño dinámico que almacena un conjunto de de Objetos (como las Clases Wrapper). Esta dentro del paquete ``java.util``. 
  
  ````java
  ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>(); // <AvailableAppointment> → Tipo de objeto que va a almacenar el ArrayList. availableAppointments → Nombre del ArrayList. new ArrayList<>(); → Constructor del ArrayList
  
  availableAppointments.add(new AvailableAppointment(date, time)); // Añadir Objetos al ArrayList
  ````
  
  **Nota:** si se tiene un atributo cuya estructura de dato es muy compleja, puede ser recomendable crear una Clase anidada.
  
  #### Métodos de un ArrayList
  
  Los siguientes son los métodos más comunes.
  
  ````java
  nombreArrayList.add("Elementos");
  nombreArrayList.size(); // Retorna el número de elementos de un ArrayList
  nombreArrayList.get(2); // Retorna el elemento que esta en determinada posición de un ArrayList
  nombreArrayList.set(index, element) // Sustituye un elemeto por otro. index → Indice del elemento a sustituir. element → Elemento a insertar.
  nombreArrayList.remove(5) // Quitar un elemento
  ````
  
  

- ### Clases Internas y Locales a un método

  - #### Clases Internas

      También llamadas *Clases anidadas no estáticas*. Al no ser una Clase estática, es necesario instanciarla. **Ejemplo:**

      ````java
      // Declaración de la Clase Interna
      public class Outer {
          public class Inner {

          }
      }
      ````

      Llamar a la Clase:

      ````java
      public class Main {
          public static void main(String[] args) {
            Outer outer = new Outer();
            Outer.Inner inner = outer.new Inner();
          }
      }
      ````

      Para declarar este tipo de Clases hay que instanciar 2 objetos, lo que consume más espacio en memoria, por lo tanto, hay que tener cuidado al usar este tipo de Clases, de hecho este tipo de Clases no son muy comunes.
      
  - #### Clases Locales a un Método
  
      Este tipo de Clases tienen un scope definido para el método al que pertenecen, en el ejemplo de abajo ese método sería el primer ``void run()``.
  
      Si se quiere tener acceso al método ``run`` de la Clase Local, hay que crear una instancia de dicha Clase.
  
      Declarar una Clase Local a un método
  
      ````java
      public class Enclosing {
          void run() {
              class Local {
                  void run() {
                      ...
                  }
              }
              Local local = new Local();
              local.run();
          }
      }
      ````
  
      Instanciar una Clase Local a un método
  
      ````java
      public class Main {
          public static void main(String[] args) {
          	Enclosing enclosing = new Enclosing();
              enclosing.run();
          }
      }
      ````
  
      Este tipo de Clases también consumen más espacio en memoria. Lo recomendable en estos casos es usar Clases estáticas anidadas para hacer un mejor uso de la memoria.



















