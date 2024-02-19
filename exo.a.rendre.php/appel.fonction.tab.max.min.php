<?php
require_once("fonctions.des.exo.php");

$t=[];
$n=rand(2,8);
min_max_tableau($t,$n,$max,$min);

foreach($t as $val){
    echo "$val   ";
}

echo "<br> le max est $max , et le min est $min";

?>