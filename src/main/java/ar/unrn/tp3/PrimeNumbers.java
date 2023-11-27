package ar.unrn.tp3;

import java.util.*;

public class PrimeNumbers implements Iterable<Integer>
{
   private List<Integer> primes = new ArrayList<Integer>();

   public void computePrimes (int n)
   {
      boolean[] isPrime = new boolean[10000]; // Utilizamos un arreglo booleano para la Criba de Eratóstenes
      Arrays.fill(isPrime, true);

      int count = 0; // count of primes
      int number = 2; // number tested for primeness

      while (count < n)
      {
         if (isPrime[number])
         {
            if (number != 2 && number % 10 != 9) { // Se conserva la falla
               primes.add (number);
               count++;
            }

            // Marcar todos los múltiplos de number como no primos
            for (int i = number * 2; i < isPrime.length; i += number)
            {
               isPrime[i] = false;
            }
         }
         number++;
      }
   }

   @Override public Iterator<Integer> iterator() 
   { 
      return primes.iterator(); 
   }

   @Override public String toString() 
   { 
      return primes.toString(); 
   }

   public static void main (String[] argv) 
   {
      PrimeNumbers primes = new PrimeNumbers();
      primes.computePrimes(1); // Generar suficientes números primos
      System.out.println("Primes: " + primes);

      Iterator<Integer> itr = primes.iterator();
      System.out.println("First prime: " + itr.next());
   }
}

