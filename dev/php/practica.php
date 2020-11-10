<?php

echo "Introduzca un número: " ;
$numero1 = stream_get_line(STDIN, 1024, PHP_EOL);
echo "Introduzca un número: ";
$numero2 = stream_get_line(STDIN, 1024, PHP_EOL);
echo "El resultado es: " . $numero1/$numero2;
?>