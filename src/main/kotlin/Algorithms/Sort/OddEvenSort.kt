package Algorithms.Sort

fun oddEvenSort(array: Array<Int>) : Array<Int> {

    fun internalSort(startIdx:Int) : Boolean {
        var isSorted = true
        var i = startIdx

        while (i < array.size){
            if (i + 1 < array.size && array[i] > array[i+1] )
            {
                swap(array,i,i+1)
                isSorted = false
            }
            i++
        }

        return isSorted
    }

    var isSorted = false
    while (!isSorted){
        isSorted = internalSort(0) or internalSort(1)
    }
    return array
}