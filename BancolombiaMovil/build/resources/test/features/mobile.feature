#language: es

Característica: Ingresar a la App Bancolombia

Escenario: Autenticacion exitosa en la App
    Dado que el usuario esta en la app Bancolombia
    Cuando ingresa los datos de login
    |user|contraseña|
    |ctapension01|1234|
    Entonces el podra ingresar exitasamente a los productos bancolombia