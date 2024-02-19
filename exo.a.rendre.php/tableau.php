 <?php

define ("MAX",100);
define ("MIN",50);
function p_man_decroissant(int $e1,int $e2,int $e3,&$Max,&$Min,&$Mil):void
{

if ($e1>$e2){
   $Max=$e1;
   $Min=$e2;

}else{
    $Max=$e2;
    $Min=$e1;
 
}if($Max<$e3){
    $Mil=$Max;
    $Max=$e3;   
}elseif($e3>$Min){
    $Mil=$e3;
}else{
    $Mil=$Min;
    $Min=$e3;
}

}
$e1=rand(MIN,MAX);
$e2=rand(MIN,MAX);
$e3=rand(MIN,MAX);
p_man_decroissant($e1, $e2,$e3,$Max,$Min,$Mil);
echo("L'odre décroissant est : " .$Max." ; ".$Mil." ; ".$Min);


?>
