//334018207
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
The program functionality:
The program should get the number n n and do the following steps:
1)To find and print two prime numbers before n that would give n after multiplication.
2)To find and print two prime numbers that would result n after subtracting.
3)To print the exact amount of prime numbers that exist before n
4)To print prime decomposition of the n
5)To print the id
6)TO print the runtime
 */
 // pseudocode:
/* 1)The first function that would check which two number would give n
int p1
int p2
for int i = 2, i < n, i++)
if (isPrime(i) && isPrime(n - i))
print("<+> " +i +" + "+ (n - i) + " = " + n)
The function that checks if the number is prime or not
static boolean isPrime(int n)
if n <= 1
return false
for int i = 2; i * i <= root squared(n); i++
if n % i == 0
return false
2)This function would do exactly what the first one does but with subscription
int p3 = 2, p4;
while true -->
p4 = p3 + n;
if isPrime(p4) && isPrime(p3 //And condition if the two of them are true
print("<+> " + p4 + " - " + p3 + " = " + n)
p3 = p3 + 1
3)This function will give us the amount of the prime numbers
public static int countPrimes(int x)
int count = 0
for (int i = 2; i < x; i++)
if (isPrime(i))
count = count + 1
return count
4) The function that will return prime composition
public static ArrayList<Object> primeComposition (int n) {
ArrayList<Object> list = new ArrayList<>() // We need some kind of a list to put things in it
int divider = 2
int result = n
while (result > 1)
if (result % divider = 0) // if the remainder is 0 we won't even check
result = result / divider // The algo will try to divide the given number n by a number that will increase every step. In case action has succeeded we will add the result to the list.
list.add(divider)
divider = 2
else
divider += 1
return list

5) Print my id
print(my id)

6)Check the runtime
We will check the current time using System.current timeMills and we will do the same in the end of the code execution, then we will substructure one from another and get the actual time.

 */



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter your number");
        n = scanner.nextInt();
        long startTime = System.currentTimeMillis();

        if (n < 4 && n % 2 != 0) {
            System.out.println("we need to stop ");
            return;
        }

        //a
        int p1, p2;
        for (int i = 2; i < n; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println("<+> " +i +" + "+ (n - i) + " = " + n);
                break;
            }
        }

        //b
        int p3 = 2, p4;
        while (true) {
            p4 = p3 + n;
            if (isPrime(p4) && isPrime(p3)) {
                System.out.println("<+> " + p4 + " - " + p3 + " = " + n);
                break;
            }
            p3++;

        }
        System.out.println("<+> The exact amout of prime numbers between 0 and " + n +  "-->" + countPrimes(n));
        System.out.print("<+> The prime numbers that would result the n after multiplication ---> ");
        ArrayList<Object> prime = new ArrayList<>();
        int count = 0;
        prime = primeComposition(n);
        while (count < prime.size()) {
            if (count != prime.size()-1) {
                System.out.print(prime.get(count) + " * ");
            }else {
                System.out.print(prime.get(count) + " = " + n);
            }
                count += 1;
        }
        int ad = 3;
        System.out.println("");
        System.out.println("<+> My id : 334018207");

        long endTime = System.currentTimeMillis();
        long resulttime = (long) ((endTime-startTime));
        System.out.println("<+> The runtime in miliseconds = "  + resulttime);
    }

    //c
    public static int countPrimes(int x) {
        int count = 0;

        for (int i = 2; i < x; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;


    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

//d
    public static ArrayList<Object> primeComposition (int n) {
        ArrayList<Object> list = new ArrayList<>();
        int divider = 2;
        int result = n;
        while (result > 1){
            if (result % divider == 0) {
                result = result / divider;
                list.add(divider);
                divider = 2;
            } else {
                divider += 1;
            }
        }
        return list;


    }
}

