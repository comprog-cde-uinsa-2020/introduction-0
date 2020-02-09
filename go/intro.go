package main

import "fmt"

func main() {

	var a, s int // variable 

    fmt.Println("Example using variable in go \n")
	fmt.Println("Enter length of side : ")
	fmt.Scanf("%d", &s)


	fmt.Println("the formula a = s * s")
    a = s * s // calculate area; then store in a
    fmt.Println("\n")

    fmt.Println("Area of Square = ", a)
}