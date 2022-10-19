# Sistema de asignación de salones del edificio de ingeniería de UPIICSA
Sistema para  la asignación de los salones del edificio de ingeniería de la Unidad Profesional Interdisciplinaria de Ingeniería y Ciencias Sociales y Administrativas usando el lenguaje de programación Java con el patrón de diseño MVC (Modelo Vista Controlador).

El sistema permite asignar 1973 secuencias de las 2 licenciaturas y de las 3 ingenierías que se imparten en esa unidad, también permite la generación de los horarios de todas las clases en los 50 salones.

![](https://upload.wikimedia.org/wikipedia/commons/4/4a/UPIICSA.jpg)

***Edificio de ingeniería UPIICSA***

## Capturas

![](https://brianmurillo.github.io/CienciasUPIICSA/img/portfolio/allocationsystem/salones1.jpg)

![](https://brianmurillo.github.io/CienciasUPIICSA/img/portfolio/allocationsystem/salones2.jpg)

![](https://brianmurillo.github.io/CienciasUPIICSA/img/portfolio/allocationsystem/salones3.jpg)

![](https://brianmurillo.github.io/CienciasUPIICSA/img/portfolio/allocationsystem/salones6.jpg)

![](https://brianmurillo.github.io/CienciasUPIICSA/img/portfolio/allocationsystem/salones8.jpg)

![](https://brianmurillo.github.io/CienciasUPIICSA/img/portfolio/allocationsystem/salones9.jpg)

## Tecnologias usadas 🛠️
- Java JDK 16.0.2
- Maven 3.8.5
- Interfaz de usuario Java Swing
- Libreria Apache POI 3.17
- IDE Apache Neatbeans 12.4

## Descarga

- Via Git
Clonar en tu maquina

``git clone https://github.com/BrianMurillo/SistemaAsignacionSalonesEdIngenieria``

## Instalación de Java
1. Descargar java desde la pagina oficial de ORACLE
[Descargar Java 16.0.2](https://www.oracle.com/java/technologies/javase/jdk16-archive-downloads.html)
Se debe seleccionar la siguiente opción
![](https://github.com/BrianMurillo/SistemaAsignacionSalonesEdIngenieria/blob/main/img_instalacion/install1.jpg?raw=true)

2. Crear una cuenta para proceder con la descarga
![](https://github.com/BrianMurillo/SistemaAsignacionSalonesEdIngenieria/blob/main/img_instalacion/install2.jpg?raw=true)

3. Instalar Java como cualquier otro programa

## Configurar variables de entorno
- Debe copiar la ruta donde se instalo java para posteriormente configurar las variables de entorno

![](https://github.com/BrianMurillo/SistemaAsignacionSalonesEdIngenieria/blob/main/img_instalacion/install6.jpg?raw=true)

![](https://github.com/BrianMurillo/SistemaAsignacionSalonesEdIngenieria/blob/main/img_instalacion/install9.jpg?raw=true)

### CMD

- Para comprobar que el procedimiento se hizo correctamente ejecutamos el siguiente comando y podremos ver que ya esta instalada la version 16.0.2

``C:\Users\user>java -version``
``java version "16.0.2" 2021-07-20 Java(TM) SE Runtime Environment (build  16.0.2+7-67) Java HotSpot(TM) 64-Bit Server VM (build 16.0.2+7-67, mixed mode, sharing)``

## Instalación de MVN

1. Entrar a la página oficial de Maven y dar clic en "Download”
2. Elegir la opción apache-maven-3.8.5-bin.zip

![](https://github.com/BrianMurillo/SistemaAsignacionSalonesEdIngenieria/blob/main/img_instalacion/install10.jpg?raw=true)

3. Creamos un carpeta llamada Maven y descomprimimos el archivo .zip en la siguiente dirección:

``C:\Program Files\``

### Configurar variables de entorno
- Debe copiar la ruta donde se instalo maven para posteriormente configurar las variables de entorno de la misma manera que se hizo con java.

![](https://github.com/BrianMurillo/SistemaAsignacionSalonesEdIngenieria/blob/main/img_instalacion/install14.jpg?raw=true)

![](https://github.com/BrianMurillo/SistemaAsignacionSalonesEdIngenieria/blob/main/img_instalacion/install16.jpg?raw=true)

- Para comprobar que el procedimiento se hizo correctamente ejecutamos el siguiente comando y podremos ver que ya esta instalada la version 3.8.1

``C:\Users\user>mvn -v``
``Apache Maven 3.8.1 (05c21c65bdfed0f71a2f2ada8b84da59348c4c5d) Maven home: C:\apache-maven-3.8.1\bin\..Java version: 16.0.2, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-16.0.2 Default locale: es_MX, platform encoding: Cp1252 OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"``

Una vez hecho las instalaciones se debera copiar la carpeta imgsistemasalones que contiene todas las imágenes que ocupara el sistema en la ruta raiz.
``C:\``

### Instalador
El instalador se encuentra en la carpeta instalador, y se instala como culquier programa.

### Colaboradores
- Desarrolladores

-Murillo Salas Brian [https://github.com/BrianMurillo](https://github.com/BrianMurillo)

-Baños Becerril Dante

- Documentación y testing

-Rebollar Gonzales Habraham Yael

-Campos Alba Eduardo



### Licencia 📄
