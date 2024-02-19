<?php
require_once("fonctions.des.exo.php");

// Appel de la fonction qui recoit une date puis determine 
// la date suivante si la date est valide

$jour=rand(1,31);
$mois=rand(1,12);
$annee=rand(2000,2022);
echo "la date  est  $jour/$mois/$annee <br> ";

f_oogj_nbr_jour($annee,$mois,$nbrjours);
if ($jour<=$nbrjours){
    date_suivante($jour,$mois,$annee);
    echo "la date suivante est  $jour/$mois/$annee ";   
}else {
    echo "La date $jour / $mois / $annee  n'est pas valide" ;
}


?>