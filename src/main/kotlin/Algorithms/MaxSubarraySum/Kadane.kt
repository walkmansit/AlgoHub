package Algorithms.MaxSubarraySum

import kotlin.math.max

class Kadane {

    companion object {

        fun findMaxSubarraySum(array: IntArray): Int {
            var tempSum = 0
            var bestSum = 0
            for (item in array) {
                tempSum = max(tempSum + item, item)
                bestSum = max(bestSum, tempSum)
            }

            return bestSum
        }
    }
}