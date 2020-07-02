Feature: Darle like a una cancion

  Scenario: Darle like a una cancion y validar que aumentan los likes
    Given El usuario navega a la pagina de home
    When el lista las canciones
    And le da click a la cancion numero 2
    And le da click a like song
    Then El numero de likes se incrementa

