// Creating class for chcking conditions of LHS and RHS conditions

class Left_Right_Conditions

{

public static void main(String[]lrc)

{

int age = 25;
int age1 = 80;
boolean A = age < age1;

int price = 56;
int price1 = 58;
boolean  B = price < price1;

int distance = 15;
int distance1 = 15;
boolean C = distance < distance1;

// Printing Conditions to check

System.out.println("Condition result:" + A);
System.out.println("condition result:" + B);
System.out.println("Condition result:" + C);

}
}

/* 
Output
1: Compile Time: Success
2: Run Time: Success: Success: 

Condition result:true
condition result:true
Condition result:false

*/