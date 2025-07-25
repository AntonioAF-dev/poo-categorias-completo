﻿# poo-categorias-completo
 
# Programación Orientada a Objetos (POO) - Categorías

Este repositorio contiene el código y los ejemplos del proyecto "Categorías", desarrollado como parte de un curso de Programación Orientada a Objetos (POO).

## 📜 Descripción del Proyecto

El objetivo de este proyecto es aplicar los conceptos fundamentales de la POO para modelar y resolver un problema de negocio. A través de ejemplos prácticos, se exploran los pilares de la POO y cómo se implementan en diferentes lenguajes de programación.

## 📚 Temas Cubiertos

El proyecto abarca los siguientes temas de la Programación Orientada a Objetos:

* **Clases y Objetos:** Creación de modelos y sus instancias.
* **Métodos y Atributos:** Definición del comportamiento y las propiedades de los objetos.
* **Herencia:** Creación de nuevas clases basadas en clases existentes.
* **Polimorfismo:** Cómo los objetos de diferentes clases pueden responder al mismo mensaje.
* **Encapsulamiento:** Ocultación de los detalles de implementación de un objeto.
* **Abstracción:** Simplificación de sistemas complejos mediante el modelado de clases apropiadas.

## Estructura y Nombre de la Base de Datos del Proyecto

Nombre de la Base de Datos: poo_2025_1

### CREACION DE LA BASE DE DATOS Y TABLA

-- By AntonioAF-Dev
create database poo_2025_1;

use poo_2025_1;

create table categorias (
	id int primary key auto_increment,
    nombre varchar(150) not null,
    descripcion varchar(180)
);
