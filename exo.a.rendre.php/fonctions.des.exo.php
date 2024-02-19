<?php


function f_oogj_nbr_jour(int $a,int $m,&$nbrjours):void
{
if($m==2){
    if(($a%100==0 and $a%400==0)or ($a%100!=0 and $a%4==0)){
        $nbrjours=29;
    }else{
    $nbrjours=28;
    }
}elseif($m==4 or $m==6 or $m==9 or $m==11){
    $nbrjours=30;
}else{
    $nbrjours=31; 
}
}

// fonction qui recoit une date puis determine 
// la date suivante si la date est valide

// function date_suivante(&$jour,&$mois,&$annee):void
// {
//     f_oogj_nbr_jour($annee,$mois,$nbrjours);
//     if($jour<=$nbrjours){
//         if($jour==$nbrjours){
//             $jour=1;
//             $mois=$mois+1;
//             if ($mois>12){
//                 $annee=$annee+1;
//                 $mois=1;
//             }
//         }else{
//             $jour=$jour+1;
//         }
//     }
// }
function date_suivante(&$jour,&$mois,&$annee):void
{
    f_oogj_nbr_jour($annee,$mois,$nbrjours);
    if($jour<=$nbrjours){
        $jour=$jour+1;
        if($jour>$nbrjours){
            $jour=1;
            $mois=$mois+1;
            if ($mois>12){
                $annee=$annee+1;
                $mois=1;
            }
        }
    }else{
        echo "La date est invalide";
    }
}

// Ecrire une fonction qui determine le min 
// et le max d'un tableau 

function min_max_tableau (&$t,int $n, &$max,&$min ):void{
    $i=1;
    while ($i<=$n){
        $t[]=rand(-10,10);
        $i++;
    }
    $y=0;
    $max=-10;
    $min=10;
    while ($y<$n){
        if ($t[$y]>=$max){
            $max=$t[$y];
        }if($t[$y]<=$min){
            $min=$t[$y];
        }
        $y++;
    }
}

?>