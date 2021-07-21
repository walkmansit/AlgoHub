package Algorithms.Sort

fun selectionSort(array: Array<Int>) : Array<Int> {

    for (i in array.indices){
        var minPos = i
        for (j in i until array.size){
            if (array[j] < array[minPos]){
                minPos = j
            }
        }
        swap(array,minPos,i)
    }

    return array
}