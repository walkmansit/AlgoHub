package Algorithms.Sort


fun swap(array: Array<Int>,i:Int, j:Int){
    val v = array[i]
    array[i] = array[j]
    array[j] = v
}

fun bubbleSort(array: Array<Int>) : Array<Int> {

    for (i in 0..array.size - 1){
        for (j in 0..array.size - i - 2){
            if (array[j] > array[j+1]){
                swap(array,j,j+1)
            }
        }

    }

    return array
}