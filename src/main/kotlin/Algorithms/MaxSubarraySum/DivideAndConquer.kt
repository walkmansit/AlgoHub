package Algorithms.MaxSubarraySum

class DivideAndConquer {

    companion object {

        fun findMaxSubarraySum(array: IntArray): Int {
            return findMaxSubarrayDiapason(array, 0, array.size - 1).third
        }

        private fun findMaxSubarrayDiapason(
            array: IntArray,
            low: Int,
            high: Int
        ): Triple<Int, Int, Int> { //left,right,sun
            if (low == high)
                return Triple(low, high, array[low])

            val mid = (low + high) / 2
            val leftValues = findMaxSubarrayDiapason(array, low, mid)
            val rightValues = findMaxSubarrayDiapason(array, mid + 1, high)
            val middleValues = findMaxSubarrayCrosslines(array, low, mid, high)

            return if (leftValues.third >= rightValues.third && leftValues.third >= middleValues.third)
                leftValues
            else if (rightValues.third >= leftValues.third && rightValues.third >= middleValues.third)
                rightValues
            else middleValues

        }

        private fun findMaxSubarrayCrosslines(
            array: IntArray,
            low: Int,
            mid: Int,
            high: Int
        ): Triple<Int, Int, Int> { //left,right,sun

            var leftSum = Int.MIN_VALUE
            var rightSum = Int.MIN_VALUE
            var leftIdx = mid
            var rightIdx = mid + 1

            if (low == high)
                return Triple(low, high, array[low])


            var sum = 0
            for (i in mid downTo low) {
                sum += array[i]
                if (sum > leftSum) {
                    leftIdx = i
                    leftSum = sum
                }
            }

            sum = 0
            for (i in mid + 1..high) {
                sum += array[i]
                if (sum > rightSum) {
                    rightIdx = i
                    rightSum = sum
                }
            }

            return Triple(leftIdx, rightIdx, leftSum + rightSum)
        }

    }
}
