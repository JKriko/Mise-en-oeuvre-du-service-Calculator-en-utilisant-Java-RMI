L'interface Calculator est autre le contrat;on definit dans cette interface java les methodes qui devront etre exportees.

1- rmiregistry qui demarre le service de naming sur le localhost sur le port 1099 (qui est le port par defaut)

2-Demarrer le serveur(CalculatorServer) qui fait un rebing pour changer le nom rmiregsitry de l'objet instance de la classe CalculatorImpl

3-Demarrer l'application client qui fait un lookup dynamique du nom et obtient le stub puis invoque les methodes voulues qui seront executees du serveur
