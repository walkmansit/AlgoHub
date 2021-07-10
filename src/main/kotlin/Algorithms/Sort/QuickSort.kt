package Algorithms.Sort

import kotlin.random.Random

fun quickSort(array: Array<Int>) : Array<Int> {
    quickSortInternal(array,0,array.size-1)
    return array
}

private fun quickSortInternal(array: Array<Int>,l:Int,r:Int) {
    if (l<r) {
        val m = partition(array, l, r)
        quickSortInternal(array,l,m-1)
        quickSortInternal(array,m+1,r)
    }
}

private fun partition(array: Array<Int>, l:Int, r:Int) : Int{

    val core = array[Random.nextInt(l,r)]
    var less = l

    for (i in l..r) {
        if (array[i] <= core) {
            val v = array[less]
            array[less] = array[i]
            array[i] = v
            less++
        }
    }
   return less-1
}