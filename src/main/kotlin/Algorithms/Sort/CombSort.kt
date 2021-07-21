package Algorithms.Sort

fun combSort(array: Array<Int>) : Array<Int> {

    val factor = 1.247
    var step = (array.size-1) / factor

    while (step>=1){
        val stepInt = step.toInt()
        for (i in 0 until array.size - stepInt){
            if (array[i] > array[i+stepInt]){
                swap(array,i,i+stepInt)
            }
        }

        step/=factor
    }

    for (i in 0..array.size - 1){
        for (j in 0..array.size - i - 2){
            if (array[j] > array[j+1]){
                swap(array,j,j+1)
            }
        }

    }

    return array
}