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
  
- ### Enumerations

  Sirven para declarar una colección de constantes. Son muy útiles para representar un conjunto de cosas que no cambian, como por ejemplo los días de la semana.

  Para crear un Enumeration se usa la palabra reservada ``enum``.

  ````java
  public enum Day {
  	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
  	THURSDAY, FRIDAY, SATURDAY
  }
  ````

  Se pueden crear referencias de enumerations de la siguiente forma:

  ````java
  Day day;
  switch (day) {
  	case MONDAY:
  		System.out.println(“Mondays are good.”);
  		break;
  	case FRIDAY:
  		System.out.println(“Fridays are nice”);
  		break;
  	case SATURDAY: case: SUNDAY:
  		System.out.println(“Weekends are the best”);
  		break;
  	default:
  		System.out.println(“Midweek are so-so”);
  		break;
  }
  ````

  Se puede llamar un valor del enumeration así:

  ````java
  Day.MONDAY;
  Day.FRIDAY;
  Day.SATURDAY
  ````

  Los enumerations pueden tener atributos, métodos y constructores, como se muestra en el siguiente ejemplo:

  ````java
  public enum Day {
  	MONDAY("Lunes");
  	TUESDAY("Jueves");
  	FRIDAY("Viernes");
  	SATURDAY("Sábado");
  	SUNDAY("Domingo");
  
  	private String spanish;
  	private Day(String s) {
      	spanish = s;
    	}
  
  	private String getSpanish() {
  		return spanish;
    	}
  }
  ````

  Se pueden usar así:

  ````java
  System.out.println(Day.MONDAY); // Imprime MONDAY
  ````

  ````java
  System.out.println(Day.MONDAY.getSpanish()); // Imprime Lunes
  ````

  #### Diferencias entre Enumerations y Clases

  Un ``enum`` puede, al igual que una clase, tener atributos y métodos. La única diferencia es que las constantes del ``enum`` son ``public``, ``static`` y ``final`` (inmutables - no pueden ser anuladas).

  Un ``enum`` no puede utilizarse para crear objetos, y no puede extender otras clases (pero puede implementar interfaces).
  <h4>¿Por qué y cuándo usar los enum?</h4>

  Los enumerations son útiles cuando se tienen valores que se sabe que no van a cambiar, como los días del mes, los días, los colores, una baraja de cartas, etc.


## 📚 Módulo 3. Reutilizar Código

- ### ¿Qué es la Herencia? Don\'t repeat Yourself

  La **Herencia** permite crear nuevas Clases a partir de otras.

  En la herencia se establece una relación **padre e hijo**. A la clase padre se le conoce como **súper clase** y a sus clases hijas se les llama **subclases**.

  Si una clase es una especie de molde para crear objetos, en la herencia se hace algo así como "crear un molde para hacer moldes".

  ![Herencia](https://i.imgur.com/PKcznhI.png)

  > "Cuando se detectan características y comportamientos iguales se debe realizar una abstracción."

  #### DRY: Don\'t repeat Yourself

  - Promueve la reducción de la duplicación en programación.
  - Las piezas de información **nunca deben duplicarse**.
  - **Reduce la dificultad** en los cambios y evolución.

- ### Super y this

  La herencia se define con la siguiente sintaxis:

  ````java
  public class Doctor extends User { // User → Súper Clase
      
  }
  ````

  - #### Super 

    Indica que una variable o un método es de la Clase Padre (superclase).

  - #### this

    Permite especificar que la variable que esta señalando (``this.nombreVariable``) es de la misma Clase en que se usa.

    

- ### Polimorfismo: Sobreescritura de Métodos

  En Java hay una Clase de la que heredan todas las Clases, esa es la Clase Object. Esto permite usar una serie de métodos y atributos que proporciona la Clase Object.

  **Nota: ** en Java no se permite la herencia múltiple de Clases. Las Clases hijas sólo pueden tener una Clase padre.

  #### Sobrescritura 

  Cuando una Clase hereda de otra y **en la Clase hija se redefine un método** con una implementación distinta a la de la Clase padre.

  **Nota:** los métodos marcados como ``final`` o ``static`` no se pueden sobrescribir. 

  #### Sobrescritura de Constructores

  Un constructor en una subclase usando los miembros heredados de la superclase **con argumentos diferentes.**

  **Ejemplo:** sobrescribir el método ``toString()``.

  ````java
  @Override //  Indica que el método qu esta a continuación no es propio de la Clase y va a ser sobrescrito.
  public String toString() {
      return "User{" +
          "id=" + id +
          ", name='" + name + '\'' +
          ", email='" + email + '\'' +
          ", address='" + address + '\'' +
          ", phoneNumber='" + phoneNumber + '\'' +
          '}';
  }
  ````

  Usar el método con la sobrescritura:

  ````java
  System.out.println(myDoctor);
  /*
  Al imprimir cualquier objeto en la consola con System.out.println(object), en realidad, se esta ejecutando el método .toString() de dicho objeto, por lo que si se sobrescribe este método en una Clase, el resultado en la consola también cambiará automáticamente.
  */
  ````

  Se puede sobrescribir un mismo método en diferentes Clases y en cada una darle un comportamiento diferente. Por ejemplo después de sobrescribir el método ``toString()`` en el ejemplo anterior, se podría volver a sobrescribir dicho método para que muestre datos adicionales:

  ````java
  @Override
  public String toString() {
      return super.toString() + // return super.toString() → Retorna el método sobrescrito en la superclase para poder concaternarle los datos adicionales.
          "Age='" + birthday + '\'' +
          ", weight=" + getWeight() +
          ", height=" + getHeight() +
          ", blood='" + blood + '\'' +
          '}';
  }
  ````

- ### Polimorfismo: Sobreescribiendo el método toString

  El **polimorfismo** es la posibilidad de sobrescribir un método con **comportamientos diferentes.**

- ### Interfaces

  Es un tipo de referencia similar a una Clase que podría contener sólo constantes y definiciones de métodos. Una interfaz puede contener por ejemplo métodos que se repiten en varias Clases que no  pertenecen a la misma familia. Esa es su principal diferencia con respecto a la herencia entre Clases pues en esta las Clases que tienen un método en el que se aplican polimorfismo pertenecen a la misma familia y tienen a una superclase en común; por el contrario en las *interfaces* se pueden definir diferentes comportamientos para Clases que no tienen ninguna relación entre si y que pertenecen a familias diferentes.
  
  En las interfaces se establece la forma de una Clase (nombres de métodos, listas de argumentos y tipos de retorno) pero **no bloques de código**, por ejemplo en  una interfaz sólo se pondría la redacción de un método pero no su implementación pues esta será radicalmente diferente para cada Clase.
  
  #### Declarar una interfaz en Java
  
  ````java
  // Crear una interfaz
  public IScheduable {
      schedule(Date date, String Time);
  }
  
  // Implemtar una interfaz en una Clase
  public class AppointmentDoctor implements IScheduable {
      ...
  }
  ````
  
  
  
  **Nota:** es muy común que los nombres de las interfaces terminen en *"able"* (**ejemplos:** ``rundable``, ``printable``, ``readable``), esto se debe a que las interfaces se enfocan en las actividades que son redundantes en el código. También es común encontrar que el nombre de la interfaz comience con una "I".
  
- ### Creando una interfaz para definir si una fecha es agendable

  #### Composición de interfaces en Clases

  Es el proceso de añadirle comportamientos a una Clase mediante interfaces. Consiste en abstraer todos los métodos de una Clase y modularizarlos en una interfaz para poder reutilizarlos todas las veces que sean necesarias. Muchos desarrolladores hoy en día aconsejan usar la composición en lugar de la herencia pues en esta última la reutilización de código es lineal mientras que la composición se puede efectuar a cualquier Clase.
  
  #### POJOS (Plain Old Java Object)
  
  Es el nombre con el que se conocen las Clases con getters y setters.
  
  **Nota:** una de las peculiaridades de las interfaces es que se pueden implementar múltiples Interfaces a una Clase.
  
  ````java
  public class AppointmentNurse implements ISchedulable, Runable {
  	...
  }
  ````
  
  

- ### Collections

  Son un tipo de interfaz en Java que permite trabajar con colecciones de datos. Los Colletions sólo trabajan con Objetos, por lo que para trabajar primitivos con Colletions es necesario recurrir a las Clases Wrapper.

  A diferencia de los Arrays que tienen un tamaño fijo, los Collections tienen un tamaño dinámico.

  ![Estructura de un Collection](https://i.imgur.com/Nlpb8SH.png)

  El elemento más alto en la jerarquía es la interfaz **Collection**, la cuál tiene una series de métodos "básicos" donde su comportamiento será definido a medida que se vaya implementando a más elementos. De **Collection** se desprenden 2 interfaces principales **Set** y **List**.

  #### Set

  Caracteristicas:

  - Almacena objetos únicos, no repetidos.
  - La mayoría de las veces los objetos se almacenarán en desorden.
  - No hay índice.

  De Set a su vez se desprenden la Clase **HashSet**, la Interfaz **SortedSet** y a su vez de esta última se desprende la Clase **TreeSet**.

  - ##### HashSet

    Los elementos se guardan en **desorden** y gracias al mecanismo llamado hashing (obtiene un identificador del objeto) **permite almacenar objetos únicos.** 

  - ##### TreeSet

    Almacena **objetos únicos**, y gracias a su estructura de árbol el **acceso es sumamente rápido**.

  

  #### List

  Caracteristicas:

  - Puede almacenar objetos repetidos.
  - Los objetos se almacenan en orden secuencial.
  - Tenemos acceso al índice.

  De List se desprenden la Clase **ArrayList**, la Clase **Vector** y la Clase **LinkedList**.

  - ##### ArrayList

    Puede tener duplicados, no está sincronizada por lo tanto es más rápida.

  - ##### Vector

    Es sincronizada, los datos están más seguros pero es más lento.

  - ##### LinkedList

    Puede contener elementos duplicados, no está sincronizada (es más  rápida) al ser una estructura de datos doblemente ligada podemos añadir  datos por encima de la pila o por debajo.

    ![Explicación gráfica de una  estructura de datos doblemente ligada](https://i.imgur.com/NAa7Qmn.png)

    *↑ Explicación gráfica de una estructura de datos doblemente ligada*

    

  #### Map

  Tiene las siguientes implementaciones:

  - **HashTable**
  - **LinkedHashMap**
  - **HashMap**
  - **SortedMap** → **TreeMap**

  ![Estructura de un Map](https://i.imgur.com/iduGkKB.png)

  La interfaz **Map** no hereda de la interfaz Collection  porque representa una estructura de datos de Mapeo y no de colección  simple de objetos. Esta estructura es más compleja, pues cada elemento  deberá venir en pareja con otro dato que funcionará como la llave del  elemento.

  - ##### Declarar un Map

    ````java
    Map<Integer, String> map = new HashMap<Integer, String>();
    Map<Integer, String> treeMap = new TreeMap<Integer, String>();
    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
    ````

    Sólo se puede crear un Map con las implementaciones **HashMap**, **TreeMap** y **LinkedHashMap** dejando fuera *HashTable* y *SortedMap*. *SortedMap* estará fuera pues es una interfaz y *HashTable* ha quedado deprecada pues tiene métodos redundantes en otras clases. 

  - ##### Implenetaciones de Map

    - ###### HashMap

      Los elementos no se ordenan. No aceptan claves duplicadas ni valores nulos.

    - ###### LinkedHashMap

      Ordena los elementos conforme se van insertando; provocando que las búsquedas sean más lentas que las demás clases.

    - ###### TreeMap

      El Mapa lo ordena de forma “natural”. Por ejemplo, si la clave son  valores enteros (como luego veremos), los ordena de menos a mayor.

  - ##### Iterar las diferentes implementaciones de Map

    Para iterar las diferentes implementaciones de Map es necesario utilizar la interface **Iterator** y usar un bucle while para recorrer el Map.

    - ###### Para HashMap

      ````java
      // Imprimir el Map con un Iterador
      Iterator it = map.keySet().iterator();
      while(it.hasNext()){
        Integer key = it.next();
        System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
      }
      ````

    - ###### Para LinkedHashMap

      ````java
      // Imprimir el Map con un Iterador
      Iterator it = linkedHashMap.keySet().iterator();
      while(it.hasNext()){
        Integer key = it.next();
        System.out.println("Clave: " + key + " -> Valor: " + linkedHashMap.get(key));
      }
      ````

    - ###### Para TreeMap

      ````java
      // Imprimir el Map con un Iterador
      Iterator it = treeMap.keySet().iterator();
      while(it.hasNext()){
        Integer key = it.next();
        System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
      }
      ````

- ### ¿Qúe es un Deque?

  Un **deque** (usualmente pronunciado como *deck*) es una interfaz en Java que permite manejar datos en una estructura de datos doblemente ligada (también conocida como *una cola de doble terminación*). Esto último es una colección lineal de elementos en la que se pueden insertar y eliminar elementos al principio y al final de la colección. La interfaz Deque proporciona métodos para acceder a ambos lados de la instancia de Deque y realizar operaciones como insertar, borrar y recuperar elementos. Las clases ``ArrayDeque`` y ``LinkedList`` implementan la interfaz Deque.

  Los métodos de la interfaz Deque se dividen en las siguientes 3 partes:

  - #### Insertar

    Los métodos ``addfirst()`` y ``offerFirst()`` insertan elementos al principio de la instancia Deque. Los métodos ``addLast()`` y ``offerLast()`` insertan elementos al final de la instancia Deque. Cuando la capacidad de la instancia Deque está restringida, los métodos más apropiados son ``offerFirst()`` y ``offerLast()`` porque ``addFirst()`` podría no arrojar una excepción si está llena.

  - #### Eliminar

    Los métodos ``removeFirst()`` y ``pollFirst()`` eliminan elementos del principio de la instancia Deque. Los métodos ``removeLast()`` y ``pollLast()`` eliminan elementos del final. Los métodos ``pollFirst()`` y ``pollLast()`` devuelven nulos si el Deque está vacío mientras que los métodos ``removeFirst()`` y ``removeLast()`` lanzan una excepción si la instancia Deque está vacía.

  - #### Recuperar

    Los métodos ``getFirst()`` y ``peekFirst()`` recuperan el primer elemento de la instancia Deque. Estos métodos no eliminan el valor de la instancia Deque. De manera similar, los métodos ``getLast()`` y ``peekLast()`` recuperan el último elemento. Los métodos ``getFirst`()`` y ``getLast()`` lanzan una excepción si la instancia Deque está vacía mientras que los métodos ``peekFirst()`` y ``peekLast()`` devuelven NULL.

    ![Tabla de Métodos de la interfaz Deque](https://i.imgur.com/JwFOIau.jpg)

## 📚 Módulo 4. Aplicar Abstracción

- ### Clases Abstractas

  El **polimorfismo** se puede aplicar en la *herencia* sobrescribiendo métodos. n el caso de la implementación de Interfaces también se aplica el polimorfismo.

  Cuando se implementa una **Interfaz** sobre una Clase es necesario que dicha Clase implemente todos los métodos de la Interfaz. No obstante hay casos en los que hacer esto es no necesario y sólo no se ocupa implementar todos los métodos de una interfaz.

  En el caso la **Herencia**, cuando se sobrescribe un método, este hereda la implementación que tenía en la superclase, pero en ocasiones no se necesita heredar la implementación de un método. Otra situación que se puede presentar en la herencia es que no se quiere crear una instancia de una Clase padre ya que esta es muy genérica.

  Las **Clases abstractas** permiten solucionar los problemas citados anteriormente. Las Clases abstractas son una especie de combinación entre Interfaces y Herencia. En este tipo de Clases se puede definir que tipo de métodos son obligatorios de implementar y cuáles no y además no se crean instancias.

  ````java
  // Declarar una Clase abstracta
  public abstract class Figura {
      // Implementación
  }
  
  ````

// Usar una Clase abstracta
  class Triangulo extends Figura {
      // Implementación
  }
  ````
  

- ### Miembros abstractos

  Definir un método abstracto:

  ````java
  public abstract class Figurar {
      ... abstract void dibujate(); // Convierte al método en obligatorio
  }
  ````

  Los **métodos abstractos** son obligatorios, a diferencia de los demás métodos que tenga una Clase abstracta y que no estén declarados con la palabra reservada ``abstract`` los cuales serán opcionales.

  Se pueden tener Clases abstractas que tengan subclases que a su vez tengan métodos abstractos:

  ````java
  // Superclase
  public abstract class Figura {
      // Implementación
  }
  
  // Subclase
  abstract class Triangulo extends Figura {
      abstract void dibujate();
      // Para tener un método abstracto la clase también debe ser abstracta
  }
  
  // Clase hija de la subclase anterior
  class TrianguloIsosceles extends Triangulo {
      void dibujate() {
          // Dibujar triángulo isosceles
      }
  }
  ````

  #### Ejemplo de Polimorfismo en las Clases abstractas

  ````java
  // Superclase
  public abstract class User {
  	public abstract void showDataUser();   
  }
  
  // Main.java
  User user = new Doctor("Anahí", "anahí@santaclara.health");
  user.showDataUser();
  ````

  A pesar de que ``User`` es una Clase abstracta por lo que no puede ser instanciada, gracias al polimorfismo *"puede tomar la forma"* de la clase ``Doctor``, pudiendo convertirse en una instancia de dicha Clase.

- ### Clases Anónimas

  Son una especie de *hack* para instanciar Clases abstractas. Dicha instanciación es temporal, pues sólo esta vigente en el momento en que se hace la instanciación, no puede reutilizar en otra Clase el comportamiento definido en una Clase anónima.

  ````java
  User user1 = new User("Felipe Molina", "felipe@example.com") {
      @Override
      public void showDataUser() {
  		// Implementación
      }
  }
  
  user1.showDataUser();
  ````

  Las Clases anónimas se usan mucho en desarrollo para Android, para por ejemplo hacer un elemento clickeable. Usando una Clase anónima se puede agregar el método ``onClickListener`` y darle un comportamiento que sólo va a ser vigente para ese momento.

  Las Clases anónimas también se pueden usar con interfaces:

  ````java
  ISchedulable iSchedulable = new ISchedulable() {
      @Override
      public void schedule(Date date, String time) {
  
      }
  };
  
  ISchedulable iSchedulable1 = new AppointmentDoctor();
  iSchedulable1.schedule(...);
  ````

- ### Diferencias entre las Interfaces y las Clases Abstractas

  Las **interfaces** ahora cuentan con nuevos modificadores de acceso: ``default`` y ``private`` lo que significa que ahora se puede agregar comportamiento a los métodos de una interfaz, por lo que una interfaz tendrá métodos con implementación y otros sin implementación, exactamente igual que en una Clase abstracta.

  #### Diferencias

  - ##### Clases abstractas

    Se usan para definir subclases, por lo que siempre debe ser heredada para poder llamar y sobrescribir los métodos. La herencia de métodos se hace de forma lineal; se pueden heredar métodos abstractos y no abstractos. En resumen una Clase abstracta sirve para redefinir nuevas Clases sin tener que crear nuevos objetos. Las Clases abstractas a diferencia de las interfaces se centran más en los objetos

  - ##### Interfaces

    Se tienen métodos abstractos y no abstractos, dichos métodos pueden implementarse en familias de Clases distintas por lo que aquí la implementación de los métodos no es lineal. En resumen las interfaces se usan cuando se quiere crear métodos que se puedan implementar en muchas familias, considerando las acciones que pueden tener en común muchos objetos.

    ![Clases abstractas vs. Interfaces](https://i.imgur.com/ogOPI6L.png)

    **Nota:** una buena práctica es que el diseño de las apps siempre este orientado a interfaces y no a la implementación. Hay que concentrase en crear buenas abstracciones, encontrar comportamientos comunes, tratar de forma independiente los módulos. En otras palabras, hay que enfocarse más en los métodos (interfaz) que re-definir las clases (clase abstracta).

- ### Interfaces en Java 8 y 9

  La sintaxis de las interfaces cambio un poco a partir de Java 8 y 9.

  - #### Java 8

    Ya  no todos los métodos tiene que ser abstractos pues se cuenta con un nuevo modificador de acceso para los métodos, ``default``. Esto permite que los métodos dentro de una interfaz puedan tener implementación, y a su vez dicha implementación se puede reutilizar en cualquier Clase sin importar a que familia pertenezca. Este modificador ``default`` en las interfaces tiene las mismas reglas y restricciones que en en caso de los métodos convencionales, es decir puede ser accedido a nivel de la Clase y por Clases/Interfaces que estén dentro de otro paquete.

  - #### Java 9

    Se puede añadir el modificador de acceso ``private`` a los métodos de una Interfaz. Este modificador tiene las mismas restricciones que en el caso de los métodos convencionales, es decir, sólo puede ser accedido a nivel de la Clase. También permite hacer una implementación en el método de una Interfaz.

  ````java
  public interface MyInterface {
      default void defaultMethod() {
          privateMethod("Hello from the default method!")
      }
      
      private void privateMethod(final String string) {
          System.out.println(string);
      }
      
      void normalMethod();
  }
  ````

  Este tipo de interfaces son muy útiles al trabajar con bases de datos.

- ### Herencia en interfaces

  En las interfaces también se puede aplicar la herencia usando la palabra reservada ``extends``. En las interfaces la herencia funciona igual que en las Clases con la diferencia de que en las interfaces  si se puede tener herencia múltiple:

  ````java
  public interface IReadable {
  	public void read();
  }
  
  
  public interface Visualizable extends IReadable, Serializable {
  	public void setViewed();
  	public Boolean isViewed();
  	public String timeViewed();
  }
  ````

  Además gracias con los modificadores de acceso ``default`` y ``private`` traídos en Java 8 y 9 respectivamente ahora es posible sobrescribir métodos y añadirles comportamiento, si es el caso:

  ````java
  public interface Visualizable extends IReadable, Serializable {
  	public void setViewed();
  	public Boolean isViewed();
  	public String timeViewed();
  	
      @Override
          default void read() {
          // TODO Auto-generated method stub
      }
  }		
  ````

  **Nota: ** es una práctica nombrar los métodos de la forma más descriptiva posible, aún si quedan muy largos. En caso de que el nombre sea excesivamente largo hay que buscar una serie de palabras claves más cortas que describan lo que hace el método.













