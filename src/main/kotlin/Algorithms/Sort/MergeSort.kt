package Algorithms.Sort

fun mergeSort(array: Array<Int>) : Array<Int> {
    mergeSort(array,0,array.size-1)
    return array
}

private fun mergeSort(array: Array<Int>,l:Int,r:Int){

    if (l<r){
        val m = (r+l)/2
        mergeSort(array,l,m)
        mergeSort(array,m+1,r)
        union(array,l,m,r)

    }

}

private fun union(array: Array<Int>, l:Int, m:Int, r:Int){
    val n1 = m - l + 1
    val n2 = r - m

    val leftArr = Array(n1 + 1){ Int.MAX_VALUE}
    val rightArr = Array(n2 + 1){ Int.MAX_VALUE}

    for (i in 0 until  n1)
        leftArr[i] = array[l+i]

    for (i in 0 until n2)
        rightArr[i] = array[m+i+1]

    var i = 0
    var j = 0
    for (k in l..r){
        if (leftArr[i] < rightArr[j]){
            array[k] = leftArr[i]
            i++
        }
        else{
            array[k] = rightArr[j]
            j++
        }
    }
}