<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Project/PHP/PHPProject.php to edit this template
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        // Variaveis
        $valor_hora = 8.5;
        $horas_trabalhaadas = 200;
        // Cálculo
        $salario_bruto = $valor_hora* $horas_trabalhadas;
        if ($salario_bruto < 2259.200){
            "Não vai pagar IR ";
        } else {
            echo "Vai pagar IR";
        }
        ?>
    </body>
</html>
