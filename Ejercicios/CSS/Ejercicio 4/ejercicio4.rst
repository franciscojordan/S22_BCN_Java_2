¿Cuál es el peso de los siguientes selectores de CSS? ¿Cuál pesa más? ¿Cuál pesa menos?
---------------------------------------------------------------------------------------

Define el peso de cada uno de estos selectores y ordenadores de más específicos a menos específicos.
Aunque lo ideal es que lo calcules automáticamente mirando los apuntes, puedes comprobar posteriormente si
los resultados son correctos mirando algunos de los TIPS que se detallan más abajo.

**"*"**
=======
``0,0,0`` es el que menos peso tiene

**".container"**
================
``0,1,0`` 4ta porque es una clase sin mas

**".container href"**
=====================
``0,1,1`` 3ra porque es una clase y te indica especificamente el elemento

**"h1"**
========
``0,0,1`` 5ta porque es un elemento a secas

**"#titulo"**
=============
``1,0,0`` 2da con mas peso porque es una ID

**"!important"**
================
``0,0,1`` es la que mas peso tiene porque se declara como importante