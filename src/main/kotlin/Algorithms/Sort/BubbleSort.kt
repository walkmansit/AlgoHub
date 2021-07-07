package Algorithms.Sort

fun bubbleSort(array: Array<Int>) : Array<Int> {

    for (i in array.indices){
        for (j in 0 until array.size - i - 1){
            if (array[j] > array[j+1]){
                val v = array[j]
                array[j] = array[j+1]
                array[j+1] = v
            }
        }

    }

    return array
}