package Algorithms.Sort

fun insertionSort(array:Array<Int>) : Array<Int> {

    var i = 1
    while (i < array.size){
        val key = array[i]

        var k = i - 1
        while (k >= 0 && array[k] > key){
            array[k+1] = array[k]
            k--
        }
        array[k+1] = key

        i++
    }

    return array
}