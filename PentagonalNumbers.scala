/* Pentagonal Numbers
     (https://www.hackerrank.com/challenges/pentagonal-numbers/)
	 
	 Closed Form Solution

   Author: Bryan Thornbury

*/

object Solution {
    
    def printAnswer(N: Long) {
        if(N == 1)
            println(1)
        else{
            val I: Long = N - 2
            val D: Long = -2*(I + 1)
            val E: Long = D + 3*N*(I+1) 
            val F: Long = E - ( (3*I*(I+1)) / 2 ) + 1

            println(F)
        }
        
    }

    def main(args: Array[String]) {
        var i = 0
        for (ln <- io.Source.stdin.getLines) {
            if(i > 0)
                printAnswer(ln.toLong)
            i += 1
        }
    }
}