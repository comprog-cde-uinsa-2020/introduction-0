<?php
    print "Example using variable in c \n";
    $input = readline("Enter length of side : ");
    $s = intval($input); # store length in s

    print "the formula a = $s * $s";
    $a = $s * $s; // calculate area; then store in a
    print "\n";
    
    print "Area of Square = $a";
?>