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

    val randomIdx = Random.nextInt(l,r+1)
    swap(array,randomIdx,r)

    val core = array[r]
    var less = l

    for (i in l..r) {
        if (array[i] <= core) {
            swap(array,less,i)
            less++
        }
    }
   return less-1
}

private fun findMedianeIdx(array: Array<Int>, l:Int, r:Int) : Int{
    val midIdx = l + (r-l)/2
    val start = array[l]
    val middle = array[midIdx]
    val end = array[r]
    return when{
        middle in start..end -> midIdx
        start in middle..end -> l
        else -> r
    }
}