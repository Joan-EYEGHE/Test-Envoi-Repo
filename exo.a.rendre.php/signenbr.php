<?php
/*
Ecrire un script qui définit une fonction et une procédure qui permet
de déterminer le signe d'un nombre 
*/

function f_signe(int $a):string
{
    if($a>0){
       return "positif";
    }elseif($a<0){
        return "négatif";
      
    }else{
       return "null";
        
    }
    
}

function p_signe(int $a,&$e):void
{
    if($a>0){
        $e=" positif "; 
    
    }elseif($a<0){
        $e="négatif  "; 
    }else{
        $e="nul "; 
    }
    
}  
$a=rand(-10,10);
p_signe($a,$e);
echo("l'entier est $e");


?>