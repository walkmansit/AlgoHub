package Algorithms.MaxSubarraySum

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class MaxSubarraySum {

    private val array = intArrayOf(1,-5,34,6,-65,7,-6,9,11,-66)

    @Test
    fun divideAndConquerTest(){
        assertEquals(40,DivideAndConquer.findMaxSubarraySum(array) )
    }

    @Test
    fun winnerTest(){
        assertEquals(40,Kadane.findMaxSubarraySum(array) )
    }

}