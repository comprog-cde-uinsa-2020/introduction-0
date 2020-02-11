<?php
    
    function rectangle($s) {
      return ($s * $s);
    }
    
    print "Example using variable in c \n";
    $input = readline("Enter length of side : ");
    $s = intval($input); # store length in s

    print "the formula a = $s * $s";
    $a = rectangle($s); // calculate area; then store in a
    print "\n";
    
    $threshold = 100;

    print "\n";
    if ($s > ($threshold+1)) {
       print "size: $s more than threshold: $threshold";
    } else if ($s == $threshold) {
      print "size: $s equal with threshold: $threshold";
    } else {
      print "size: $s less than threshold: $threshold";       
    }

    print "\n";
    print "Area of Square = $a";
?>