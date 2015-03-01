#Ejercicio 9
#Comunicaciones en red. Servicios concurrentes.
Diseñar e implementar un servicio de chat sobre protocolo de transporte TCP. Los clientes se unen
al chat enviando el mensaje
JOIN [name]\n
siendo [name] el nombre de usuario que escoge el cliente. Los clientes abandonan el chat enviando
el mensaje:
LEAVE\n
Para enviar un mensaje el cliente enviará:
MESSAGE [message]\n
Una vez unido un cliente, todos los mensajes que envíe serán reenviados por el servidor a todos los
clientes unidos al chat (el cliente que envía el mensaje inclusive) enviando:
[name]> [message]\n
siendo [name] el nombre de usuario del cliente origen del mensaje. Cuando un cliente abandone el
chat, todos los demás recibirán el mensaje:
[name]> me piro.
Y cuando se una:
[name]> estoy dentro.
La entrada de mensajes se realizará a través de la entrada estándar. Si el mensaje que entra el
usuario tiene longitud cero, esto es, pulsa únicamente la tecla enter, entonces el cliente envía el
mensaje para abandonar el chat. Obviar cualquier situación que se aparte del protocolo descrito
como, por ejemplo, que dos usuarios se unan con el mismo [name].